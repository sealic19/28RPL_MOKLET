package sequential;

/**
 *
 * @author gagassurya
 */
public class praktek3 {
    public static void main(String[] args) {
        int min = 0;
        int[] data = new int[]{-21,90,82,190,-83,74};
        System.out.println("Data pada Array: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"\t");
            if (data[i]>min) { //bisa dibuat dari terkecil ke besar && sebaliknya
                min = data[i];
            }
        }
        System.out.println("\nData terkecil dari array adalah: "+min);
    }
    
}
