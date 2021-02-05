import config.BaseTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTests extends BaseTest {

  @Test
  void shouldContainChangedRectangles() {
    open("https://the-internet.herokuapp.com/drag_and_drop");
    $("#column-a").dragAndDropTo("#column-b");

    $("#column-a header").shouldHave(text("B"));
    $("#column-b header").shouldHave(text("A"));
  }
}
