package com.aqacourses.project.pages;

import com.aqacourses.project.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {


    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    protected WebElement signInButton;
    /**
     * Constructor
     *
     * @param testClass
     */
    public HomePage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(divPage);
    }

    public SignInPage clickSignIn() {
        signInButton.click();
        return new SignInPage(testClass);

    }

}
