package com.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import static com.utilities.JavaScriptUtility.scrollToElementJS;

public class CheckOutOverview extends BasePage {
    private By checkoutOverviewTitle = By.xpath("//div/span[text()='Checkout: Overview']");
    private By itemCheckout = By.className("cart_item");
    private By finishButtonCheckoutOverview = By.xpath("//button[@id='finish']");

    public CheckoutComplete clickFinishButton(){
        scrollToElementJS(finishButtonCheckoutOverview);
        click(finishButtonCheckoutOverview);
        return new CheckoutComplete();
    }

}
