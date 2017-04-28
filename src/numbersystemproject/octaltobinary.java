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
public class octaltobinary {
    octaltobinary()
    {
    
    long octal = (long) Double.parseDouble(display.getText());
        String var="";
        long a,bin,decimal;
        int binary1,i=0;
        int[] octalrev;
        octalrev=new int[50];
        while(octal!=0)
        {
            a=1;
            bin=octal%10;
            octal=octal/10;
            decimal=bin;
            //i++;

            if(decimal>7)
            {
                continue;
            }

            while(decimal>0 || a<=3)
            {
                binary1=(int)decimal%2;
                decimal=decimal/2;
                octalrev[i]=(binary1);
                i++;
                a++;
            }
        }
        i=i-1;
        while(i>=0)
        {
            var=var+octalrev[i];
            i--;
        }
        display.setText(var);
    
    }
    
}
