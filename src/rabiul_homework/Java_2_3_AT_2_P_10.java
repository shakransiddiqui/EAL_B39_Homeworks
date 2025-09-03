package rabiul_homework;

/* Array Task 2 :
● Create an String array with 11 index (Variable Name should not be single
Digit,it can be a name or anything but not a ,b, c ,d) and Put any value on
Index number 1 (ex: a[0]), index number 3 , and Index number 6. */

public class Java_2_3_AT_2_P_10 {

	public static void main(String[] args) {
		
		String sap[]=new String[11];
		
		sap[0]="Mohammad";
		sap[2]="Rabiul";
		sap[5]="Awal";
		
		
		System.out.println("Question-1: Find out the length of the array and Print all the value with for each loop");
		
		System.out.println(sap.length);
	 	
	 	for(String x:sap) {
	 		System.out.println(x);
	 	}
	 	
	 	
	 	System.out.println("Question-2: Print the value of index number 3 and index 5 individually.");
	 	
	 	System.out.println(sap[2]);
	 	System.out.println(sap[4]);
	 	
	 	System.out.println("Question-3: Find out the length of the array and Print all the value from 1rst index to last index with For\r\n"+ "loop");

		for(int x=0; x<sap.length;x++) {
	 		
	 		System.out.println(sap[x]);
	 	}
		
		System.out.println("Question-4:Print all the value from last Index (a.length-1) to first Index (Printing should be in reverse\r\n"+ "order)");
		
		for(int x=sap.length-1;x>=0;x--) {
	 		
	 		System.out.println(sap[x]);
	 	}
		
		System.out.println("Question-5:Print all the value 5th index to 8th index.");
		
		for(int x=4;x<8;x++) {
	 		
	 		System.out.println(sap[x]);
	 	}
		
		System.out.println("Question-6: Find out the length of the array and Print all the value from 8th Index to 4th index .");

		for(int x=7;x>3;x--) {
				
				System.out.println(sap[x]);
			}
		
		
		
		
		
	}

}
