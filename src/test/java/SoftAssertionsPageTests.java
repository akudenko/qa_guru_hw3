import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import config.BaseTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsPageTests extends BaseTest {

  @Test
  void shouldContainExamplesForJUnit5Test() {

    String linkTitle = "JUnit5 extension - ";
    String link = "com.codeborne.selenide.junit5.SoftAssertsExtension";
    String exampleTitle = "Using JUnit5 extend test class:";

    open("https://github.com/selenide/selenide");
    $("[data-content='Wiki']").click();

    $$("#wiki-pages-box li").findBy(text("SoftAssertions")).click();
    $$("#wiki-body li").findBy(text(linkTitle)).shouldBe(visible);
    $$("#wiki-body li code")
            .findBy(text(link))
            .shouldBe(visible);
    $$("#wiki-body li").findBy(text(exampleTitle)).shouldBe(visible);
  }
}
