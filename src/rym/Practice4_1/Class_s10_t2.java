package rym.Practice4_1;

public class Class_s10_t2 {

	public static void main(String[] args) {
		
		Task3_P4 obj = new Task3_P4();
		
		obj.rymbouchouka(true);
		System.out.println("the response is true");
		
		obj.rymbouchouka(5.5);
		
		System.out.println("the average is "+ 5.5);
		
		
		obj.rymbouchouka(10);
		
		System.out.println("the value of x is "+ 10);
		
		obj.rymbouchouka(1000000000);
		
	System.out.println("the amount of the house is "+ 100000000);
		
	
		obj.rymbouchouka("Rym");
		System.out.println("my name is Rym");
		
		obj.rymbouchouka(20.1, 6.7f);
		
		System.out.println("the temperatures to day will be between 20.1 and 6.7");
		
		obj.rymbouchouka(13, "street");
		
		System.out.println("the adress is "+13+ " street");
		
		obj.rymbouchouka(211111, 12.25);
		
		System.out.println("the values are"+ 12.25+211111);
		
		obj.rymbouchouka("Adam", 7);
		
		System.out.println("Adam is "+ 7 + " years old");
		
		obj.rymbouchouka("Adam", 20 , 7);
		
		System.out.println("Adam is "+ 20 +" pound, "+ 7+ "ft");
		
		
		/// Calling overloaded constructors
		
		
		Constructor_P4 c1= new Constructor_P4();
		
		Constructor_P4 c2= new Constructor_P4(10);
		
		Constructor_P4 c3= new Constructor_P4(5.6f);
		
		Constructor_P4 c4= new Constructor_P4(45.23);
		
		Constructor_P4 c5= new Constructor_P4("Rym");
		
		Constructor_P4 c6= new Constructor_P4("rym", 36);
		
		Constructor_P4 c7= new Constructor_P4(36, "Rym");
		
		Constructor_P4 c8= new Constructor_P4((short)2025, (byte)45);
		
		Constructor_P4 c9= new Constructor_P4('c', true);
		
		Constructor_P4 c10= new Constructor_P4(10, (byte)45);
		
			

	}

}
