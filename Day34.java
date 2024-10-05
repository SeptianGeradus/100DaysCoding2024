import java.util.Scanner;

public class Saran {
    public static void main(String[] args) {
        Scanner  scanner= new Scanner(System.in);

        System.out.print("Masukkan nama crush: ");
        String a = scanner.nextLine();

       System.out.print("Masukkan umur crush: ");
         int b = scanner.nextInt();

        System.out.print("Masukkan tinggi badan crush (cm): ");
        double c = scanner.nextDouble();
        
        System.out.print("Apakah Dia Friendly ? (true/false): ");
        boolean friendly = scanner.nextBoolean();
        
        System.out.printf ("nama crush kamu adalah %s , dia berumur  %d ,Tinggi badannya %.1fcm \n", a,b,c );

         if (friendly ) {
            System.out.println("Saran Saya Ganti Karena Klo Friendly Kemungkinan Buaya Itu Wkwk ");
        } else {
            System.out.println(" Gas Trus ,Kejar  ");
        }

        scanner.close();
    }
}
