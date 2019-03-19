package tests;

import core.SetUpTests;
import org.testng.annotations.Test;
import pages.MainPage;

public class MainPageTest extends SetUpTests {

    private MainPage mainPage;

    @Test
    public void shouldGoOnMainPage() {
        mainPage = openMainPage();
    }

}
