package com.aqacourses.project.pages;

import com.aqacourses.project.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TshirtPage extends AbstractPage {

    @FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
    protected WebElement tShirtElement;



    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    protected WebElement toCheckout;


    /**
     * Constructor
     *
     * @param testClass
     */
    public TshirtPage(BaseTest testClass) {
        super(testClass);
    }

    public void bradCrumpCheck(){
    tShirtElement.click();

    }

    /*public void clickCartPage() {
        addToCartButton.click();
        //return new CartPage(testClass);
    }*/



    public ItemPage clickItemPage() {
        tShirtElement.click();
        return new ItemPage(testClass);
    }
}
