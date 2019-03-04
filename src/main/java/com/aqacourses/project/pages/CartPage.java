package com.aqacourses.project.pages;

import com.aqacourses.project.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends AbstractPage {

    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    protected WebElement addToCartButton;



    /**
     * Constructor
     *
     * @param testClass
     */
    public CartPage(BaseTest testClass) {
        super(testClass);
    }

    public CheckoutPage clickChekoutPage() {
        addToCartButton.click();
        return new CheckoutPage(testClass);
    }
}
