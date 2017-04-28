
package numbersystemproject;

import static numbersystemproject.main.display;

/**
 *
 * @author Abdul Wahab
 */
public class decimaltobinary  {
    
    
    
    decimaltobinary()
    {
        
        long decimal=(long) Double.parseDouble(display.getText());
        String var="";
        int modulas,i=0;
        int[] binarynumber;
        binarynumber=new int[30];
        while(decimal>0)
        {
            modulas=(int) decimal%2;
            decimal=decimal/2;
            binarynumber[i]=modulas;
            i++;
        }
        i--;

        for(int j=i;j>=0;j--)
        {
            System.out.print(binarynumber[j]);
            var+=binarynumber[j];
        }
        display.setText(var);
    
    
    
    
    }
    
}
