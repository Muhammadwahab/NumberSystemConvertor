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
public class binarytodecimal {
    
    
    int len(long x)
       {
          int length=-1; 
          while(x>0)
              {
                x=x/10;
                length++;
                
                
              }
          return length;
       }  
    
    binarytodecimal()
    {
    
     long binary;
        binary = (long) Double.parseDouble(display.getText());
        long length,i=0,decimal1,decimal=0;
        length=len(binary);
        while(i<=length)
        {
            decimal1=binary%10;
            binary=binary/10;
            decimal=(long) (decimal+decimal1*Math.pow(2, i));
            i++;
        }
        display.setText(String.valueOf(decimal));
    
    
    }
    
}
