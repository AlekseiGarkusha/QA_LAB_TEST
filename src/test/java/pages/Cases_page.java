package pages;

import io.qameta.allure.Step;

public class Cases_page {
  Main_page mainPage = new Main_page();

  @Step("Переход на страницу - Кейсы")
  public Cases_page openMenuCases(String title) {
    mainPage.openLinks(title);

    return this;
  }

}
