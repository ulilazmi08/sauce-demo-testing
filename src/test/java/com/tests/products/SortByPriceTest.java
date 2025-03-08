package com.tests.products;

import com.base.BaseTest;
import com.pages.ProductsPage;
import org.testng.annotations.Test;

public class SortByPriceTest extends BaseTest {

    @Test
    public void dropdownSortByPriceLowToHigh() throws InterruptedException {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        productsPage.inputOriginalValueList();
        Thread.sleep(2000);
        productsPage.clickDropDownSortLowToHigh();
        productsPage.sortTempList();
        Thread.sleep(2000);
        productsPage.isPriceSortedLowToHigh();
    }
    @Test
    public void dropDownSortByPriceHighToLow() throws InterruptedException {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        productsPage.inputOriginalValueList();
        Thread.sleep(2000);
        productsPage.clickDropDownSortHighToLow();
        Thread.sleep(2000);
        productsPage.sortHighToLowList();
        Thread.sleep(2000);
        productsPage.isPriceSortedHighToLow();

    }

}
