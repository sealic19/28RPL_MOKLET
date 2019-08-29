/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequen;
import java.util.Scanner;
/**
 *
 * @author gagassurya
 */
public class tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String cari;
        System.out.print("Masukkan kata/kallimat: ");
        cari = input.nextLine();
        int a = 0;
        int i = 0;
        int u = 0;
        int e = 0;
        int o = 0;
        for (int ii = 0; ii < cari.length(); ii++) {
            if (cari.charAt(ii) == 'a') {
                a++;
            }
            if (cari.charAt(ii) == 'i') {
                i++;
            } 
            if (cari.charAt(ii) == 'u') {
                u++;
            }
            if (cari.charAt(ii) == 'e') {
                e++;
            }
            if (cari.charAt(ii) == 'o') {
                o++;
            }
        }
        System.out.println("Jumlah huruf a adalah: "+a);
        System.out.println("Jumlah huruf i adalah: "+i);
        System.out.println("Jumlah huruf u adalah: "+u);
        System.out.println("Jumlah huruf e adalah: "+e);
        System.out.println("Jumlah huruf o adalah: "+o);
        System.out.println("total huruf vokal: " + (a+i+u+e+o));
    }
}
