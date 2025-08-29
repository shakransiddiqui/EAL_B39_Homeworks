package rym.datatypes;

public class Rym_Task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  1 - int + int + int 
		
		int x = 5;
		int y = 3;
		int z = 7;
		int b = x+y+z;
		
		String s1 = "the value of s1 is = ";
		
		System.out.println(s1 + b);
		
		// 2 - int+string+int
		
		String s2 = "Hi Rym";
		
		String s3 = x+s2+z;
		
		String s4 = "2. int+String+int is ";
				
				System.out.println(s4 + s3);
				
		// 3 - float+double+int
				
				float f1 = 7.66f;
				
				double d1 = 8.04;
				
			double d2 = f1 +d1 + x;
			
			String s5 = "3. float+double+int is ";
					
					System.out.println(s5+d2);
					
		// 4 - string+float+int
					
					String s6 = s2+f1+y;
					String s7 = "4. string+ float+int is ";
					
					System.out.println(s7+s6);
					
		//5. float+int+string
					
					String s8 = f1+y+s2;
					
				String s9 = "5. float+int+String is ";
						
						System.out.println(s9+s8);
						
		// 6. float+int+float+double
						
						float f2 = 10.05f;
						
						double s10 = f2+x+f1+d1;
						
						String s11 = "6. float+int+float+double is ";
						
						System.out.println(s11+s10);
						
						
			//7. String+int+double+String
						
		String s12 = "hello world";
			String s13 = s2+y+d1+ s12;
			
			String s14 = "7. String+int+double+String is ";
			
			System.out.println(s14+s13);
			
		//  8. String+int+String+double
			
			String s15 = s12+x+s2+d2;
			String s16 = "8. String+int+String+double is";
			
			System.out.println(s16+s15);
			
		// 9. int+int+String + (int+int+int)
			 int i1 = 6;
			 int i2 = 10;
			 
			 String s17 = i1+i2+s2+(x+y+i1);
			 
			 String s18= "9. int +int+String+(int+int+int) is ";
			 
			System.out.println(s18+s17);
	}

}
