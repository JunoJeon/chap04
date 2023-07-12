
public class StatementExample {
	public static void main3(String[] args) {
		char ch =(char)(Math.random()*26 + 'A');
		
		switch (ch) {
		case 'A':
		case 'I':
		case 'E':
		case 'O':
		case 'U':
			System.out.println("모음");
			break;
		default :
			System.out.println("자음");
		}
	}

	public static void main(String[] args) {
		int num = (int)(Math.random()*5);
		char ch = '모';
//		
//		if (num == 0) 
//			ch = '도';
//		else if (num == 1)
//			ch = '개';
//		else if (num == 2)
//			ch = '걸';
//		else if (num == 3)
//			ch = '윷';
//		else
//			ch = '모';
//		
//		System.out.println(ch);
		
		switch (num) {
		case 0:
			ch = '도';
			break;
		case 1:
			ch = '개';
			break;
		case 2:
			ch = '걸';
			break;
		case 3:
			ch = '윷';
			break;
		case 4:
			ch = '모';
			break;
			
			default:
				break;	
		}
		
		System.out.printf("[%d,%c]\n", num, ch);

	}

}
