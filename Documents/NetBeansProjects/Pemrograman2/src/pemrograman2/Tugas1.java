package pemrograman2;
import java.util.Scanner;
/**
 *
 * @author MonsterInc(rpl6)
 */
public class Tugas1 {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //Tipe data
        double inp_harga, tot_harga, tot_pot_harga, persen;
        
        //Data
        persen = 100;
        
        //input
        System.out.println("-=Toko Gema Insani=-");
        System.out.println("Input Harga: ");
        inp_harga = input.nextInt();
        
        //if else
        if (inp_harga<50000){ //KURANG DARI 50000
            System.out.println("Bagian kurang dari 50.000");
            //Proses
            tot_pot_harga = inp_harga/persen * 5;
            tot_harga = inp_harga - tot_pot_harga;
            
            //Output
            System.out.println("Harganya: " + tot_harga);
        } else { //LEBIH DARI 50.000
            System.out.println("Bagian lebih dari 50.000");
            //Proses
            tot_pot_harga = inp_harga/persen * 20;
            tot_harga = inp_harga - tot_pot_harga;
            
            //Output
            System.out.println("Harganya: " + tot_harga);
        }
    }
    
}
