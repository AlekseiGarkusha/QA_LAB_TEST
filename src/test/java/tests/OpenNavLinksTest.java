package tests;

import data.TestData;
import helpers.NavLinksCheck;
import io.qameta.allure.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.Page_navLinks;
import setup.TestBase;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class OpenNavLinksTest extends TestBase {
  Page_navLinks pageClientForm = new Page_navLinks();
  NavLinksCheck navLinksCheck = new NavLinksCheck();
  TestData testData = new TestData();

  @Test
  @Feature("Проверка на открытие страниц меню")
  @Epic("test")
  @Story("Проверка на открытие страниц меню")
  @Owner("AlexeyGarkusha")
  @Severity(SeverityLevel.BLOCKER)
  @DisplayName("Проверка на открытие страниц меню")
  public void signUpForAConsultation() throws InterruptedException {
    
    step("Проверка открытия страницы -'Аутсорсинг'", () -> {
      pageClientForm.openMenuOutsourcing(testData.linkOutsourcing);
      navLinksCheck.checkOpenPage(testData.titleOutsourcing,testData.linkOutsourcing);
    });

    step("Проверка открытия страницы - 'Консалтинг'", () -> {
      pageClientForm.openMenuConsulting(testData.linkConsulting);
      navLinksCheck.checkOpenPage(testData.titleConsulting, testData.linkConsulting);
    });

    step("Проверка открытия страницы - 'Кейсы'", () -> {
      pageClientForm.openMenuCases(testData.linkCases);
      navLinksCheck.checkOpenPage(testData.titleCases, testData.linkCases);
    });

    step("Проверка открытия страницы - 'Обучение'", () -> {
      pageClientForm.openMenuEducation(testData.linkEducation);
      navLinksCheck.checkOpenPage(testData.titleEducation, testData.linkEducation);
    });

    step("Проверка открытия страницы - 'Блог'", () -> {
      pageClientForm.openMenuBlog(testData.linkBlog);
      navLinksCheck.checkOpenPage(testData.titleBlog, testData.linkBlog);
    });

    step("Проверка открытия страницы - 'Контакты'", () -> {
      pageClientForm.openMenuContacts(testData.linkContacts);
      navLinksCheck.checkOpenPage(testData.titleContacts, testData.linkContacts);
    });

    step("Проверка открытия страницы - ''О нас'", () -> {
      pageClientForm.openMenuAboutUs(testData.linkAboutUs);
      navLinksCheck.checkOpenPage(testData.titleAboutUs, testData.linkAboutUs);
    });
  }
}
