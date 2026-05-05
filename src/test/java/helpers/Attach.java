package helpers;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.net.URL;
import java.nio.charset.StandardCharsets;

import static org.openqa.selenium.logging.LogType.BROWSER;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.InputStream;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Attach {

  @Attachment(value = "{attachName}", type = "image/png")
  public static byte[] screenshotAs(String attachName) {
    return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
  }

  @Attachment(value = "Page Source", type = "text/plain")
  public static byte[] pageSource() {
    return getWebDriver().getPageSource().getBytes(StandardCharsets.UTF_8);
  }

  @Attachment(value = "{attachName}", type = "text/plain")
  public static String attachAsText(String attachName, String message) {
    return message;
  }

  public static void browserConsoleLogs() {
    attachAsText(
      "Browser console logs",
      String.join("\n", Selenide.getWebDriverLogs(BROWSER))
    );
  }

  /**
   * Прикрепляет видео из Selenoid как бинарный файл
   */
  @Attachment(value = "Video", type = "video/mp4")
  public static byte[] addVideo() {
    try {
      String sessionId = getSessionId();
      if (sessionId == null) {
        System.err.println("Не удалось получить sessionId — видео не будет прикреплено");
        return new byte[0];
      }

      URL videoUrl = new URL(getVideoUrlString(sessionId));
      InputStream videoStream = waitForVideo(videoUrl, Duration.ofSeconds(30));

      if (videoStream != null) {
         
        return videoStream.readAllBytes();
      } else {
        System.err.println("Видео не появилось в течение 30 секунд — пропуск");
        return new byte[0];
      }
    } catch (Exception e) {
      System.err.println("Ошибка при прикреплении видео: " + e.getMessage());
      return new byte[0];
    }
  }

  private static String getSessionId() {
    try {
      WebDriver driver = WebDriverRunner.getWebDriver();
      if (driver instanceof RemoteWebDriver) {
        return ((RemoteWebDriver) driver).getSessionId().toString();
      }
      return null;
    } catch (Exception e) {
      return null;
    }
  }

  private static String getVideoUrlString(String sessionId) {
    return System.getProperty("remote", "https://selenoid.autotests.cloud")
      .replace("/wd/hub", "") + "/video/" + sessionId + ".mp4";
  }

  private static InputStream waitForVideo(URL videoUrl, Duration timeout) throws Exception {
    long startTime = System.currentTimeMillis();
    while (System.currentTimeMillis() - startTime < timeout.toMillis()) {
      try (InputStream is = videoUrl.openStream()) {
        return is;
      } catch (java.io.FileNotFoundException e) {
        TimeUnit.SECONDS.sleep(1);
      }
    }
    return null;
  }

  private static WebDriver getWebDriver() {
    return WebDriverRunner.getWebDriver();
  }
}
