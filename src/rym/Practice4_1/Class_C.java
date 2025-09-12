package rym.Practice4_1;

public class Class_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static void equation(int x, int y) {
		
		System.out.println(" this is x , y equation");
		
		
	}
	
	private static void equation1(String axe) {
		
		System.out.println("this is equation 1");
	}
	
	// return Type private methods
	
	private static int equation2(int x) {
		
		return x+x;
		
		
	}
		
		private static String callingfeature(String call) {
			
			return call ;
		
		
		
	}
	
	public static void testmethod2() {
		
		equation1("Rym");
		
		equation(10,5);
		
		equation2(4);
		callingfeature("Rym");
		
		
		
	}
	
	

}
