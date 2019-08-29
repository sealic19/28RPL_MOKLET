/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequen;

import java.util.Arrays;

/**
 *
 * @author gagassurya
 */
public class tugas3 {
    public static void main(String[] args) {
        int[] data = new int[]{92,98,76,72,84,101,39};
        System.out.println("Data pada array: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"\t");
        }
        System.out.println("\nNilai kelipatan tiga: ");
        
        for (int x = 0; x < data.length; x++) {
            if (data[x]%3 == 0) {
                System.out.println(data[x]);
            }
        }
    }
}
