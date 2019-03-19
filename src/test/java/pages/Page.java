package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static core.SetUpTests.driver;

abstract class Page {

    protected WebDriverWait wait;

    protected Page() {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 5);
    }
}
