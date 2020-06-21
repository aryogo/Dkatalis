package object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
Code for Object Element Page
 */
public class summaryPage {

    @FindBy(xpath = "//*[@id=\"snap-midtrans\"]")
    public static WebElement iFrame;

    @FindBy(xpath = "//*[@id=\"application\"]/div[3]/div/div/div/div[2]/div/ul/li[2]/a")
    public static WebElement shippingDetails;

    @FindBy(xpath = "//*[@id=\"application\"]/div[1]")
    public static WebElement btnContinue;

    @FindBy(xpath = "//*[@id=\"payment-list\"]/div[1]")
    public WebElement btnPayment;

    @FindBy(xpath = "//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[1]/input")
    public WebElement txtCardNumber;

    @FindBy(xpath = "//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[2]/input")
    public WebElement txtExpiryDate;

    @FindBy(xpath = "//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[3]/input")
    public WebElement txtCVV;

    @FindBy(xpath = "//*[@id=\\\"application\\\"]/div[3]/div/div/div/form/div[4]/div[2]/span[2]")
    public WebElement scrollPayment;

    @FindBy(xpath = "//*[@id=\"application\"]/div[1]")
    public WebElement btnPay;
}
