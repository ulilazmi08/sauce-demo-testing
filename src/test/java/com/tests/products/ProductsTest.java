package com.tests.products;

import com.base.BaseTest;
import com.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;

import static org.testng.Assert.assertTrue;

public class ProductsTest extends BaseTest {
    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        assertTrue(productsPage.isProductsHeaderDisplayed(),
                "\n Products Header Is Not Displayed \n");
    }
    @Test
    public void testProductBackPack(){
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        productsPage.clickBackPackProduct();
        boolean isRemoveButtonIsDisplayed = productsPage.isRemoveButtonIsDisplayed();
        Assert.assertTrue(isRemoveButtonIsDisplayed,"\n Remove Button Is Displayed");
    }

}
