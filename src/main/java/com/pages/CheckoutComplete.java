package com.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import static com.utilities.JavaScriptUtility.scrollToElementJS;

public class CheckoutComplete extends BasePage {
    private By thankYouHeader = By.xpath("//div/h2[text()='Thank you for your order!']");
    private By backToProductsButton = By.id("back-to-products");

    public boolean checkThankyouHeaderIsDisplayed (){
        if (find(thankYouHeader).isDisplayed()){
            System.out.println("Thankyou Header is Displayed");
            return true;
        } else {
            System.out.println("Thankyou Header is not Displayed");
            return false;
        }
    }
    public ProductsPage clickBackToHomeButton(){
        scrollToElementJS(backToProductsButton);
        click(backToProductsButton);
        return new ProductsPage();
    }
}
