import java.util.Scanner;

public class SembarangMi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Berapa banyak elemen yang ingin ditambahkan ke dalam array? ");
       
        int jumlahElemen = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] sembarang = new String[jumlahElemen];
        for (int i = 0; i < jumlahElemen; i++) {
     
          System.out.print("Masukkan nama  ke-" + (i + 1) + ": ");
        sembarang[i] = scanner.nextLine();
        }
           System.out.println("\nString yang telah dimasukkan:");
        for (int i = 0; i < sembarang.length; i++) {
            System.out.println((i + 1) + ". " + sembarang[i]);
        }
            System.out.print("\nIndeks mana yang ingin diubah (mulai dari 0)? ");
        int indeks = scanner.nextInt();
        scanner.nextLine();
          if (indeks >= 0 && indeks < jumlahElemen) {
            System.out.print("Masukkan nama baru " + indeks + ": ");
            String namaBaru = scanner.nextLine();
            sembarang[indeks] = namaBaru;
            
           System.out.println("\nString Setelah perubahan:");
            for (int i = 0; i < sembarang.length; i++) {
                System.out.println((i + 1) + ". " + sembarang[i]);
            }
        } else {
            System.out.println(" Tidak valid, masukkan ulang.");
        }

    }
}
