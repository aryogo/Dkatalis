package action;

import object.ccPage;
import org.openqa.selenium.support.PageFactory;
import static config.config.driver;

/*
Code for Action Page
 */
public class ccPageAction extends ccPage {

    public ccPageAction(){
        PageFactory.initElements(driver,this);
    }

    public void inFrameCC(){
        driver.switchTo().frame(iFrameCC);
    }

    public void inputTxtPwd(){
        txtPwd.sendKeys("112233");
    }

    public void clickBtnOk(){
        btnOk.click();
    }
}
