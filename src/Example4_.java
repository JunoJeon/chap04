import javax.swing.plaf.basic.BasicToolTipUI;

public class Example4_ {
	public static void main(String[] args) {
		int number =12321;
		int tmp = number;
		
		int result = 0; //변수 number를 거구로 변환해서 담을 변수
		
		while(tmp !=0) {
			result *= 10;
			result += tmp%10;
			tmp /= 10;
		}
		
		if (number == result)
			System.out.println( number + "는 회문수 입니다." );
		else 
			System.out.println( number + "는 회문수가 아닙니다.");
			
	}result
	
	public static void main4_14(String[] args) {
		int answer = (int)(Math.random()*100+1);
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			input = s.nextInt();
			
			if (input > answer) 
				System.out.println("더 작은 값을 입력하세요 :");
			else if (input < answer)
				System.out.println("더 높은 값을 입혁하세요 :");
			else {
				System.out.printf("%2d번만에 맞추셨습니다.",count);
				break;
			}		
		} while(true);
		
	}
	
	public static void main4_13(String[] args) {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		// 반복문과 charAt (int i)를 이용해서 문자열의 문자를
		// 하나씩 읽어서 검사한다.
		for (int i=0; i<value.length(); i++) {
			ch = value.charAt(i);
			if (ch>='0' && ch<='9')
				isNumber = true;
			else
				isNumber = false;
			break;
		}
		
		if (isNumber) {
			System.out.println(value+"는 숫자입니다.");
		} else {
			System.out.println(value+"는 숫자가 압니다.");
		}
	}
	
	public static void main4_11(String[] args) {
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1+","+num2);
		
		for(int i=0; i<8; i++) {
			num3 = num1+num2;
			System.out.print(","+num3);
			num1 = num2;
			num2 = num3;
		}
	
	}
	
	public static void main4_10(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while (num != 0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println("sum = " +sum);
	}
	
	public static void main4_9(String[] args) {
		String str = "123456789";
		int sum = 0;
		
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			sum = sum + ch - '0';
		}
		System.out.println("sum = "+ sum);
	}
	
	public static void main4_4(String[] args) {
		int i = 0;
		int sum = 0;
		while(true) {
			i++;
			if (i%2==0)
				sum -= i;
			else 
				sum += i;
			
			if (sum >= 100)
				break;
			
		}
		
		System.out.println(i);
		
	}
	
	public static void main3(String[] args) {
	// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+5+6+7+8+9+10)	
		int x = 0;
		int y = 0;
		for(int z = 1; z<=10; z++) {
			y += z;
			x += y;
		}
		System.out.println(x);
			
		int totalSum = 0;
		for (int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++)
				totalSum += j;
		}
		System.out.println("totalSum = " + totalSum);
		
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
