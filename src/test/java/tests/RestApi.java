package tests;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasKey;

public class RestApi {

  @Test
  void test() {
    given()
      .log().all()
      .when()
      .get("https://selenoid.autotests.cloud/wd/hub/status")
      .then()
      .log().all()
      .statusCode(200)
      .body("browsers.chrome", hasKey("127.0"))
      .body("browsers.chrome", hasKey("128.0"));
  }




}
