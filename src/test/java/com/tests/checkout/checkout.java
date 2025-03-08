package com.tests.checkout;

import com.base.BaseTest;
import com.pages.*;
import org.testng.annotations.Test;

public class checkout extends BaseTest {
    @Test
    public void checkoutItemInChart() throws InterruptedException {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        Thread.sleep(2000);
        productsPage.clickBackPackProduct();
        productsPage.clickshoppingChartIcon();
        Thread.sleep(2000);
        CartPage cartPage =  productsPage.clickshoppingChartIcon();
        CheckOutPage checkOutPage = cartPage.clickCheckOutButton();
        Thread.sleep(2000);
        checkOutPage.setFirstName("Alucard");
        checkOutPage.setLastName("Jimbo");
        checkOutPage.setPostalCodeField("12345");
        Thread.sleep(2000);
        CheckOutOverview checkOutOverview= checkOutPage.clickContinueButton();
        Thread.sleep(2000);
        CheckoutComplete checkoutComplete= checkOutOverview.clickFinishButton();
        Thread.sleep(2000);
        checkoutComplete.clickBackToHomeButton();
        Thread.sleep(2000);
    }
}
