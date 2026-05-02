package setup;

/* Расширяющий класс для:
 * Вход в систему
 * Открытие страницы
 * Закрытие страницы
 */

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;

import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

  @BeforeAll
  static void beforeAll() {
    ChromeOptions options = new ChromeOptions();
    baseUrl =  "https://quality-lab.ru/";
//    Configuration.browser = System.getProperty("browser", "chrome");
    Configuration.browserSize = System.getProperty("remoteBrowserSize", "1920x1080");
    Configuration.browserVersion = System.getProperty("browserVersion", "128.0");
    Configuration.headless = Boolean.parseBoolean(System.getProperty("headless", "false"));
    Configuration.pageLoadStrategy = "eager";
//
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("selenoid:options", Map.<String, Object>of(
      "enableVNC", true,
      "enableVideo", true
    ));
    Configuration.remote = System.getProperty("user1", "1234");
    Configuration.browserCapabilities = options;
  }

  @BeforeEach
  void addListener() {
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    Configuration.proxyEnabled = true; // Включаем прокси
    open(baseUrl);
    // Добавляем слушатель WebSocket

  }

//  @BeforeEach
//  protected void open(String baseUrl) {
//
//  }

  @AfterEach
  void addAttachments() {
    closeWebDriver();
  }
}
