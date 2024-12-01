import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan kata pertama: ");
        String a = scanner.nextLine();
        
        System.out.print("Masukkan kata kedua: ");
        String b = scanner.nextLine();
        
        
        if (a.equals("You") && b .equals("I")) {
            System.out.println("You and I");
        } else {
            System.out.println("end");
        }
        
    }
}
