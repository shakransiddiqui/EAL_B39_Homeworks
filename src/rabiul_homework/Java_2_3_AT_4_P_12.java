package rabiul_homework;

/* Array Task 4 :
● Create an int array without limiting the index length and Put 5 int Value there.*/

public class Java_2_3_AT_4_P_12 {

	public static void main(String[] args) {
		
		int sap[]= {10,20,30,40,50};
		
		System.out.println("Question-1: Print all the value with for each loop");
		
		for(int x:sap) {
	 		System.out.println(x);
	 	}
		
		System.out.println("Question-2:Find out the length of the array and Print all the value from 1rst index to last index with For\r\n"+ "loop");
		
		System.out.println(sap.length);
		
		for(int x=0; x<sap.length;x++) {
	 		
	 		System.out.println(sap[x]);
	 	}
		
		System.out.println("Question-3:Print all the value from last Index (a.length-1) to first Index (Printing should be in reverse\r\n"	+ "order)");
		
		for(int x=sap.length-1;x>=0;x--) {
	 		
	 		System.out.println(sap[x]);
	 	}
		
		System.out.println("Question-4Print all the value 5th index to 2nd index");
		
		for(int x=4;x>1;x--) {
			
			System.out.println(sap[x]);
		}
	}

}
