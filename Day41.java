import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Masukkan batas maksimal angka: ");
        int batasMaksimal = input.nextInt();

         System.out.println("Angka ganjil dari 1 hingga " + batasMaksimal + ":");
        for (int i = 1; i <= batasMaksimal; i++) {
            if (i % 2 != 0) { 
                System.out.println(i);
            }
        }

        
    }
}
