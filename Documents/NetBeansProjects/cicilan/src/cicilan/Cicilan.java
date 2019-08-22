/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicilan;
import java.util.Scanner;
/**
 *
 * @author miamia
 */
public class Cicilan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        TUGAS
        MEMBUAT PROGRAM MENGHITUNG JUMLAH CICILAN BERDASARKAN :
        - JUMLAH PEMINJAMAN
        - BUNGA PER-BULAN
        - LAMA PEMINJAMAN (BULAN)
        */
        
        //deklarasi
        double var_jupin, var_bunga, var_lapem, var_jumlah, persen_bunga, jumlah_persen;
        
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //desain
        System.out.println("=========================================");
        System.out.println("==============] CICILAN [================");
        System.out.println("=========================================");
        
        //input
        System.out.print("Jumlah Peminjaman: ");
        var_jupin = input.nextInt();
        System.out.print("Bunga Per-Bulan: ");
        var_bunga = input.nextInt();
        System.out.print("Lama Pinjaman: ");
        var_lapem = input.nextInt();
        
        //desain
        System.out.println("==============] Proses [================");
                
        //proses
        persen_bunga = 100;
        jumlah_persen = (var_jupin / persen_bunga) * var_bunga;
        var_jumlah = (var_jupin / var_lapem) + jumlah_persen;
        
        //desain
        System.out.println("===============] Hasil [================");
        
        //output
        System.out.println("Jumlah cicilan: " + var_jumlah);
        
        //desain
        System.out.println("========================================");
        
            
                
    }
    
}
