package isc;
import java.util.*;

public class day99 {
    public static void main(String[] args) {
        Scanner oke = new Scanner(System.in);
        System.out.println("KALKULATOR BY NIEL");
            System.out.println("cara penggunaan!!");
            System.out.println("angka pertama,spasi, operator,spasi, angka kedua");
            System.out.println("operator yang di gunakan(+, -, *, /)");
            System.out.println();
        for (;;){
        System.out.print("Masukkan angka $ ");
        double angka1 = oke.nextDouble();
        char operator = oke.next().charAt(0);
        double angka2 = oke.nextDouble();
        double hasil = 0;
        boolean valid = true;
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("terjadi kesalahak silahkan coba lagi.!!!!");
                    valid = false;
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
                valid = false;
        }
        
        if (valid) {
            System.out.println("Hasil: " + hasil);
            System.out.println();
            }
        }
    }
}
