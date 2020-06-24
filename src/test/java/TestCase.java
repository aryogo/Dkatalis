import action.ccPageAction;
import action.homePageAction;
import action.summaryPageAction;
import com.google.common.annotations.VisibleForTesting;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sun.awt.windows.ThemeReader;

public class TestCase extends config.config {
    homePageAction hp;
    summaryPageAction sp;
    ccPageAction cp;

    @BeforeTest
    public void start(){
        //init config
        init();
        hp = new homePageAction();
        sp = new summaryPageAction();
        cp = new ccPageAction();
    }

    @Test (priority = 1)
    public void testSuccess() throws InterruptedException {
        //script to click button "Buy Now"
        hp.clickBtnBuy();
        //delay 2s
        sleep();
        //script to scroll page in "Shopping Cart"
        hp.scrollToCheckout();
        //delay 2s
        sleep();
        //script to click button "Checkout"
        hp.clickBtnCheckout();

        //script into inframe popup
        sp.inFrame();
        //delay 2s
        sleep();
        //script to click "Shipping Details"
        sp.clickShippingDetails();
        //delay 2s
        sleep();
        //script to click button "Continue"
        sp.clickBtnContinue();
        //delay 2s
        sleep();
        //script to select payment method as "Credit Card"
        sp.clickBtnPayment();
        //delay 2s
        sleep();
        //script to input "Card Number"
        sp.inputTxtCardNumberSuccess();
        //delay 2s
        sleep();
        //script to input "Expiry Date"
        sp.inputTxtExpiryDate();
        //delay 2s
        sleep();
        //script to input "CVV"
        sp.inputTxtCVV();
        //delay 2s
        sleep();
        //script to scroll page in Payment Credit Card Page
        sp.scrollToPayment();
        //delay 2s
        sleep();
        //script to click button "Pay Now"
        sp.clickBtnPay();

        //script into Bank OTP Validation inframe Popup
        cp.inFrameCC();
        //delay 2s
        sleep();
        //script to input "Password/OTP"
        cp.inputTxtPwd();
        //delay 2s
        sleep();
        //script to click button "Ok"
        cp.clickBtnOk();

        //delay 5s
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void testFailed() throws InterruptedException {
        //script to click button "Buy Now"
        hp.clickBtnBuy();
        //delay 2s
        sleep();
        //script to scroll page in "Shopping Cart"
        hp.scrollToCheckout();
        //delay 2s
        sleep();
        //script to click button "Checkout"
        hp.clickBtnCheckout();

        //script into inframe popup
        sp.inFrame();
        //delay 2s
        sleep();
        //script to click "Shipping Details"
        sp.clickShippingDetails();
        //delay 2s
        sleep();
        //script to click button "Continue"
        sp.clickBtnContinue();
        //delay 2s
        sleep();
        //script to select payment method as "Credit Card"
        sp.clickBtnPayment();
        //delay 2s
        sleep();
        //script to input "Card Number"
        sp.inputTxtCardNumberFailed();
        //delay 2s
        sleep();
        //script to input "Expiry Date"
        sp.inputTxtExpiryDate();
        //delay 2s
        sleep();
        //script to input "CVV"
        sp.inputTxtCVV();
        //delay 2s
        sleep();
        //script to scroll page in Payment Credit Card Page
        sp.scrollToPayment();
        //delay 2s
        sleep();
        //script to click button "Pay Now"
        sp.clickBtnPay();

        //script into Bank OTP Validation inframe Popup
        cp.inFrameCC();
        //delay 2s
        sleep();
        //script to input "Password/OTP"
        cp.inputTxtPwd();
        //delay 2s
        sleep();
        //script to click button "Ok"
        cp.clickBtnOk();

        //delay 2s
        sleep();
        //Close the browser
        driver.quit();
    }

    public static void sleep() throws InterruptedException {
        //Delay 2s the execution of current thread
        Thread.sleep(2000);
    }

    @AfterTest
    public void quit(){
        //Close the browser
        driver.quit();
    }

}

