package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import setup.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class fillForm extends TestBase {

  @Test
  @Feature("Отправка формы клиента")
  @Epic("test")
  @Story("Отправка формы клиента")
  @Owner("AlexeyGarkusha")
  @Severity(SeverityLevel.BLOCKER)
  @DisplayName("Отправка формы клиента")

  public void clientForm() throws InterruptedException {
    $("a.ql-button").shouldHave(Condition.text("Обсудить проект")).click();
    Thread.sleep(3000);

    $(".modal-body").shouldBe(visible);
    $("input[name='your-name']").setValue("Иван Иванов");

//    $("a[data-target='#discussProject']").click();
//    $("#discussProject").shouldBe(Condition.visible);
//    $(".modal.show").shouldBe(Condition.visible);
//    $("input[name='your-name']")
//      .shouldBe(Condition.visible)
//      .setValue("test");

//    $(".modal-content").shouldBe(Condition.visible);
//
//    $("input[name='your-name']")
//      .shouldBe(Condition.visible)
//      .setValue("test");

    Thread.sleep(3000);
  }

}
