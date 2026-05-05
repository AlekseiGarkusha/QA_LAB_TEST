package pages;

import io.qameta.allure.Step;

public class Education_page {
  Main_page mainPage = new Main_page();

  @Step("Переход на страницу - Обучение")
  public Main_page openMenuEducation(String title) {
    return openLinks(value);
  }

}
