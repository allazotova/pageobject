package com.aqacourses.project.pages;

import com.aqacourses.project.base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DressesPage extends AbstractPage {

    /**
     * Constructor
     *
     * @param testClass
     */

    @FindBy(xpath = "//span[@class='heading-counter']")
    protected WebElement numberOfDresses;

    @FindBy(xpath = "//div[@class='top-pagination-content clearfix']//div[@class='product-count']")
    protected WebElement numberOfShowingDresses;

    //@FindBy(xpath = "//ul[contains(@class,'sfHoverForce')]/preceding-sibling::a[@title='T-shirts']")
    //@FindBy(xpath = "//li[@class='sfHoverForce']//a[@title='T-shirts'][1]")
    @FindBy(xpath = "//body[@id='category']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]")
    protected WebElement tShirtButton;


    public DressesPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(divPage);
    }

    public void checkQuantityOfDresses() {
        Pattern pattern = Pattern.compile(".*?([0-9]+) products.");
        Pattern pattern2 = Pattern.compile(".*?([0-9]+) items");

        String number1 = numberOfDresses.getText();
        System.out.println("Number of dresses: "+number1);
        Matcher matcher = pattern.matcher(number1);
        Assert.assertFalse(!matcher.matches());
        Integer numberOfProducts = Integer.valueOf(matcher.group(1));
        // Integer numOfProductS
        String number2 = numberOfShowingDresses.getText();
        Matcher matcher2 = pattern2.matcher(number2);

        Assert.assertFalse(!matcher2.matches());

        Integer numberOfProductsActual = Integer.valueOf(matcher2.group(1));
        Assert.assertEquals("Number of dresses", numberOfProducts, numberOfProductsActual);
    }
    public TshirtPage clickTshirt() {
        tShirtButton.click();
        return new TshirtPage(testClass);

    }




}
