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
public class BCD {
    
    BCD()
    {
    
    
     long bcd = (long) Double.parseDouble(display.getText());
        String var="";
        long modulas,bcd1;
        int[] binary;
        int i=0,a=4;
        binary=new int[30];
        while(bcd>0)
        {
            a=4;
            bcd1=bcd%10;
            bcd=bcd/10;
            while(bcd1>0 || a!=0)
            {
                modulas=bcd1%2;
                bcd1=bcd1/2;
                binary[i]=(int)modulas;
                i++;
                a--;
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
