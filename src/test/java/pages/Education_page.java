package pages;

import io.qameta.allure.Step;

public class Education_page {
  Main_page mainPage = new Main_page();

  @Step("Переход на страницу - Обучение")
  public Education_page openMenuEducation(String title) {
    mainPage.openLinks(title);

    return this;
  }

}
