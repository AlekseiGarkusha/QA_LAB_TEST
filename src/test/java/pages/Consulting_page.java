package pages;

import io.qameta.allure.Step;

import static pages.Main_page.openLinks;

public class Consulting_page {
  Main_page mainPage = new Main_page();

  @Step("Переход на страницу - Консалтинг")
  public Main_page openMenuConsulting(String title) {
    return openLinks(value);
  }

}
