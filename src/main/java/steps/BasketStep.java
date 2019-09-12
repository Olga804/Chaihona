package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BasketStep {
    @FindBy(xpath = "//table[@id = 'shopping-cart-table']//td[@class='product-name']//a[contains(@href,'product')]")
    List<WebElement> shoppingCartTable;
}
