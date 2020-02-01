package Extentions;

import Utilities.commonops;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class uiActions extends commonops
{
    @Step("Click on element")
    public static void click(WebElement elem)
    {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    @Step ("Send text to Text-Field")
    public static void updateText(WebElement elem, String value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(value);
    }

    @Step ("Update DropDown-Field")
    public static void updateDropDown(WebElement elem, String value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select myValue = new Select(elem);
        myValue.selectByVisibleText(value);
    }

    public  static String getElementText (WebElement elem)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        String textValue = elem.getText();
        return textValue ;
    }
}
