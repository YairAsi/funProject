import Extentions.uiActions;
import Utilities.commonops;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

import static WorkFlows.workFlow.mathCount;

public class Exrsise01 extends commonops
{
    final int constd = 5;

    @Test
    public  void test01() throws InterruptedException {
        for(int a = 1; a <= constd ; a++)
        {
            for(int i = 1; i <= constd ; i++)
            {
                mathCount(a, i);
                Thread.sleep(4000);
                System.out.println(uiActions.getElementText(pageObjectControl.txt_results));
            }
        }

    }
}
