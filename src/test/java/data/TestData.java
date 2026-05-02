package data;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {
  Faker faker = new Faker();
  public Faker fakerRu = new Faker(new Locale("ru"));

    public String
      titleOutsourcing = "Независимое тестирование ваших программных продуктов",
      titleConsulting = "Аутсорсинг тестирования и обеспечения качества ПО",
      titleCases = "Кейсы проектов",
    titleEducation = "Курсы тестировщиков",
    titleBlog = "Блог",
    titleContacts = "Контакты",
    titleAboutUs = "Аутсорсинг тестирования и обеспечения качества ПО";

  public String
    linkOutsourcing = "Аутсорсинг",
    linkConsulting = "Консалтинг",
    linkCases = "Кейсы",
    linkEducation = "Обучение",
    linkBlog = "Блог",
    linkContacts = "Контакты",
    linkAboutUs = "О нас";

}
