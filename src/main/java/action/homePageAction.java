package action;

import object.homePage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import static config.config.driver;

/*
Code for Action Page
 */
public class homePageAction extends homePage {

    Actions actions = new Actions(driver);

    public homePageAction(){
        PageFactory.initElements(driver,this);
    }

    public void clickBtnBuy(){
        btnBuy.click();
    }

    public void scrollToCheckout(){
        actions.moveToElement(scrollCheckout);
        actions.perform();
    }

    public void clickBtnCheckout(){
        btnCheckout.click();
    }
}
