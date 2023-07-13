
public class ContinueStatmantExample {

	public static void main(String[] args) {
		
		int sum1 = 0;
		int sum2 = 0;
		
		
		for(int i=0; i<=100; i++) {
			
			if (i%3==0) {
				sum1 += i;
				continue;
			}
			
			sum2 += i;
			
		}
		
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);
	}

}
