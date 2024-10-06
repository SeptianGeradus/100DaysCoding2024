import java.util.Scanner;

public class Operasi_Aritmatika{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
       int angka2 = scanner.nextInt();

       int penjumlahan = angka1 + angka2;
        int pengurangan = angka1 - angka2;

        System.out.println("Hasil Penjumlahan: " + penjumlahan);
        System.out.println("Hasil Pengurangan: " + pengurangan);

       
    }
}
