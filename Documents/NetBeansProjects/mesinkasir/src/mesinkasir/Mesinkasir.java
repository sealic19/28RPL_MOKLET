/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesinkasir;
import java.util.Scanner;
/**
 *
 * @author miamia
 */
public class Mesinkasir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        TUGAS PRORPL

        1) Buat program untuk menghitung total
        total harga yang harus dibayarkan 
        setelah medapatkan sebuah diskon
        beserta uang kembaliannya!

        outpu : 
        - masukan total harga: .. (input usr)
        - masukan diskon (1-100): .. (input usr)

        - Total yang dibayar : .. (hasil operasi)

        - masukan jumllah uang : .. (input usr)
        - nominal kembalikan: .. (hasil operasi)
        */
        
        //Tombol kembali
        String balik="y";
        while (balik.equals("y"))
        {
        
        //Deklarasi
        double tot_harga, tot_bayar, jum_uang, jum_kembalian;
        int diskon, persen;
        
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //input_1
        System.out.println("=============================");
        System.out.println("=======] Mesin kasir [=======");
        System.out.print("Masukan Total Harga: ");
        tot_harga = input.nextDouble();
        System.out.print("Masukan Diskon [1-100]: ");
        diskon = input.nextInt();
        
        //proses_1
        persen = 100;
        tot_bayar = ((tot_harga / persen) * diskon); // RUMUS DISKON
        
        //output_1
        System.out.println("harga total: " + tot_bayar);

        //input_2
        System.out.println("=============================");
        System.out.println("Masukan Jumlah Uang: ");
        jum_uang = input.nextDouble();
        
        //proses_2
        jum_kembalian = jum_uang - tot_bayar;
        
        //output_2
        System.out.println("Nominal Kembalian: " + jum_kembalian);
        
        System.out.println("=====================");
            System.out.println("Ingin Mengulang ? (y/t)");
            balik = input.next();
        }
    }
}
