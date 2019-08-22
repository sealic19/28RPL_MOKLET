/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programtabelsuhu;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class ProgramTabelSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double b;
        System.out.println("Masukkan batas: ");
        b = input.nextInt();
        
        double hc,hr,hk,hf;
        double i = 1.0;
        while (i <= b){
            i++;
            double e = i - 1;
            System.out.println("");
            hc = e; //Proses celcius
            System.out.print("C= "+hc+" ");
            
            hr = (4*e)/5; //Proses celcius ke Reamur
            System.out.print("| R= "+hr+" ");
                    
            hk = e+273; //Proses celcius ke Kelvin
            System.out.print("| K= "+hk+" ");
            
            hf = (9*e)/5 + 32; //Proses celcius ke Fahrenheit
            System.out.print("| F= "+hf+" ");
        } System.out.println("\n");
    }
}

