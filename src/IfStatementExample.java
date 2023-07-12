
public class IfStatementExample {
	public static void main(String[] args) {
		int jumsu = (int)(Math.random()*51+50);
		char grade = 'F';
		
//		if (jumsu<=100 && jumsu>=90)
//			grade = 'A';
//		else if (90>jumsu && jumsu>=80)
//			grade = 'B';
//		else if (80>jumsu && jumsu>=70)
//			grade = 'C';
//		else if (70>jumsu && jumsu>=60)
//			grade = 'D';
//		else
//			grade = 'F';
		
		if (jumsu>=90)
			grade = 'A';
		else if (jumsu>=80)
			grade = 'B';
		else if (jumsu>=70)
			grade = 'C';
		else if (jumsu>=60)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.printf("%d, %c\n", jumsu, grade );
	}
	public static void main5(String[] args) {
		int num = (int)(Math.random()*4 - 2);
		
		if (num > 0)
			System.out.println("양수");
		else if (num == 0)
			System.out.println("0");
		else
			System.out.println("음수");
		
		
		System.out.println("num = " + num);
	}
	public static void main4(String[] args) {
		int num = 95;
		
		if (num%2==0) 
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
	}
	public static void main3(String[] args) {
		int num = 100;
		
		if (num%2==0) {
			System.out.println("################");
			System.out.println("짝수 num = " + num);
			System.out.println("################");	
		} else	{
			System.out.println("################");
			System.out.println("홀수 num = " + num );
			System.out.println("################");
		}
		
	}

	public static void main2(String[] args) {
		System.out.println("Hello");
		int num = 100;
		
		if (num%3==0) {
			System.out.println("if문 수행됨");
		}
		
		System.out.println("Program End");

	}

}
