package com.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import static com.utilities.JavaScriptUtility.scrollToElementJS;


public class CartPage extends BasePage {
    private By yourCartTitle = By.xpath("//div[@class='header_secondary_container']/span[@class='title']");
    private By checkOutButton = By.xpath("//button[@id='checkout']");
    public boolean isYourCartTitleIsDisplayed(){
        return find(yourCartTitle).isDisplayed();
    }
    public void clickCheckOutButton(){
        scrollToElementJS(checkOutButton);
        click(checkOutButton);
    }
}
