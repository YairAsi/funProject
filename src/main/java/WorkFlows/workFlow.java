package WorkFlows;

import Extentions.uiActions;
import Utilities.commonops;

public class workFlow extends commonops
{
    public static void mathCount(int firstValue, int secondValue)
    {
        uiActions.updateText(pageObjectControl.txt_first,Integer.toString(firstValue));
        uiActions.updateDropDown(pageObjectControl.select_MathOperetion, "*");
        uiActions.updateText(pageObjectControl.txt_second,Integer.toString(secondValue));
        uiActions.click(pageObjectControl.btn_ok);
    }
}
