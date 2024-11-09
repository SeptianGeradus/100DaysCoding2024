import java.util.Scanner;

public class main {
    
  
    public static double hitung(double angka1, double angka2, char operator) {
        double hasil = 0;
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
                    System.out.println("Error: harus dengan nol ");
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
                break;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        double hasil = hitung(angka1, angka2, operator);
        System.out.println("Hasil: " + hasil);

        
    }
}
