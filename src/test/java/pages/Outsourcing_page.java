package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static pages.Main_page.openLinks;

public class Outsourcing_page {
  Main_page mainPage = new Main_page();
  public Outsourcing_page openLinks(String title) {
    $$("li.menu-item a.nav-link")
      .findBy(text(title))
      .shouldBe(visible)
      .click();

    return this;
  }

  @Step("Переход на страницу - Аутсорсинг")
  public Outsourcing_page openMenuOutsourcing(String title, String value) {
    openLinks(title);

    return  this;
  }
}

