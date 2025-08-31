package rabiul_homework;


// 6. Print -5 to 5 and break if the value is 3

public class Java_2_3_T_1_6_P_8 {

	public static void main(String[] args) {

		int x=-5;
		
		while (x<=5) {
			
			if(x==3) {
				System.out.println(x);
				break;
			}
			
						
			x++;
			
		}
		
		for(int y=-5;y<=5;y++) {
			
			
			if(y==3) {
				System.out.println(y);
				break;
			}
			
		}
		
		
	}
}
