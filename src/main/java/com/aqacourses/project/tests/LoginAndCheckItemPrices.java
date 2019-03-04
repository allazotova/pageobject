package com.aqacourses.project.tests;

import com.aqacourses.project.base.BaseTest;
import com.aqacourses.project.pages.*;
import org.junit.Test;

public class LoginAndCheckItemPrices extends BaseTest {

    @Test
    public void testOpenSiteAndCheckItemPrice(){
        // Open site
        HomePage homePage = openSite();
        // Sign In
        SignInPage signInPage = homePage.clickSignIn();
        // Enter credentials
        AccountPage accountPage  = signInPage.enterCredentials();
        //Proceed to Dress Page
        DressesPage dresses = accountPage.clickDresses();

        TshirtPage tshirtPage = dresses.clickTshirt();
        //tshirtPage.bradCrumpCheck();

        ItemPage  ip = tshirtPage.clickItemPage();
        CartPage cart = ip.clickAddToCart();
        //CartPage cart =  ip.clickItemPage();
        CheckoutPage cp = cart.clickChekoutPage();
        cp.addItems();

        //CheckoutPage chkPage = cartPage.clickChekoutPage();
        //chkPage.addItems();




    }


}
