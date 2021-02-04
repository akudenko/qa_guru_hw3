package config;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

  @BeforeAll
  public static void setup() {
    Configuration.startMaximized = true;
  }
}
