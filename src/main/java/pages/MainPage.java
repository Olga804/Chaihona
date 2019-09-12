package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.WeakHashMap;

public class MainPage extends BasePage {

    @FindBy(xpath = "//ul[@id='desktopMenuMain']//a[contains(text())]")
    List<WebElement> mainMenuItem;
    @FindBy(xpath = "//ul[@id='desktopMenuMain']//a[contains(text())]" )
    List<WebElement> subMenuItem;


    @FindBy(xpath = "//a[contains(@title,'Перейти в корзину')]")
    List<WebElement> goToCard;

    public void selectMainMenuItem(String name){
        String string = String.format("//ul[@id='desktopMenuMain']//a[contains(text(),'%s')]",name);
        for (WebElement item:
             mainMenuItem) {
            if(item.isDisplayed()){
                if(item.getText().equalsIgnoreCase(name)){
                    item.click();
                    return;
                }
            }


        }

    }
    public void pressPlov(String name){
        String string = String.format("//ul[@id='desktopMenuMain']//a[contains(text(),'%s')]",name);
        for (WebElement item:
             subMenuItem) {
            Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
            wait.until(ExpectedConditions.visibilityOf(item));
            if(item.getText().equalsIgnoreCase(name)){
            item.click();
            return;
            }
        }
    }

    public void goToCart(){
        goToCard.click();
    }
}
