package pages;

import io.qameta.allure.Step;

public class Contacts_page {
  Main_page mainPage = new Main_page();

  @Step("Переход на страницу - Контакты")
  public Contacts_page openMenuContacts(String title) {
    mainPage.openLinks(title);

    return this;
  }

}
