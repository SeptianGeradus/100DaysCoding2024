public class Main {
	public static void main(String[] args) {
		int a = 123;
		double b = (double)a;
		System.out.println("dari int ke double: " +b);
		
		byte x = 45;
		float y = (float)x;
		System.out.println("dari byte ke float: " +y);
		
		float € = 145.8F;
		int ¥ = (int) €;
		System.out.println("dari float ke int: "+ ¥);
		
		
		System.out.println("jumlah ¥ + y +b: " + (¥ + y + b));
	}
}
