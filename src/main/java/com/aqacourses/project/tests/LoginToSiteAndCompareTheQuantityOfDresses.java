package com.aqacourses.project.tests;

import com.aqacourses.project.base.BaseTest;
import com.aqacourses.project.pages.AccountPage;
import com.aqacourses.project.pages.DressesPage;
import com.aqacourses.project.pages.HomePage;
import com.aqacourses.project.pages.SignInPage;
import org.junit.Test;

public class LoginToSiteAndCompareTheQuantityOfDresses extends BaseTest {

    /**
     * Open site and click the link
     */
    @Test
    public void testOpenSiteAndClickTheLinkTest() {

        // Open site
        HomePage homePage = openSite();
        // Sign In
        SignInPage signInPage = homePage.clickSignIn();
        // Enter credentials
        AccountPage accountPage  = signInPage.enterCredentials();
      //Proceed to Dress Page
        DressesPage dresses = accountPage.clickDresses();
        System.out.println("Running test for check quantity");
        //Check the quantity of dresses
        dresses.checkQuantityOfDresses();
        dresses.clickTshirt();
        // Close site
        closeSite();

    }

}
