package com.pages;

import com.base.BasePage;
import com.utilities.JavaScriptUtility.*;
import org.openqa.selenium.By;

import static com.utilities.JavaScriptUtility.scrollToElementJS;


public class CheckOutPage extends BasePage {
    private By checkOutTitle = By.xpath("//div/span[text()='Checkout: Your Information']");
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueButton = By.id("continue");


    public void setFirstName(String firstName) {
        set(firstNameField,firstName);
    }
    public void setLastName(String lastName){
        set(lastNameField,lastName);
    }
    public void setPostalCodeField(String postalCode){
        set(postalCodeField,postalCode);
    }
    public CheckOutOverview clickContinueButton(){
        scrollToElementJS(continueButton);
        click(continueButton);
        return new CheckOutOverview();
    }
}
