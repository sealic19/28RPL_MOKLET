package sequential;
import java.util.Scanner;
/**
 *
 * @author gagassurya
 */
public class praktek1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean found = false;
        String cari;
        Scanner input = new Scanner(System.in);
        String[] data = new String[]{"rangga","juna","aril","saya"};
        
        System.out.print("Masukkan nilai yang dicari: ");
        cari = input.nextLine();
        
        for (String data1 : data) {
            if (cari == null ? data1 != null : !cari.equals(data1)) {
                found = true;
                break;
            }
        }
        
        if (found == true) {
            System.out.println("Data ditemukan!");
        } else {
            System.out.println("Data tidak ditemukan!");
        }
        
    }
    
}
