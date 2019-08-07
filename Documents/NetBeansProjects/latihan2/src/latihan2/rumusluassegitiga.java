/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

import java.util.Scanner;
/**
 *  
 * @author miamia
 */
public class rumusluassegitiga {
    
            public static void main(String[] args){
                //deklarasi
                double luas;
                int alas, tinggi;

                //membuat scanner baru
                Scanner baca = new Scanner(System.in);

                //input
                System.out.println("== program hitung luas segitiga ==");
                System.out.print("input alas: ");
                alas = baca.nextInt();
                System.out.print("input Tinggi: ");
                tinggi = baca.nextInt();

                //proses
                luas =alas * tinggi*0.5;

                //output
                System.out.println("Luas = " + luas);
            
    }
}
