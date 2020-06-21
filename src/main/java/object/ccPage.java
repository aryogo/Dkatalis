package object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
Code for Object Element Page
 */
public class ccPage {
    @FindBy(xpath = "//*[@id=\"application\"]/div[3]/div/div/div/iframe")
    public static WebElement iFrameCC;

    @FindBy(xpath = "//input[@name='PaRes']")
    public static WebElement txtPwd;

    @FindBy(xpath = "//*[@id=\"acsForm\"]/div[6]/div/button[1]")
    public static WebElement btnOk;
}
