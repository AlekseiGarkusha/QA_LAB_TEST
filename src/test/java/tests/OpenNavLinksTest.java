package tests;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.WithText;
import data.TestData;
import helpers.Attach;
import helpers.NavLinksCheck;
import io.qameta.allure.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;
import setup.TestBase;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class OpenNavLinksTest extends TestBase {
  TestData testData = new TestData();
  Outsourcing_page outsourcingPage = new Outsourcing_page();
  Consulting_page consultingPage = new Consulting_page();
  Cases_page casesPage = new Cases_page();
  Education_page educationPage = new Education_page();
  Blog_page blogPage = new Blog_page();
  Contacts_page contactsPage = new Contacts_page();
  AboutUs_page aboutUsPage = new AboutUs_page();

  @Test
  @Feature("Отрытие страницы Аутсорсинг")
  @Epic("test")
  @Owner("AlexeyGarkusha")
  @Severity(SeverityLevel.BLOCKER)
  @Attachment
  public void openPageOutsourcing() {
    outsourcingPage.openMenuOutsourcing(testData.linkOutsourcing);

    step("проверка на наличие заголовка", () -> {
      SelenideElement findTitle = $(withText(testData.linkOutsourcing));
      Assertions.assertTrue(findTitle.exists(), "Страница - " + testData.titleOutsourcing + "  не открылась");
    });
  }

  @Test
  @Feature("Отрытие страницы Консалтинг")
  @Epic("test")
  @Owner("AlexeyGarkusha")
  @Severity(SeverityLevel.BLOCKER)
  public void openPageConsulting() {
    consultingPage.openMenuConsulting(testData.linkConsulting);

    step("Проверка на наличие заголовка", () -> {
      SelenideElement findTitle = $(withText(testData.titleConsulting));
      Assertions.assertTrue(findTitle.exists(), "Страница - " + testData.titleConsulting + "  не открылась");
    });
  }

  @Test
  @Feature("Отрытие страницы Кейсы")
  @Epic("test")
  @Owner("AlexeyGarkusha")
  @Severity(SeverityLevel.BLOCKER)
  public void openPageCases() {
    casesPage.openMenuCases(testData.linkCases);

    step("Проверка на наличие заголовка", () -> {
      SelenideElement findTitle = $(withText(testData.titleCases));
      Assertions.assertTrue(findTitle.exists(), "Страница - " + testData.titleCases + "  не открылась");
    });
  }

  @Test
  @Feature("Отрытие страницы Обучение")
  @Epic("test")
  @Owner("AlexeyGarkusha")
  @Severity(SeverityLevel.BLOCKER)
  public void openPageEducation() {
    educationPage.openMenuEducation(testData.linkEducation);

    step("Проверка на наличие заголовка", () -> {
      SelenideElement findTitle = $(withText(testData.titleEducation));
      Assertions.assertTrue(findTitle.exists(), "Страница - " + testData.titleEducation + "  не открылась");
    });
  }

  @Test
  @Feature("Отрытие страницы Блог")
  @Epic("test")
  @Owner("AlexeyGarkusha")
  @Severity(SeverityLevel.BLOCKER)
  public void openPageBlog() {
    blogPage.openMenuBlog(testData.linkBlog);

    step("Проверка на наличие заголовка", () -> {
      SelenideElement findTitle = $(withText(testData.titleBlog));
      Assertions.assertTrue(findTitle.exists(), "Страница - " + testData.titleBlog + "  не открылась");
    });
  }

  @Test
  @Feature("Отрытие страницы Контакты")
  @Epic("test")
  @Owner("AlexeyGarkusha")
  @Severity(SeverityLevel.BLOCKER)
  public void openPageContacts() {
    contactsPage.openMenuContacts(testData.linkContacts);

    step("Проверка на наличие заголовка", () -> {
      SelenideElement findTitle = $(withText(testData.titleContacts));
      Assertions.assertTrue(findTitle.exists(), "Страница - " + testData.titleContacts + "  не открылась");
    });
  }

  @Test
  @Feature("Отрытие страницы О нас")
  @Epic("test")
  @Owner("AlexeyGarkusha")
  @Severity(SeverityLevel.BLOCKER)
  public void openPageAboutUs() {
    aboutUsPage.openMenuAboutUs(testData.linkAboutUs);

    step("Проверка на наличие заголовка", () -> {
      SelenideElement findTitle = $(withText(testData.titleAboutUs));
      Assertions.assertTrue(findTitle.exists(), "Страница - " + testData.titleAboutUs + "  не открылась");
    });
  }

}
