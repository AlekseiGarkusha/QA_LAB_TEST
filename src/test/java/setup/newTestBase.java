package setup;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;

public class newTestBase {


  @BeforeEach
  public void setUp() {
    RestAssured.baseURI = "https://selenoid.autotests.cloud";
  }

}
