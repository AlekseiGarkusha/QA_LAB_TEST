package pages;

import io.qameta.allure.Step;

public class Blog_page {
  Main_page mainPage = new Main_page();

  @Step("Переход на страницу - Блог")
  public Main_page openMenuBlog(String title) {

    return openLinks(value);
  }

}
