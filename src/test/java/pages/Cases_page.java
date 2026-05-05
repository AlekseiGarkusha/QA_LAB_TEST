package pages;

import io.qameta.allure.Step;

public class Cases_page {
  Main_page mainPage = new Main_page();

  @Step("Переход на страницу - Кейсы")
  public Main_page openMenuCases(String title) {
    return openLinks(value);
  }

}
