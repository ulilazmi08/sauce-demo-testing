package com.utilities;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;

public class Utility {
    public static WebDriver driver;

    public static void setUltilityDriver(){
        driver = BasePage.driver;
    }
}
