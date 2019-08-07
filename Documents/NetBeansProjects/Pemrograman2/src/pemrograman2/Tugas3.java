package pemrograman2;
import java.util.Scanner;
/**
 *
 * @author MonsterInc(rpl6)
 */
public class Tugas3 {
    public static void main(String[] args) {
        //Tipe Data
        double nmk, nmt, nmu, tot_nmk, tot_nmt, tot_nmu, nilai_murni_keaktifan, nilai_murni_tugas, nilai_murni_ujian, nilai_akhir, tot_nilai_murni_keaktifan;
        int persen;
        
        //Data
        persen = 100;
        
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //soal A
        //input NILAI AKHIR
        System.out.println("-=Nilai Akhir Siswa=-");
        System.out.print("Input Nilai Murni Keaktifan: ");
        nilai_murni_keaktifan = input.nextInt();
        System.out.print("Input Nilai Murni Tugas: ");
        nilai_murni_tugas = input.nextInt();
        System.out.print("Input Nilai Murni Ujian: ");
        nilai_murni_ujian = input.nextInt();
        
        //proses NILAI AKHIR
            //nilai aktif
            nmk = nilai_murni_keaktifan;
            tot_nmk = nmk / persen * 20;
        
            //nilai tugas
            nmt = nilai_murni_tugas;
            tot_nmt = nmt / persen * 30;
        
            //nilai ujian
            nmu = nilai_murni_tugas;
            tot_nmu = nmu / persen * 50;
            
        nilai_akhir = tot_nmk + tot_nmt + tot_nmu;
        
        //output NILAI AKRHIR
        System.out.println("Nilai Akhir Anda: " + nilai_akhir);
        
        
        //soal B
        //Konversi angka ke nilai
        //if else
        if (nilai_akhir<=44){
            System.out.println("-=Nilai Anda: E=-");
        } else if (nilai_akhir>=45 && nilai_akhir<=55){
            System.out.println("-=Nilai Anda: D=-");
        } else if (nilai_akhir>=56 && nilai_akhir<=65){
            System.out.println("-=Nilai Anda: C=-");    
        } else if (nilai_akhir>=66 && nilai_akhir<=75){
            System.out.println("-=Nilai Anda: B=-");
        } else if (nilai_akhir>=76 && nilai_akhir<=85){
            System.out.println("-=Nilai Anda: B=-");
        } else if (nilai_akhir>=86 && nilai_akhir<=90){
            System.out.println("-=Nilai Anda: A=-");
        } else if (nilai_akhir>=91 && nilai_akhir<=100){
            System.out.println("-=Nilai Anda: A=-");
        } else {
            System.out.println("-=Anda Adalah Alien=-");
        }
        
        //soal B
        //Notice
        if (nilai_akhir<=55){
            System.out.println("Anda tidak lulus, tingkatkan belajar anda");
        } else if (nilai_akhir>=56 && nilai_akhir<=65){
            System.out.println("Anda lulus, tingkatkan prestasimu!");
        } else if (nilai_akhir>=66 && nilai_akhir<=85){
            System.out.println("Anda lulus dengan baik, pertahankan prestasimu!");
        } else if (nilai_akhir>=86 && nilai_akhir<=100){
            System.out.println("Anda Tidak lulus, EXCELLENT!");
        } else {
            System.out.println("Apakah anda manusia ?");
        }
    }
}
