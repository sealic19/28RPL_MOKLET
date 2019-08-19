/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengulangan;
import java.util.Scanner;
/**
 *
 * @author gagassurya
 */
public class NilaiFaktorial {
    public static void main(String[] args) {
        int bil, hasil = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan sebuah angka: ");
        bil = input.nextInt();  
        
        /*
        for (int i = bil; i > 0; i--){
            hasil = hasil * i;
        }
        */        
        
        //Mengubah for ke while
        
        int i =     bil;
        while (0 < i){
            hasil = hasil*i;
            i--;
        }       
        System.out.println("Nilai faktorial dari " +bil+ " adalah "+hasil);
    }
}
