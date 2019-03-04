package com.aqacourses.project.pages;

import com.aqacourses.project.base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends AbstractPage {

    @FindBy(xpath = "//i[@class='icon-plus']")
    protected WebElement plusButton;

    @FindBy(xpath = "//input[@value='1']")
    protected  WebElement quantity;
    /**
     * Constructor
     *
     * @param testClass
     */
    public CheckoutPage(BaseTest testClass) {
        super(testClass);
    }

    public void addItems(){
        plusButton.click();
        Integer q = Integer.valueOf(quantity.getText());
        Assert.assertEquals(q, Integer.valueOf(2));
    }
}
