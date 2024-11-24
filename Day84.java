import java.util.Scanner;
import java.lang.Math;

public class pembulatan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan angka desimal: ");
        double angka = scanner.nextDouble();
        
        double ceilValue = Math.ceil(angka);
    System.out.println("Nilai dibulatkan ke atas (ceil): " + ceilValue);

        double floorValue = Math.floor(angka);
    System.out.println("Nilai dibulatkan ke bawah (floor): " + floorValue);
 
        long roundValue = Math.round(angka);
     System.out.println("Nilai dibulatkan ke angka terdekat (round): " + roundValue);

      
    }
}
