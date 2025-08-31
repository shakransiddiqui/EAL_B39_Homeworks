package rabiul_homework;

// 7. Print -500 to -200 and break if the value of the variable is -278


public class Java_2_3_T_1_7_P_8 {

	public static void main(String[] args) {
	    int x=-500;
		
			while (x<=-200) {
				
				if(x==-278) {
					System.out.println(x);
					break;
				}
				
				
				x++;
				
			}
			
			for(int y=-500;y<=-200;y++) {
				
				
				if(y==-278) {
					System.out.println(y);
					break;
				}
				
			}

	}

}
