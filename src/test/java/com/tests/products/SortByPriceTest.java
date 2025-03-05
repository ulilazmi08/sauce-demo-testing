package com.tests.products;

import com.base.BaseTest;
import com.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;

public class SortByPriceTest extends BaseTest {

    @Test
    public void dropdownSortByPrice() throws InterruptedException {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        productsPage.inputOriginalValueList();
        Thread.sleep(2000);
        productsPage.clickDropDownSort();
        productsPage.sortTempList();
        Thread.sleep(2000);
        productsPage.isPriceSorted();


    }
}
