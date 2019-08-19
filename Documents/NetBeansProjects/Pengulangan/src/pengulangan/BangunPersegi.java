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
public class BangunPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sisi;
        System.out.println("Masukkan jumlah sisi persegi: ");
        sisi = input.nextInt();
        
        for (int i = 1; i <= sisi; i++){
            for (int j = 1; j <= sisi; j++){
                System.out.print(" * ");
            }    
            System.out.println(" ");
        }
        
        System.out.println(" ");

        int i = 1;
        int j = 1;
        while (i<=sisi == j<=sisi){
            i++;
            j++;
                System.out.print(" * ");
        } 
            System.out.println(" ");
        }

    }
