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
public class firstcompleemnts {
    
    firstcompleemnts()
    {
    
    long firstcompliment = (long) Double.parseDouble(display.getText());
        int modulas;
        String var="";
        int[] binary;
        int i=0;
        binary=new int[30];
        while(firstcompliment>0)
        {
            modulas=(int)firstcompliment%10;
            firstcompliment=firstcompliment/10;
            if(modulas==0)
            {
                modulas=1;
                binary[i]=modulas;
                i++;
            }
            else if(modulas==1)
            {
                modulas=0;
                binary[i]=modulas;
                i++;
            }

        }
        i--;
        for(int j=i;j>=0;j--)
        {
            var=var+binary[j];
        }
        display.setText(var);
    
    
    
    }
    
}
