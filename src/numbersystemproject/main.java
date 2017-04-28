
package numbersystemproject;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Abdul Wahab
 */
public class main {
    
    static JTextField display;
    JFrame f ;
    
    
    
    main()
    {
        
    frame();
    
    
    
    JPanel p1=new JPanel();
    
    
    
        
        JPanel p2=new JPanel(new GridLayout(0, 1, 10,10));
        
        

        
        display=new JTextField(20);
        p2.add(display);
        
         
        
        
        
        JButton b=new JButton("1's compliment");
        p2.add(b);
        
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new firstcompleemnts();
            }
        });
        
        
        JButton b2=new JButton("2'S complement");
        p2.add(b2);
        
        
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new twoscomplimnet();
            }
        });
        
        JButton b1=new JButton("Hexatooctal");
        p2.add(b1);
        
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new Hexatooctal();
            }
        });
        
        JButton b3=new JButton("BCD");
        p2.add(b3);
        
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new BCD();
            }
        });
        
        
        JButton b4=new JButton("hexa to decimal");
        p2.add(b4);
        
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new hexaltodecimal();
            }
        });
        
        
        JButton b5=new JButton("octal to decimal");
        p2.add(b5);
        
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new octaltodecimal();
            }
        });
        
        
        
         JButton b6=new JButton("hexa to binary");
        p2.add(b6);
        
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new hexatobinary();
            }
        });
        
         JButton b7=new JButton("octal to binary");
        p2.add(b7);
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new octaltobinary();
            }
        });
        
         JButton b8=new JButton("binary to hexa");
        p2.add(b8);
        
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new binarytohexa();
            }
        });
        
         JButton b9=new JButton("binary to octal");
        p2.add(b9);
        
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new binarytooctal();
            }
        });
        
        
        
         JButton b10=new JButton("binary to decimal");
        p2.add(b10);
        
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new binarytodecimal();
            }
        });
        
        
        
         JButton b11=new JButton("decimal to hexa");
        p2.add(b11);
        
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new decimaltohexa();
            }
        });
        
        
        
         JButton b12=new JButton("decimal to octal");
        p2.add(b12);
        
        
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new decimaltooctal();
            }
        });
        
        
        JButton b13=new JButton("decimal to binary");
        
        JButton b14=new JButton("decimal to binary");
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new decimaltobinary();
            }
        });
        p2.add(b14);
        
        
        
        JButton b15=new JButton("CA");
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display.setText(" ");
            }
        });
        p2.add(b15);
        
        
        
        p1.add(p2);
        
        f.add(p1);
        
        
    
    
    
    
    
    
    }
    void frame()
    {
        f=new JFrame();
    
        f.setVisible(true);
        f.setSize(700,500);
        
        f.setTitle("Number System Convertor");
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    
    }
    
}
