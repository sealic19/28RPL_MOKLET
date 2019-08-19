/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengulangan;
import java.util.Scanner;
/**
 *
 * @author gagassurya19
 */
public class BangunPersegiPanjang {
    public static void main(String[] args) {
        int panjang, lebar;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai panjang: ");
        panjang = input.nextInt();
        System.out.println("Masukkan nilai lebar: ");
        lebar = input.nextInt();
        
        System.out.println("");
        System.out.println("Persegi panjang FOR");
        System.out.println("");
        
        //Persegi Panjang FOR
        for (int i = 1; i <= panjang; i++){
            for (int j = 1; j <= panjang; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
        
        System.out.println(" ");
        System.out.println("Persegi panjang while");
        System.out.println(" ");
        
        //Persegi Panjang WHILE
        int i = 1;
        while (i <= panjang){
            System.out.print(" ");
            i++;
             int j = 1;
             while (j <= lebar){
                 System.out.print(" * ");
                 j++;
             }
             System.out.print("\n");
        }
        
        
    }
}
