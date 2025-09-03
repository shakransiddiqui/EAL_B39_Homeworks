package rabiul_homework;

/* Task 1: Please print 4 Questions below with all types of loops mentioned above. (While, Do While, For)
Please Create Separate classes in the same Package. 

1. Print 2 to -10 */

public class Java_2_3_T_1_1_P_8 {

	public static void main(String[] args) {
	
		int x=2;
		
		while (x>=-10) {
			
			System.out.println(x);
			
			x--;
			
		}
		
		for(int y=2;y>=-10;y--) {
			System.out.println("---------------------------------");
			System.out.println(y);
		}
		
		
		int y = 2;
		do {
		    System.out.println("+++++++++++++++++++++++++++++++");
		    System.out.println(y);
		    y--;
		} while (y >= -10);

	}

}
