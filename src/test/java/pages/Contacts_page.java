package pages;

import io.qameta.allure.Step;

import static pages.Main_page.openLinks;

public class Contacts_page {
  Main_page mainPage = new Main_page();

  @Step("Переход на страницу - Контакты")
  public Main_page openMenuContacts(String title) {
    return openLinks(value);
  }

}
