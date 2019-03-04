package com.aqacourses.project.pages;

import com.aqacourses.project.base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountPage extends AbstractPage {

    @FindBy(xpath = "//ul[contains(@class,'submenu-container')]/preceding-sibling::a[@title='Dresses']")
    protected WebElement dressesButton;


    @FindBy(xpath = "//span[@class='heading-counter']")
    protected WebElement numberOfDresses;

    @FindBy(xpath = "//span[@class='heading-counter']")
    protected WebElement numberOfShowingDresses;
    /**
     * Constructor
     *
     * @param testClass
     */
    public AccountPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(divPage);
    }
      public void checkQuantity() {

          Pattern pattern = Pattern.compile(".*([^0-9]+) products");

          String number1 = numberOfDresses.getText();
          Matcher matcher = pattern.matcher(number1);
          if(!matcher.matches()) {
              return;
          }

          String numOfProductsString = matcher.group(1);

          String number2 = numberOfShowingDresses.getText();

      }


    public DressesPage clickDresses() {
        dressesButton.click();
        return new DressesPage(testClass);

    }
}


