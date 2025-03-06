package com.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.Map.Entry;


import java.util.*;

import static com.utilities.JavaScriptUtility.scrollToElementJS;

public class ProductsPage extends BasePage {
    private By productsHeader = By.xpath("//span[text()='Products']");
    private By productBackPackAddToCart = By.id("add-to-cart-sauce-labs-backpack");
    private By removeProductBackPack = By.id("remove-sauce-labs-backpack");
    private By shoppingChartIcon = By.xpath("//div/div[@id='shopping_cart_container']/a[@class='shopping_cart_link']");
    private By productSortDropDown = By.className("product_sort_container");


    public boolean isProductsHeaderDisplayed() {
        return find(productsHeader).isDisplayed();
    }
    public void clickBackPackProduct(){
        scrollToElementJS(productBackPackAddToCart);
        click(productBackPackAddToCart);
    }
    public boolean isRemoveButtonIsDisplayed(){
        return find(removeProductBackPack).isDisplayed();
    }
    public  CartPage clickshoppingChartIcon(){
        scrollToElementJS(shoppingChartIcon);
        click(shoppingChartIcon);
        return new CartPage();

    }
    List<WebElement> originalValuePrice = driver.findElements(By.className("inventory_item_price"));
    List<Double> originalValueList = new ArrayList<>();
    List<Double> TempList = new ArrayList<>();


    public List<Double> inputOriginalValueList(){
        for(WebElement value:originalValuePrice){
            originalValueList.add(Double.valueOf(value.getText().replace("$","")));
            TempList.add(Double.valueOf(value.getText().replace("$","")));

        }

        System.out.println("Original Value : "+originalValueList);
        return this.originalValueList;
    }
    public void clickDropDownSort(){
       select(productSortDropDown,"Price (low to high)");
    }
    public List<Double> sortTempList(){
        Collections.sort(TempList);
        System.out.println("TempList Value : "+TempList);
        return TempList;
    }
    public boolean isPriceSorted(){
        if(TempList.equals(originalValueList)){
            System.out.println("Price isnt Sorted");
            return false;
        }else {
            System.out.println("Price is Sorted");
            return true;
        }
    }


}
