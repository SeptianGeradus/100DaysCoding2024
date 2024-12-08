public class main {
    public static void main(String[] args) {
        int x = 3;  
        int y = 10;
        int total = 0;

        if (x % 2 != 0) {
        }

        for (int i = x; i <= y; i += 2) {
            total += i;
        }
        System.out.println("Total penjumlahan bilangan genap dari " + x + " ke " + y + " adalah: " + total);
    }
}
