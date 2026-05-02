package helpers;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$$;

public class NavLinksCheck {

  public NavLinksCheck checkOpenPage(String title, String linkName) {
    $$(byText(title))
      .findBy(visible)
      .shouldBe(
        visible.because("Страница '" + linkName + "' не открыта"),
        Duration.ofSeconds(10)
      );

    return this;
  }

}
