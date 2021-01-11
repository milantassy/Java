
package megszamlalas;

import java.util.Scanner;

public class Megszamlalas {

    
    public static void main(String[] args) {
       System.out.print("Hány eleme legyen a tömbnek: ");
        Scanner input = new Scanner(System.in);
        int elemSzam = input.nextInt();
        
        int[] tomb = new int  [elemSzam];
        int szamokDb=0;
        for(int i = 0; i < elemSzam; i++)
        {
            tomb[i] = (int) (Math.random() * 999) + 1;  //aktuális tömbelem
            szamokDb++;//smokDb=szamokDb+1
        }
        
        System.out.println("A tömb elemei:");
        for(int i = 0; i < elemSzam; i++)
        {
            System.out.print(i + 1 + ".: ");
            System.out.print(String.format("%, 5d", tomb[i])+"\n");
        }
        int parosSzamDb=0;
        for (int i = 0; i < elemSzam; i++) {
            if (tomb[i]%2==0) {
                parosSzamDb++;
            }
        }
        
        System.out.println(elemSzam+"="+tomb.length+"= "+szamokDb);
        System.out.println("Páros számok db-számok: "+parosSzamDb);
    }
    
}
