package com.tests.cart;

import com.base.BaseTest;
import com.pages.CartPage;
import com.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void isYourChartTitleIsDisplayed() throws InterruptedException {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        Thread.sleep(2000);
        productsPage.clickshoppingChartIcon();
        Thread.sleep(2000);
        CartPage cartPage =  productsPage.clickshoppingChartIcon();
        Assert.assertTrue(cartPage.isYourCartTitleIsDisplayed(),"\n Products Header Is Not Displayed \n");
    }
}
