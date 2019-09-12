package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.WeakHashMap;

public class KatalogStep {

    @FindBy(xpath = "//ul[@class='products-grid']//*[@title]/ancestor::li")
    List<WebElement> productCollection;


    public void addProduct(String productName){

    }
}
