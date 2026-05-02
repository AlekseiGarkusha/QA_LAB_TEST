package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class Page_navLinks {

  private Page_navLinks openLinks(String linkName) {
    $$("li.menu-item a.nav-link")
      .findBy(text(linkName))
      .shouldBe(visible)
      .click();

    return this;
  }

  @Step("Переход на страницу - Аутсорсинг")
  public Page_navLinks openMenuOutsourcing(String value) {
    return  openLinks(value);}

  @Step("Переход на страницу - Консалтинг")
  public Page_navLinks openMenuConsulting(String value) {
    return openLinks(value);
  }

  @Step("Переход на страницу - Кейсы")
  public Page_navLinks openMenuCases(String value) {
    return openLinks(value);
  }

  @Step("Переход на страницу - Обучение")
  public Page_navLinks openMenuEducation(String value) {
    return openLinks(value);
  }

  @Step("Переход на страницу - Блог")
  public Page_navLinks openMenuBlog(String value) {
    return openLinks(value);
  }

  @Step("Переход на страницу - Контакты")
  public Page_navLinks openMenuContacts(String value) {
    return openLinks(value);
  }

  @Step("Переход на страницу - О нас")
  public Page_navLinks openMenuAboutUs(String value) {return openLinks(value);}
}
