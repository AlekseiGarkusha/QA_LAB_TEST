public class Config {

  public static String propertyTest() {
    String environment = System.getProperty("environment");

    System.out.println("Test environment is: " + environment);
    return environment;
  }

  public static String propertyName() {
    String name = System.getProperty("name");
    System.out.println("My name is: " + name);
    return name;
  }

    return "https://" + login + ":" + password
      + "@selenoid.autotests.cloud/wd/hub";
  }

}
