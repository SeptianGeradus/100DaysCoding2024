public class Main {
	public static void main(String[] args) {
	    //dari double ke String
double number = 1.23;
String str = String.valueOf(number);
System.out.println("variabel str : " + str);
        //dari integer ke String
 int nomor = 100;
String m = String.valueOf(nomor);
System.out.println( "m : " + m);
        //dari char ke String( (konversi dengan cara lain)
 char in='A';
 String x = Character.toString(in);
 System.out.println("x : " + x);
       //dari Short ke String (konversi dengan cara lain juga)
      short y = 123;
      String o = ""+(y);
      System.out.println("o :" +o);
      
 
	}
}
