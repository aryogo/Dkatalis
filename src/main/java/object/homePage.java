package object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
Code for Object Element Page
 */
public class homePage {
    @FindBy(xpath = "//a[@class='btn buy']")
    public WebElement btnBuy;

    @FindBy(xpath = "//td[contains(text(),'Postal Code')]")
    public static WebElement scrollCheckout;

    @FindBy(xpath = "//div[@class='cart-checkout']")
    public static WebElement btnCheckout;
}
