public class SwapApp{
	static int x = 13;
	static int y = 4;
	public static void main(String [] arg){
		System.out.println("Before swap: x = "+ x + ", y = "+ y);
		swap(x, y);
		System.out.println("After swap: x = "+ x + ", y = "+ y);
	}

	public static void swap(int a, int b){
		x = a + b;	// 17
		y = x - b;	// 13
		// System.out.println(y);
		x = x - y;	// 4
		// System.out.println(x);
	}
}