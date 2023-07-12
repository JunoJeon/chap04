
public class Exercise4_1 {
	public static void main(String[] args) {
char ch = (char)(Math.random()*128);
		
		if (ch == 'x' || ch== 'X')
			
			System.out.println("true = "+ch);
		else
			System.out.println("false = "+ch);
	}
	public static void main2(String[] args) {
		char ch = (char)(Math.random()*128);
		
		if (ch == ' ' && ch!= '\t')
			
			System.out.println("false = "+ch);
		else
			System.out.println("true = "+ch);
			
	}

	public static void main1(String[] args) {
		int x = (int)(Math.random()*21);
		
		if (x>10 && x<20)
			System.out.println("true, x = "+ x);
		else
			System.out.println("false, x = "+ x);
	}

}
