/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersystemproject;

import static numbersystemproject.main.display;

/**
 *
 * @author Abdul Wahab
 */
public class decimaltohexa {
    decimaltohexa()
    {
    
    
    
    long decimal=(long) Double.parseDouble(display.getText());
        String var="";
        int modulas,i=0;
        int[] binarynumber;
        binarynumber=new int[30];
        while(decimal>0)
        {
            modulas=(int) decimal%16;
            decimal=decimal/16;
            binarynumber[i]=modulas;
            i++;
        }
        i--;

        for(int j=i;j>=0;j--)
        {
            System.out.print(binarynumber[j]);
            if(binarynumber[j]==10)
            {
                var+="A";
            }
            else if(binarynumber[j]==11)
            {
                var+="B";
            }
            else if(binarynumber[j]==12)
            {
                var+="C";
            }
            else if(binarynumber[j]==13)
            {
                var+="D";
            }
            else if(binarynumber[j]==14)
            {
                var+="E";
            }
            else if(binarynumber[j]==15)
            {
                var+="F";
            }
            else

            {
                var+=binarynumber[j];
            }
        }
        display.setText(var);
    
    
    
    
    }
    
}
