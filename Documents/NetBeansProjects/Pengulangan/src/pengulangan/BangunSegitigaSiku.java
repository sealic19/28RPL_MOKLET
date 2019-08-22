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
public class BangunSegitigaSiku {
    public static void main(String[] args) {
        int tinggi;
            
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah tinggi segitiga: ");
        tinggi = input.nextInt();
        /*
        System.out.println("");
        System.out.println("Segitiga Siku-siku WHILE");
        System.out.println("");
        */
        //Perulangan WHILE
        /*
        int i = 1;
        int j;
        while (i<=tinggi){
            j = 1;
            while (j<=i){
                System.out.print(" * ");
                j++;
            }
            System.out.println("");
            i++;
        }
        */
        
        //Perulangan FOR
        System.out.println("");
        System.out.println("Segitiga Siku-siku FOR");
        System.out.println("");
        
        for (int i = 1; i<=tinggi; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
        
        //Perulangan DO/WHILE
        //masih pusing pak :'      
        
        System.out.println("");
        //Segitiga II
        for (int i = tinggi; i>=1; i--){
            for(int j = i; j>=1; j--){
                System.out.print(" * ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        for (int i = 1; i<=tinggi; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        for (int i = 1; i<=tinggi; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" "+i);
            }
            System.out.println("");
        }
    }
}