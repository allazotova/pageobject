package com.aqacourses.project.pages;

import com.aqacourses.project.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    // Web Elements
    @FindBy(xpath = "//img[@class='logo img-responsive']")
    private WebElement logoOnMainPage;

    @FindBy(xpath = "//div[@id='page']")
    protected WebElement divPage;


    // Instances of BaseTest
    protected BaseTest testClass;

    /**
     * Constructor
     *
     * @param testClass
     */
    public AbstractPage(BaseTest testClass) {
        this.testClass = testClass;
        PageFactory.initElements(testClass.getDriver(), this);
        testClass.waitTillElementIsVisible(divPage);
    }

    /**
     * Click on Python link
     *
     * @return new instance of SignInPage
     */
    public SignInPage login() {
        testClass.waitTillElementIsVisible(logoOnMainPage);
        logoOnMainPage.click();
        return new SignInPage(testClass);
    }

}

