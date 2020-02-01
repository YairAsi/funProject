package PageObjects.ebay;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class tabsMenu
{
    @FindBy(how = How.CSS,  using = "li[class='hl-cat-nav__active']")
    public WebElement btn_home;

}
