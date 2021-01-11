/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ismetles;

import java.util.Scanner;

/**
 *
 * @author milan
 */
public class Ismetles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        Scanner bemenet = new Scanner(System.in);
        int valasz;
        
        System.out.print("\nAdjon meg egy pozitív egész számot: ");
        valasz = bemenet.nextInt();
        while (valasz < 0) {            
            System.out.print("\nRossz számot adott meg! Adjon meg egy POZITÍV egész számot: ");
            valasz = bemenet.nextInt();
        }
        for (int i = 0; i < valasz; i++) 
            System.out.println(i+1);
        
        bemenet.close();
        
        
    }
    
}

