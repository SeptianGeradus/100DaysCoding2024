import java.util.Scanner;

public class OperatorAritmatikaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.print("Masukkan angka pertama (a): ");
        int a = scanner.nextInt();

        System.out.print("Masukkan angka kedua (b): ");
        int b = scanner.nextInt();

        // Perkalian
        int hasilPerkalian = a * b;
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
      //  pembagian 
       int hasilPembagian = a / b;
            System.out.println("Hasil Pembagian: " + hasilPembagian);
        //modulo
        int hasilModulo = a % b;
            System.out.println("Hasil Modulo: " + hasilModulo);
            
    }
}
