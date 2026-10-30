import java.util.Scanner;
public class tugas1Absen08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int total = 0;
        int i = 1; 
        while (i <= n) {
            int j = 0;
            int totalbaris = 0;
            while (j < i) {
                System.out.print(j+1);
                totalbaris = j+1;
                j++;
            }
            total += totalbaris;
            System.out.println();
            i++;


        }
        System.out.println("Total semua angka: " + total);
        sc.close();
    }
}
