package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class BasePage {

WebDriver driver = BaseSteps.getDriver();

    public BasePage() {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
