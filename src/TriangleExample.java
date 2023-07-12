
public class TriangleExample {

	public static void main(String[] args) {
		
		System.out.println("1번");
		for(int i=0; i<5; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("2번");
		for(int i=0; i<5; i++) {
			for(int j=5; j>i+1; j--) {
				System.out.print(" ");
				}
			for(int k=0; k<i+1; k++) {
				System.out.print("*");
				}
			 System.out.println();
			}
			
		
		System.out.println("3번");
		for(int i=0; i<5; i++) {
			for (int j=6; j>i+1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("4번");
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
				}
			for(int k=6; k>i+1; k--) {
				System.out.print("*");
				}
			 System.out.println();
			}
		
	}

}
