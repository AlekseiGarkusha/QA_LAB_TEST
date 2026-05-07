package pages;

import io.qameta.allure.Step;

public class Outsourcing_page {
  Main_page mainPage = new Main_page();

  @Step("Переход на страницу - Аутсорсинг")
  public Outsourcing_page openMenuOutsourcing(String title) {
    mainPage.openLinks(title);

    return this;
  }
}
