package pages;

import io.qameta.allure.Step;

public class Blog_page {
  Main_page mainPage = new Main_page();


  @Step("Переход на страницу - Блог")
  public Blog_page openMenuBlog(String title) {
    mainPage.openLinks(title);
    return this;
  }

}
