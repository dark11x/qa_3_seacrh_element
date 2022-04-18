import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestElement {

    @Test
    void SearchElements() {
        open("https://github.com/selenide/selenide");
        $(byText("Wiki")).click();
        $(byId("wiki-wrapper")).shouldHave(text("Soft assertions"));
        $(byText("Soft assertions")).click();
        $(byId("wiki-body")).shouldHave(text("Using JUnit5 extend test class:"));
    }
}
