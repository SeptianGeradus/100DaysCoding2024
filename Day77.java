public class StringEqualsExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";
        String str4 = new String("Hello");

        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str1.equals(str4): " + str1.equals(str4));

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str4: " + (str1 == str4));

        System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3));
    }
}
