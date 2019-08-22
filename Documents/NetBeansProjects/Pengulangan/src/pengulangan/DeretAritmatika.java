/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengulangan;
import java.util.Scanner;
/**
 *
 * @author miamia
 */
public class DeretAritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,jumlah;
        
        System.out.println("Masukkan nilai suku awal: ");
        a = input.nextInt();
        System.out.println("Masukkan nilai beda tiap suku: ");
        b = input.nextInt();
        System.out.println("Masukkan jumlah suku: ");
        jumlah = input.nextInt();
        System.out.println("Berikut tampilan deret aritmatika: ");
        
        /*
        int i = 1;
        do {
            System.out.print(a + " ");
            a+=b;
            i++;
        } while (i<=jumlah);
        */
        
        //DOWHILE KE FOR
        
        /*
        for (int i = 1; i<jumlah; ){
            a+=b;
            i++;
            System.out.print(a+" ");
        }
        */
        
        //FOR KE WHILE
        
        int i = 1;
        while (i<jumlah){
            a+=b;
            i++;
            System.out.print(a+" ");
        } 
        
    }
}
