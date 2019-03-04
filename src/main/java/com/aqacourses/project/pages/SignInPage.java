package com.aqacourses.project.pages;

import com.aqacourses.project.base.BaseTest;
import com.aqacourses.project.utils.YamlParser;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends AbstractPage {

    // Title of Python page
   // private final String TITLE = "Selenium Framework | Python Course";

    @FindBy(xpath = "//input[@id='email']")
    protected WebElement emailField;
    @FindBy(xpath = "//input[@id='passwd']")
    protected WebElement passwordField;
    @FindBy(xpath = "//button[@id='SubmitLogin']//span[1]")
    protected WebElement submitButton;


    /**
     * Constructor
     *
     * @param testClass
     */
    public SignInPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(divPage);
    }

    /**
     * Verify that title is correct
     */
   public AccountPage enterCredentials() {


     //  driver.get(YamlParser.getYamlData().getEmail());
     //  driver.get(YamlParser.getYamlData().getPassword());

       emailField.click();
       emailField.sendKeys("alla.zotova1993@gmail.com");
       passwordField.click();
       passwordField.sendKeys("asdf1718");
       submitButton.click();
       return new AccountPage(testClass);
    }

}
