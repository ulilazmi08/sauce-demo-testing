package com.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import static com.utilities.JavaScriptUtility.scrollToElementJS;


public class CartPage extends BasePage {
    private By yourCartTitle = By.xpath("//div[@class='header_secondary_container']/span[@class='title']");
    private By checkOutButton = By.xpath("//button[@id='checkout']");
    private By itemChart = By.className("cart_item");
    public boolean isYourCartTitleIsDisplayed(){
        return find(yourCartTitle).isDisplayed();
    }
    public boolean isYourCartHaveItem(){
        if (find(itemChart).isDisplayed()){
            System.out.println("Cart have an item");
            return true;
        } else {
            System.out.println("Cart is empty");
            return false;
        }
    }
    public CheckOutPage clickCheckOutButton(){
        scrollToElementJS(checkOutButton);
        click(checkOutButton);
        return new CheckOutPage();
    }
}
