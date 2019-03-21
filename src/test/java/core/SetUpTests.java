package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.MainPage;

import static org.assertj.core.api.Assertions.assertThat;

public class SetUpTests {

    private PropertiesReader propertiesReader = new PropertiesReader();
    public static WebDriver driver;

    @BeforeSuite
    protected void setUpTests() {
        switch (propertiesReader.getBrowser()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
        }
    }

    protected MainPage openMainPage() {
        driver.get(propertiesReader.getAppUrl());
        driver.manage().window().maximize();
        assertThat(driver.getCurrentUrl()).isEqualTo(propertiesReader.getAppUrl());
        return new MainPage();
    }

    @AfterSuite
    protected void tearDownDriver() {
        driver.quit();
    }
}
