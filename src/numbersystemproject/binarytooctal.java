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
public class binarytooctal {
    
    
    
    binarytooctal()
    {
    
    
     long decimal=(long) Double.parseDouble(display.getText());
    String var="";
        int modulas,i=0;
        int[] binarynumber;
        binarynumber=new int[30];
        while(decimal>0)
        {
            modulas=(int) decimal%8;
            decimal=decimal/8;
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
