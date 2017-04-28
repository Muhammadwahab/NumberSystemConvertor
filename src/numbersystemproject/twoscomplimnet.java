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
public class twoscomplimnet {
    
    twoscomplimnet()
    {
    
    
    
    long firstcompliment=(long)Double.parseDouble(display.getText());
        int mod,i=0,total,add=1,carry=0;
        int[] array=new int[40];
        String var="";

        while(firstcompliment>=0)
        {
            mod=(int)firstcompliment%10;
            firstcompliment=firstcompliment/10;

            total=add+mod+carry;
            if(total==2)
            {
                total=0;
                carry=1;
            }
            else if(total==3)
            {
                total=1;
                carry=1;
            }
            if(mod==1 && carry==0 || mod==0 && carry==1)
            {
                carry=0;
            }
            else if(mod==1 && carry==1)
            {
                carry=1;
            }
            array[i]=total;
            i++;
            add=0;
            if(firstcompliment==0)
            {
                firstcompliment=-1;
            }
        }
        i--;
        for(int j=i;j>=0;j--)
        {
            var=var+array[j];

        }
        display.setText(var);
    
    
    }
    
}
