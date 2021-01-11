/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kettomb;

/**
 *
 * @author milan
 */
public class KETTOMB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("\n\tTombmuveletek\n");
        
        int[] tomb1 = new int[8];
        int[] tomb2 = new int[8];
        
        System.out.println("Hány elemet tartalmaznak a tömbök: " + tomb1.length);
        
        System.out.println("A tömb elemei:");
        
        for(int i = 0; i < tomb1.length; i++)
        {
            tomb1[i] = (int) (Math.random() * 999) + 1;
            tomb2[i] = (int) (Math.random() * 999) + 1;
            System.out.println(i + ".: " + tomb1[i] + " " + tomb2[i]);
        }



   
    }
    
}
