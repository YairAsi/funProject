package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base
{
    public static WebDriver driver;
    public static Actions action;
    public static WebDriverWait wait;

    public static PageObjects.pageObject pageObjectControl;
    public static PageObjects.ebay.tabsMenu tabsMenuControl;
}
