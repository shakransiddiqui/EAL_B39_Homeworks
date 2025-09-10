package Mouad_Homeworks;

public class Java_Practice2 {

	public static void main(String[] args) {
	//	Task 1:please print 4 Questions below with all types of loops mentioned above.()
	                         
		                         // Print 2 to -10:
		int a = 2;
		int b = -10;
	// while loop:
	  while (a >= b) {
//		  System.out.println(b);  --
		  b++;
	  }
		// for loop:
	  for (int i = -10; i <= 2; i++) {
//		  System.out.println(i);  --
	  }
	  
	  // do while loop:
	  int x = -10;
	  do {
//		  System.out.println(x);  ---
		  x++;
	  } while (x <= a);
//	                                  Print 3 to 20
	  int c = 20;
	  int d = 3;
	  // while loop:
	  while ( c >= d) {
//		  System.out.println(d); ---
		  d++;
	  }
	  //for loop :
	  for  (int i = 3; i <= 20; i++) {
//		  System.out.println(i);  ---
	  }
	  // do while loop:
	  int m = 3;
	  do {
//		  System.out.println(m); ----
		  m++;
	  } while (m <= c);
//	                                   Print -355 to -255
	  // while loop:
	  int e = -255;
	  int f = -355;
	  while (e >= f) {
//		  System.out.println(f); -----
		  f++;
	  }
	  // for loop:
	  for (int i = -355; i <= -255; i++) {
//		  System.out.println(i);  ----
	  }
	  // do while loop:
	  int j = -355;
	  do {
//		  System.out.println(j); ----
		  j++;
	  } while (j <= e);
//	                                  Print -956 to -960
	  // while loop:
	  int g = -956;
	  int h = -960;
	  while (g >= h) {
//		  System.out.println(h);  ---
		  h++;
	  }
	  // for loop:
	  for (int i = -960; i <= -956; i++) {
//		  System.out.println(i);  ----
	  }
	  // do while loop:
	  int k = -960;
	  do {
//		  System.out.println(k);  -----
		  k++;
	  } while (k <= g);
//	                                   Print -10 to 10
	  // while loop :
	  int l = 10;
	  int n = -10;
	  while (l >= n) {
//		  System.out.println(n); ---
		  n++;
	  }
	  // for loop:
	  for (int i = -10; i <= 10; i++) {
//		  System.out.println(i);  ---
	  }
	  // do while loop:
	  int o = -10;
	  do {
//		  System.out.println(o);  ----
		  o++;
	  } while (o <= l);
//	                                   Print -5 to 5 and break if the value is 3
	  // while loop:
	  int r = 5;
	  int t = -5;
	  while (r >= t && t != 3) {
//		  System.out.println(t);  ---
		  t++;
	  }
	  // for loop:
	  for (int i = -5; i <=5 && i != 3; i++) {
//		  System.out.println(i);    ---
	  }
	  // do while loop:
	  int v = -5;
	  do {
//		  System.out.println(v);     ---
		  v++;
	  } while (v <= r && v != 3);
//	                                   Print -500 to -200 and break if the value of the variable is -278
	  // while loop:
	  int y = -200;
	  int z = -500;
	  while (y >= z && z != -278) {
//		  System.out.println(z);  ---
		  z++;
	  }
	  // for loop:
	  for (int i = -500; i <=-200 && i != -278; i++) {
//		  System.out.println(i);   ----
	  }
	  // do while loop:
	  int u = -500;
	  do {
//		  System.out.println(u);  ----
		  u++;
	  } while (u <= y && u != -278);
	  
	  
//	                                         ARRAY TASK 1:
	  // Find out the length of the array and Print all the value with the for each loop:
	  int [] numbers = new int[10];
	  numbers[0] = 1;
	  numbers[6] = 7;
	  numbers[8] = 9;
	  
	  int arrayLength = numbers.length;
	  
	  System.out.println("The length of the array is: " + arrayLength);
	  
	  for (int i = 0; i < numbers.length; i++) {
		  System.out.println("Element at index" + i + ": " + numbers[i]);
	  }
	  // Find out the length of the array and Print all the value from 1rst index to last index with for loop
	  System.out.println("The length of the array is: " + arrayLength);
	  
	  for (int i = 1; i < numbers.length; i++) {
		  System.out.println("Element at index " + i + ": " + numbers[i]);
	  }
	  // Print the value of index number 5 and index 7 individually. (Be careful with the index name . index name and index number are not same):
	  System.out.println("The value of index number 5 is: " + numbers[4]);
	  System.out.println("The value of index number 7 is: " + numbers[6]);
		/*
		 * Find out the length of the array and Print all the value from last Index
		 * (a.length-1) to first Index (Printing should be in reverse order)
		 */	  
	  for (int i = numbers.length -1; i >= 0; i--) {
		  System.out.println("Element at index " + i + ": " + numbers[i]);
	  }
		/*
		 * Find out the length of the array and Print all the value 5th index to 8th
		 * index.
		 */	  
	   for (int i = 4; i <= 7; i++) {
		   System.out.println("Element at index " + i + ": " + numbers[i]);
	   }
//	   Print all the value from 8th Index to 4th index .
	   for (int i = 7; i >= 3; i--) {
		   System.out.println("Element at index " + i + ": " + numbers[i]);
	   }
	   
//	                                             ARRAY TASK 2:
		/*
		 * Create an String array without limiting the index length(Variable Name should
		 * not be single Digit,it can be a name or anything but not a ,b, c ,d) and Put
		 * 5 String Value there.
		 */
	   // Find out the length of the array and Print all the value with for each loop
	    String[] carBrands = new String[11];
	    carBrands[0] = "Mazda";
	    carBrands[2] = "Toyota";
	    carBrands[5] = "Honda";
	    
	    System.out.println("The length of the array is : " + carBrands.length);
	    
	    for (int i = 0 ; i < carBrands.length; i++) {
	    	System.out.println("Element at index " + i + ": " + carBrands[i]);
	    }
	    
	    // Print the value of index number 3 and index 5 individually.
	    
	    System.out.println("The value of the index number 3 is : " + carBrands[2]);
	    System.out.println("The value of the index number 6 is : " + carBrands[5]);
	    
	    // Find out the length of the array and Print all the value from 1rst index to last index with For loop
	    int arrayLength1 = carBrands.length;
	    for (int i = 1; i < arrayLength1; i++) {
	    	System.out.println(i);
	    }
	    // Print all the value from last Index (a.length-1) to first Index (Printing should be in reverse order)
	    for (int i = arrayLength1 - 1; i >= 0 ; i-- ) {
	    	System.out.println("Element at index " + i + ": " + carBrands[i]);
	    }
	    // Print all the value 5th index to 8th index.
	    for (int i = 4; i <= 7; i++) {
			   System.out.println("Element at index " + i + ": " + carBrands[i]);
		   }
//		   Print all the value from 8th Index to 4th index .
		   for (int i = 7; i >= 3; i--) {
			   System.out.println("Element at index " + i + ": " + carBrands[i]);
		   }
		   
//		                                           ARRAY TASK 3
			/*
			 * Create an String array without limiting the index length(Variable Name should
			 * not be single Digit,it can be a name or anything but not a ,b, c ,d) and Put
			 * 5 String Value there.
			 */
		   String[] favoriteFoods = new String[5];
		   
		   favoriteFoods[0] = "Pizza";
		   favoriteFoods[1] = "Sushi";
		   favoriteFoods[2] = "Tacos";
		   favoriteFoods[3] = "Burgers";
		   favoriteFoods[4] = "Pasta";
		   
		// Print all the value with for each loop 
		   
		   for (String food : favoriteFoods) {
			   System.out.println(food);
		   }
		   
		   // Print the value of index number 2and index 3 individually. (Be careful with the index name.Index Name and Index number are not same.)
	       System.out.println("value at index 2: " + favoriteFoods[2] );
	       System.out.println("value at index 3: " + favoriteFoods[3] );
	       // Print all the value from 1rst index to last index with For loop
	       for (int i = 1; i < favoriteFoods.length; i++) {
	    	   System.out.println(favoriteFoods[i]);
	       }
	       
	       // Print all the value from last Index (a.length-1) to first Index (Printing should be in reverse
	       for (int i = favoriteFoods.length - 1; i >= 0; i--) {
	    	   System.out.println(favoriteFoods[i]);
	       }
	       
	       // Print all the value 5th index to 2nd index.
	       for (int i = 4; i >= 1; i--) {
	    	   System.out.println(favoriteFoods[i]);
	       }
//	                                               ARRAY TASK 4:
	       
	       // Create an int array without limiting the index length and Put 5 int Value there.
	    
	        int[] numbers2 = new int[5];

	        // Putting 5 int values
	        numbers2[0] = 10;
	        numbers2[1] = 20;
	        numbers2[2] = 30;
	        numbers2[3] = 40;
	        numbers2[4] = 50;
	        //Print all the value with for each loop
	        for (int num : numbers2) {
	            System.out.println(num);
	        }
	        // Find out the length of the array and Print all the value from 1rst index to last index with For
	        int length = numbers2.length;
	        System.out.println("Length of array: " + length);

	      
	        for (int i = 1; i < length; i++) {
	            System.out.println(numbers2[i]);
	}
	}

}
