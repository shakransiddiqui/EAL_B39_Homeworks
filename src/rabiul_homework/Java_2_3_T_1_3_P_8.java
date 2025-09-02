package rabiul_homework;

// 3. Print -355 to -255

public class Java_2_3_T_1_3_P_8 {

	public static void main(String[] args) {
        int x=-355;
		
		while (x<=-255) {
			
			System.out.println(x);
			
			x++;
			
		}
		
		for(int y=-355;y<=-255;y++) {
			System.out.println("---------------------------------");
			System.out.println(y);
		}
		
		
		int y = -355;
		do {
		    System.out.println("+++++++++++++++++++++++++++++++");
		    System.out.println(y);
		    y++;
		} while (y<=-255);
		
	}

}
