package pages;

import io.qameta.allure.Step;


public class AboutUs_page {
  Main_page mainPage = new Main_page();

  @Step("Переход на страницу - О нас")
  public AboutUs_page openMenuAboutUs(String value) {
    mainPage.openLinks(value);

    return this;
  }
}
