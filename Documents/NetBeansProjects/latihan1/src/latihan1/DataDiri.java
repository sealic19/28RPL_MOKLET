/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1; //nama folder

/**
 *
 * @author miamia
 */
public class DataDiri { //nama class = nama file

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //membuat variable
        String nama, alamat; 
        int usia;
        double tinggi;

        //mengisi variable
        nama = "Gagas Surya Laksana";
        alamat = "Jl. Kimangun sarkoro";
        usia = 17;
        tinggi = 170.6;

        //mencetak ke layar isi variable
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("tinggi: " + tinggi + " cm");
    }
    
}
