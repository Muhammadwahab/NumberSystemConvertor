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
public class hexaltodecimal {
    
    hexaltodecimal()
    {
    
    
     String hexanumber=display.getText();
        String var="";
        int length=hexanumber.length(),j=-1,i;
        int[] hexadecimal;
        int decimal=0,decimal1,modulas;

        hexadecimal=new int[40];

        for(i=0;i<length;i++)
        {
            j++;
            if(hexanumber.charAt(i)=='F')
            {
                hexadecimal[j]=15;
            }
            else if(hexanumber.charAt(i)=='E')
            {
                hexadecimal[j]=14;
            }
            else if(hexanumber.charAt(i)=='D')
            {
                hexadecimal[j]=13;
            }
            else if(hexanumber.charAt(i)=='C')
            {
                hexadecimal[j]=12;
            }
            else if(hexanumber.charAt(i)=='B')
            {
                hexadecimal[j]=11;
            }
            else if(hexanumber.charAt(i)=='A')
            {
                hexadecimal[j]=10;
            }
            else if(hexanumber.charAt(i)=='1')
            {
                hexadecimal[j]=1;
            }
            else if(hexanumber.charAt(i)=='2')
            {
                hexadecimal[j]=2;
            }
            else if(hexanumber.charAt(i)=='3')
            {
                hexadecimal[j]=3;
            }
            else if(hexanumber.charAt(i)=='4')
            {
                hexadecimal[j]=4;
            }
            else if(hexanumber.charAt(i)=='5')
            {
                hexadecimal[j]=5;
            }

            else if(hexanumber.charAt(i)=='6')
            {
                hexadecimal[j]=6;
            }
            else if(hexanumber.charAt(i)=='7')
            {
                hexadecimal[j]=7;
            }
            else if(hexanumber.charAt(i)=='8')
            {
                hexadecimal[j]=8;
            }
            else if(hexanumber.charAt(i)=='9')
            {
                hexadecimal[j]=9;
            }
        }
        j=0;
        for(int a=length-1;a>=0;a--)
        {
            decimal=decimal+hexadecimal[a]*(int)Math.pow(16,j);
            j++;
        }
        display.setText(String.valueOf(decimal));
    
    
    
    }
    
}
