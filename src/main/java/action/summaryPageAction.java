package action;

import object.summaryPage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import static config.config.driver;

/*
Code for Action Page
 */
public class summaryPageAction extends summaryPage {

    Actions actions = new Actions(driver);

    public summaryPageAction(){
        PageFactory.initElements(driver,this);
    }

    public void inFrame(){
        driver.switchTo().frame(iFrame);
    }

    public void clickShippingDetails(){
        shippingDetails.click();
    }

    public void clickBtnContinue(){
        btnContinue.click();
    }

    public void clickBtnPayment(){
        btnPayment.click();
    }

    public void inputTxtCardNumberSuccess(){
        txtCardNumber.sendKeys("4811 1111 1111 1114");
    }

    public void inputTxtCardNumberFailed(){
        txtCardNumber.sendKeys("4911 1111 1111 1113");
    }

    public void inputTxtExpiryDate(){
        txtExpiryDate.sendKeys("1220");
    }

    public void inputTxtCVV(){
        txtCVV.sendKeys("123");
    }

    public void scrollToPayment(){
        actions.moveToElement(scrollPayment);
        //actions.perform();
    }

    public void clickBtnPay(){
        btnPay.click();
    }
}
