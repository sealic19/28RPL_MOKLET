
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
public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = new int[]{83,76,45,90,85,80,78,74};
        System.out.println("Data pada Array:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"\t");
        }
        
        System.out.println("Rata - rata nilai array: ");
        double x = 0;
        for (double y : data) {
            x = x + y;
        } 
        double rata = x/data.length;
        System.out.println("nilai rata -rata: "+rata);
        
        System.out.print("Nilai yang diatas rata - rata: ");
        for (int z = 0; z < data.length; z++) {
            if (data[z]>rata) {
                System.out.print(data[z]+" ");
            }
        }
        System.out.println("\n");
    }
}
