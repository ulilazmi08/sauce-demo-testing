package com.base;

import com.pages.CartPage;
import com.pages.LoginPage;
import com.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.base.BasePage;

import org.testng.annotations.BeforeMethod;
import com.utilities.Utility;

import static com.utilities.Utility.setUltilityDriver;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    protected ProductsPage productsPage;
    protected CartPage cartPage;
    private String url = "https://www.saucedemo.com";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUltilityDriver();
        loginPage = new LoginPage();
        productsPage = new ProductsPage();
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }


}
