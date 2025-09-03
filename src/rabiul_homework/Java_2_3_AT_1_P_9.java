package rabiul_homework;

/* Array Task 1 :
● Create an integer array with 10 index(Variable Name should not be single
Digit,it can be a name or anything but not a ,b, c ,d) and Put value on Index
number 1 (ex: a[0]), index number 7 , and Index number 9 

*/


public class Java_2_3_AT_1_P_9 {

	public static void main(String[] args) {

 int sap[]=new int[10];
 
 	sap[0]=31;
 	sap[6]=35;
 	sap[8]=40;
 	
 	System.out.println("Question-1: Find out the length of the array and Print all the value with for each loop ");
 	
 	System.out.println(sap.length);
 	
 	for(int x:sap) {
 		System.out.println(x);
 	}
 	
	System.out.println("Question-2: Find out the length of the array and Print all the value from 1rst index to last index with For\r\n"
			+ "loop ");
 	
 	for(int x=0;x<sap.length;x++) {
 		
 		System.out.println(sap[x]);
 	}
 	
 	System.out.println("Question-3:Print the value of index number 5 and index 7 individually. (Be careful with the index\r\n"
 			+ "name.Index Name and Index number are not same.)");
 
 System.out.println(sap[4]);
 System.out.println(sap[6]);
 	
 
 	System.out.println("Question-4:Find out the length of the array and Print all the value from last Index (a.length-1) to first Index\r\n"
 			+ "(Printing should be in reverse order)");
 	
 	for(int x=sap.length-1;x>=0;x--) {
 		
 		System.out.println(sap[x]);
 	}
 	
 	
 	System.out.println("Question-5:Find out the length of the array and Print all the value 5th index to 8th index.");
 	
 	
 	for(int x=4;x<8;x++) {
 		
 		System.out.println(sap[x]);
 	}
 	
System.out.println("Question-6: Find out the length of the array and Print all the value from 8th Index to 4th index .");

for(int x=7;x>3;x--) {
		
		System.out.println(sap[x]);
	}
 	

	}

}
