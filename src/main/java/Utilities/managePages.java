package Utilities;

import org.openqa.selenium.support.PageFactory;

public class managePages extends base
{
    public static void init()
    {
        pageObjectControl = PageFactory.initElements(driver, PageObjects.pageObject.class);
        tabsMenuControl =  PageFactory.initElements(driver, PageObjects.ebay.tabsMenu.class);
    }
}
