package com.aqacourses.project.pages;

import com.aqacourses.project.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends AbstractPage {

    @FindBy(xpath = "//i[@class='icon-plus']")
    protected WebElement plusButton;

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    protected WebElement addToCartButton;

    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    protected WebElement proceedToCheckoutButton;
    /**
     * Constructor
     *
     * @param testClass
     */
    public ItemPage(BaseTest testClass) {
        super(testClass);
    }

    public CartPage clickAddToCart(){
        addToCartButton.click();
        return new CartPage(testClass);

    }

    public CartPage clickItemPage() {
        proceedToCheckoutButton.click();
        return new CartPage(testClass);
    }
}
