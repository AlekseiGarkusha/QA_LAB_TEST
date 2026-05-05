package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class Main_page {

  public Main_page openLinks(String title) {
    $$("li.menu-item a.nav-link")
      .findBy(text(title))
      .shouldBe(visible)
      .click();

    return new Main_page();
  }

}
