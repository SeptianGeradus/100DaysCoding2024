public class main {
    public static void main(String[] args) {
     int n = 7;
         for (int i = 1; i <= n; i += 2) {
            
         for (int j = i; j < n; j += 2) {
                System.out.print(" ");
            }
          
         for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
         System.out.println();
        }

         for (int i = n - 2; i >= 1; i -= 2) {
          
         for (int j = n; j > i; j -= 2) {
                System.out.print(" ");
            }

         for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
         System.out.println();
        }
    }
}
