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
public class binarytohexa {
    
    
    binarytohexa()
    {
    
    long binary = (long) Double.parseDouble(display.getText());
        int i=0,j=0;
        int[] hexa;
        String hexadecimal="";

        hexa=new int[30];
        long decimal,hexa1,hexa2;
        while(binary>0)
        {
            j=0;
            decimal=0;
            hexa1=binary%10000;
            binary=binary/10000;

            while(hexa1>0)
            {

                hexa2=hexa1%10;
                hexa1=hexa1/10;

                decimal=decimal+(long) (hexa2*Math.pow(2,j));
                j++;
                if(hexa1==0)
                {
                    hexa[i]=(int)decimal;
                    i++;
                    j=0;
                }
            }

        }
        i=i-1;
        j=-1;
        for(int a=i;a>=0;a--)
        {
            j++;
            if(hexa[a]==15)
            {
                hexadecimal=hexadecimal+"F";
            }
            else if(hexa[a]==14)
            {
                hexadecimal=hexadecimal+"E";
            }
            else if(hexa[a]==13)
            {
                hexadecimal=hexadecimal+"D";
            }
            else if(hexa[a]==12)
            {
                hexadecimal=hexadecimal+"C";
            }
            else if(hexa[a]==11)
            {
                hexadecimal=hexadecimal+"B";
            }
            else if(hexa[a]==10)
            {
                hexadecimal=hexadecimal+"A";
            }
            else if(hexa[a]==1)
            {
                hexadecimal=hexadecimal+"1";
            }
            else if(hexa[a]==2)
            {
                hexadecimal=hexadecimal+"2";
            }
            else if(hexa[a]==3)
            {
                hexadecimal=hexadecimal+"3";
            }
            else if(hexa[a]==4)
            {
                hexadecimal=hexadecimal+"4";
            }
            else if(hexa[a]==5)
            {
                hexadecimal=hexadecimal+"5";
            }

            else if(hexa[a]==6)
            {
                hexadecimal=hexadecimal+"6";
            }
            else if(hexa[a]==7)
            {
                hexadecimal=hexadecimal+"7";
            }
            else if(hexa[a]==8)
            {
                hexadecimal=hexadecimal+"8";
            }
            else if(hexa[a]==9)
            {
                hexadecimal=hexadecimal+"9";
            }
        }

        display.setText(hexadecimal);
    
    
    }
    
}
