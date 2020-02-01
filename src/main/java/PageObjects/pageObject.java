package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pageObject
{
    @FindBy(how = How.CSS,  using = "input[ng-model='first']")
    public WebElement txt_first;

    @FindBy(how = How.CSS,  using = "input[ng-model='second']")
    public WebElement txt_second;

    @FindBy(how = How.CSS,  using = "select[ng-model='operator']")
    public WebElement select_MathOperetion;

    @FindBy(how = How.CSS,  using = "button[id='gobutton']")
    public WebElement btn_ok;

    @FindBy(how = How.CSS,  using = "h2[class='ng-binding']")
    public WebElement txt_results;
}
