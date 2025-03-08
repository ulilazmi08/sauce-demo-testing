package com.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


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
    //1.1remove the dollar symbol and then convert string to double
    List<WebElement> originalValuePrice = driver.findElements(By.className("inventory_item_price"));
    List<Double> originalValueList = new ArrayList<>();
    List<Double> TempList = new ArrayList<>();
    List<Double> highToLowList = new ArrayList<>();

    public List<Double> inputOriginalValueList(){
        for(WebElement value:originalValuePrice){
            originalValueList.add(Double.valueOf(value.getText().replace("$","")));
            TempList.add(Double.valueOf(value.getText().replace("$","")));
            highToLowList.add(Double.valueOf(value.getText().replace("$","")));
        }

        System.out.println("Original Value : "+originalValueList);
        return this.originalValueList;
    }
    public void clickDropDownSortLowToHigh(){
       select(productSortDropDown,"Price (low to high)");
    }
    public void clickDropDownSortHighToLow(){
        select(productSortDropDown,"Price (high to low)");
    }
    public List<Double> sortTempList(){
        Collections.sort(TempList);
        System.out.println("TempList Value : "+TempList);
        return TempList;
    }
    public List<Double>sortHighToLowList(){
        Collections.sort(highToLowList,Collections.reverseOrder());
        System.out.println(highToLowList);
        return highToLowList;
    }
    public boolean isPriceSortedLowToHigh(){
        if(TempList.equals(originalValueList)){
            System.out.println("Price isnt Sorted Low To High");
            return false;
        }else {
            System.out.println("Price is Sorted Low To High");
            return true;
        }
    }
    public boolean isPriceSortedHighToLow(){
        if (highToLowList.equals(originalValueList)){
            System.out.println("Price isnt Sorted High To Low");
            return false;
        } else {
            System.out.println("Price is Sorted High To Low");
            return true;
        }
    }



}
