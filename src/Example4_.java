
public class Example4_ {
	
	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		for(int z = 1; z<=10; z++) {
			y += z;
			x += y;
		}
			
			System.out.println(x);
		
	}

	public static void main2(String[] args) {
		
		int x = 0;
		for(int y=0; y<21; y++)
			if (y%2!=0 || y%3!=0) {
				x = x+y;
			}
		
		System.out.println(x);

	}

}
