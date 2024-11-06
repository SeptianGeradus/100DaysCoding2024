import java.util.Scanner;

public class main {
    public static void cetakPola(int tinggi, int lebar) {
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < lebar; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Pilih Pola:");
        System.out.println("1. Pola Persegi");
        System.out.println("2. Pola Persegi Panjang");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = scanner.nextInt();

      if (pilihan == 1) {
          
            System.out.print("Masukkan ukuran sisi persegi: ");
            int n = scanner.nextInt();
            System.out.println("\nPola Persegi:");
            cetakPola(n, n);  // Panggil fungsi untuk mencetak persegi
        } else if (pilihan == 2) {
            
            System.out.print("Masukkan tinggi persegi panjang: ");
            int tinggi = scanner.nextInt();
            System.out.print("Masukkan lebar persegi panjang: ");
            int lebar = scanner.nextInt();
            System.out.println("\nPola Persegi Panjang:");
            cetakPola(tinggi, lebar);  // Panggil fungsi untuk mencetak persegi panjang
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}
