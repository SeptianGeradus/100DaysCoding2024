import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih kig :");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Sate");
        System.out.println("4. Ayam Geprek");
        
        int pilihan = scanner.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.println("Oke Nasi Goreng 1.");
                break;
            case 2:
                System.out.println("Oke  Mie Ayam 1.");
                break;
            case 3:
                System.out.println(" Oke  Sate 1.");
                break;
            case 4:
                System.out.println("Oke Ayam Goreng 1.");
                break;
            default:
                System.out.println("Tidak ada.");
                break;
        }

     
    }
}
