public class Main {
    public static void main(String[] args) {
        
        String string1 = "Hello World";
        String string2 = "hello world";

        
        if (string1.equalsIgnoreCase(string2)) {
            System.out.println("Kedua string sama (tanpa memperhatikan huruf kapital)");
        } else {
            System.out.println("Kedua string berbeda");
        }
    }
}
