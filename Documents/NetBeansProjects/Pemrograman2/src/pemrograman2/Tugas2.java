package pemrograman2;
import java.util.Scanner;
/**
 *
 * @author MonsterInc(rpl6)
 */
public class Tugas2 {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //Tipe Data
        double per_pendapatan, tot_pendapatan, tot_komisi;
        int uang_jasa, komisi, persen;
        
        //data
        persen = 100;
        
        //Input
        System.out.println("-=Komisi SEJAHTERA HALAL SENTOSA=-");
        System.out.println("Perolehan Pendapatan: ");
        per_pendapatan = input.nextInt();
        
        //if else
        if (per_pendapatan<=20000){ //KURANG DARI 20.000
            //data
            uang_jasa = 10000;
            komisi = 10;
            
            //proses
            tot_komisi = (per_pendapatan / persen) * komisi;
            tot_pendapatan = tot_komisi + uang_jasa;
            
            //Output
            System.out.println("Total Pendapatan: " + tot_pendapatan);
            System.out.println("-=Pendapatan dibawah 20.000=-");
        } else if (per_pendapatan>=20000 && per_pendapatan<=50000) { //lEBIH DARI 20.000 - 50.000
            //data
            uang_jasa = 20000;
            komisi = 15;
            
            //proses
            tot_komisi = (per_pendapatan / persen) * komisi;
            tot_pendapatan = tot_komisi + uang_jasa;
            
            //Output
            System.out.println("Total Pendapatan: " + tot_pendapatan);
            System.out.println("-=Pendapatan 20.000 - 50.000=-");
        } else { //LEBIH DARI 50.000
            //data
            uang_jasa = 30000;
            komisi = 20;
            
            //proses
            tot_komisi = (per_pendapatan / persen) * komisi;
            tot_pendapatan = tot_komisi + uang_jasa;
            
            //Output
            System.out.println("Total Pendapatan: " + tot_pendapatan);
            System.out.println("-=Pendapatan diatas 50.000=-");
        }   
    }
}
