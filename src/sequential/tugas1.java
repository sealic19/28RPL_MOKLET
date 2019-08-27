/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequential;
import java.util.Scanner;
/**
 *
 * @author gagassurya
 */
public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cari;
        int counter = 0;
        boolean found = false;
        int[] data = new int[]{74,98,72,74,72,90,81,72};
        System.out.println("Data Pada Array: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"\t");
        }
        System.out.print("\nasukkan Nilai Yang Dicari: ");
        cari = input.nextInt();
        
        for (int i = 0; i < data.length; i++) {
            if(cari == data[i]){
                found = true;
                counter++;   
        }
        }
           if(found != false){
               System.out.println("\nData yang dicari ditemukan sebanyak "+ counter +" kali");
           } else  {
               System.out.println("\nData tidak ditemukan!");
           }
    }
}
