package sequential;
import java.util.Scanner;
/**
 *
 * @author gagassurya
 */
public class praktek2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean found = false;
        String cari;
        Scanner input = new Scanner(System.in);
        String[] data = new String[]{"8","90","56","90","87","76","42"};
        
        System.out.print("Masukkan nilai yang dicari: ");
        cari = input.nextLine();
        
        for (int i = 0; i< data.length; i++) {
            if (cari == null ? data[i] == null : cari.equals(data[i])) {
                found = true;
                int c = i+1;
                System.out.println("Data ditemukan pada indeks ke-" + c);
                //break; -> untuk menghentikan proses
                }
        }
        
        if (found != true) {
            System.out.println("Data tidak ditemukan!");
        }
        
    }
    
}