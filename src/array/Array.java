/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author gagassurya
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    //ARRAY SINGLE DIMENSI
        //Soal I
        /*
        int nilai [] = new int [3];
        nilai [0] = 70;
        nilai [1] = 80;
        nilai [2] = 65;
        */
        
        int[] nilai = {70,80,65}; //Penyederhanaan
        double ratarata = 0.0;
         for (int i = 1; i<nilai.length; i++)ratarata+=nilai [i];
         ratarata/=nilai.length;
        System.out.println("nilai ratarata= " + ratarata);
        
        //kedua
        int[] jumlahhari = {31,28,31,30,31,30,31};
        System.out.println("Bulan januari memiliki " + jumlahhari[2] + " hari.");
    }
}
