import config.BaseTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsPageTests extends BaseTest {

  @Test
  void shouldContainExamplesForJUnit5Test() {

    String linkTitle = "JUnit5 extension - ";
    String link = "com.codeborne.selenide.junit5.SoftAssertsExtension";
    String exampleTitle = "Using JUnit5 extend test class:";
    String exampleCode = "@ExtendWith({SoftAssertsExtension.class})\n" +
            "class Tests {\n" +
            "  @Test\n" +
            "  void test() {\n" +
            "    Configuration.assertionMode = SOFT;\n" +
            "    open(\"page.html\");\n" +
            "\n" +
            "    $(\"#first\").should(visible).click();\n" +
            "    $(\"#second\").should(visible).click();\n" +
            "  }\n" +
            "}";

    open("https://github.com/selenide/selenide");
    $("[data-content='Wiki']").click();
    $$("#wiki-pages-box li").findBy(text("SoftAssertions")).click();

    $$("#wiki-body li").findBy(text(linkTitle)).shouldBe(visible);
    $$("#wiki-body li code").findBy(text(link)).shouldBe(visible);
    $$("#wiki-body li").findBy(text(exampleTitle)).shouldBe(visible);
    $$("#wiki-body pre").findBy(text(exampleCode)).shouldBe(visible);
  }
}
