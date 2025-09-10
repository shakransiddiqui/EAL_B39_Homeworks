package Mouad_Homeworks;

import java.util.Arrays;

public class Java_Practice3 {

	public static void main(String[] args) {
		// Tasks 5 - Method Without Arguments - Non Return type
		/*
		 * 1) Create 5 Methods with different Datatype variables and Calulcations inside
		 * them and Call them in Main method ( You can use , addition, Subtraction, If
		 * else , Print Statement etc )
		 */
		 System.out.println("Executing all five methods from the main method...\n");

	        // Call the five methods from Task 5
	        calculateSum(10, 5);
	        determineEvenOrOdd(7);
	        combineStrings("Hello", "World");
	        calculateProduct(2.5, 3.0);
	        checkVotingEligibility(18, "John Doe");
	        
	        // --- Tasks 6 - Method With Arguments - Non Return type ---
	        
	        System.out.println("\nExecuting all five methods from Task 6...\n");
	        
	        // Calling the method that takes a String argument.
	        printGreeting("Alice");
	
	        // Calling the method that takes an int argument.
	        checkEvenOrOdd(15);
	        checkEvenOrOdd(20);
	
	        // Calling the method that takes a char argument.
	        checkVowelOrConsonant('E');
	        checkVowelOrConsonant('p');
	
	        // Calling the method that takes a double argument.
	        calculateAreaOfCircle(5.5);
	
	        // Calling the method that takes a boolean argument.
	        displayStatus(true);
	        displayStatus(false);
	
	        System.out.println("\nProgram finished.\n");
	        
	        // --- Tasks 7 - Method Without Arguments - Return type ---
	        System.out.println("--- Tasks 7 - Method Without Arguments - Return Type ---");
	        System.out.println("Executing all five return-type methods from the main method...\n");

	        // Call methods and store the returned values in variables
	        int sumResult = getIntegerSum();
	        double productResult = getDoubleProduct();
	        String messageResult = getStringMessage();
	        boolean statusResult = getBooleanStatus();
	        char firstLetterResult = getCharValue();

	        // Prove that it is returning the value by printing the calling method's value
	        System.out.println("1. Returned Integer Value (Sum): " + sumResult);
	        System.out.println("2. Returned Double Value (Product): " + productResult);
	        System.out.println("3. Returned String Value (Message): " + messageResult);
	        System.out.println("4. Returned Boolean Value (Status): " + statusResult);
	        System.out.println("5. Returned Character Value: " + firstLetterResult);
	        
	        // --- Tasks 8 - Method With Arguments - Return type ---
	        System.out.println("\n--- Tasks 8 - Method With Arguments - Return Type ---");
	        System.out.println("Executing methods that return different data types...\n");
	        
	        // 1. Get and print an Integer
	        int multipliedInt = multiplyNumbers(5, 4);
	        System.out.println("1. Returned Integer Value: " + multipliedInt);
	        
	        // 2. Get and print a Double
	        double dividedDouble = divideNumbers(10.5, 2.5);
	        System.out.printf("2. Returned Double Value: %.2f\n", dividedDouble);
	        
	        // 3. Get and print a String
	        String fullSentence = createSentence("Java", "is fun!");
	        System.out.println("3. Returned String Value: " + fullSentence);
	        
	        // 4. Get and print a Boolean
	        boolean isPositive = isNumberPositive(-10);
	        System.out.println("4. Returned Boolean Value: " + isPositive);
	        
	        // 5. Get and print a Character
	        char returnedChar = getNextCharacter('a');
	        System.out.println("5. Returned Character Value: " + returnedChar);
	        
	        // --- Task 8 - Methods Returning Arrays ---
	        System.out.println("\n--- Tasks 8 - Methods Returning Arrays with Arguments ---");
	        
	        // 1. Get and print 1D Object Array
	        Object[] returnedObjectArray = createObjectArray("Book", 2024, true);
	        System.out.println("\n1. Returned 1D Object Array:");
	        for (Object obj : returnedObjectArray) {
	            System.out.println("  " + obj);
	        }
	        System.out.println("Using Arrays.toString(): " + Arrays.toString(returnedObjectArray));
	        System.out.println();
	
	        // 2. Get and print 1D Int Array
	        int[] returnedIntArray = createIntArray(5);
	        System.out.println("2. Returned 1D Integer Array (size 5):");
	        for (int value : returnedIntArray) {
	            System.out.print(value + " ");
	        }
	        System.out.println("\nUsing Arrays.toString(): " + Arrays.toString(returnedIntArray));
	        System.out.println();
	
	        // 3. Get and print 2D String Array
	        String[][] returnedStringMatrix = createStringMatrix(2, 3);
	        System.out.println("3. Returned 2D String Array (2x3 matrix):");
	        for (String[] row : returnedStringMatrix) {
	            System.out.println(Arrays.toString(row));
	        }
	        System.out.println("Using Arrays.deepToString(): " + Arrays.deepToString(returnedStringMatrix));
	        System.out.println();
	
	        // 4. Get and print 2D Object Array
	        Object[][] returnedObjectMatrix = createObjectMatrix(2, 2);
	        System.out.println("4. Returned 2D Object Array (2x2 matrix):");
	        for (Object[] row : returnedObjectMatrix) {
	            System.out.println(Arrays.toString(row));
	        }
	        System.out.println("Using Arrays.deepToString(): " + Arrays.deepToString(returnedObjectMatrix));
	        System.out.println();
	    }

	    public static void calculateSum(int a, int b) {
	        System.out.println("--- Method 1: Integer Sum ---");
	        int sum = a + b;
	        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
	        System.out.println();
	    }

	    public static void determineEvenOrOdd(int number) {
	        System.out.println("--- Method 2: Even or Odd ---");
	        if (number % 2 == 0) {
	            System.out.println(number + " is an even number.");
	        } else {
	            System.out.println(number + " is an odd number.");
	        }
	        System.out.println();
	    }

	    public static void combineStrings(String str1, String str2) {
	        System.out.println("--- Method 3: String Concatenation ---");
	        String combinedString = str1 + " " + str2 + "!";
	        System.out.println("The combined string is: " + combinedString);
	        System.out.println();
	    }

	    public static void calculateProduct(double x, double y) {
	        System.out.println("--- Method 4: Double Product ---");
	        double product = x * y;
	        System.out.println("The product of " + x + " and " + y + " is: " + product);
	        System.out.println();
	    }
	   
	    public static void checkVotingEligibility(int age, String name) {
	        System.out.println("--- Method 5: Voting Eligibility Check ---");
	        boolean isEligible = (age >= 18);

	        if (isEligible) {
	            System.out.println(name + ", you are eligible to vote!");
	        } else {
	            System.out.println(name + ", you are not yet eligible to vote.");
	        }
	        System.out.println();
	    }
	    
	    public static void printGreeting(String name) {
	        System.out.println("--- String Method ---");
	        System.out.println("Hello, " + name + "! Welcome to the program.");
	    }
	
	    public static void checkEvenOrOdd(int number) {
	        System.out.println("--- Int Method ---");
	        if (number % 2 == 0) {
	            System.out.println("The number " + number + " is even.");
	        } else {
	            System.out.println("The number " + number + " is odd.");
	        }
	    }
	
	    public static void checkVowelOrConsonant(char character) {
	        System.out.println("--- Char Method ---");
	        char lowerCaseChar = Character.toLowerCase(character);
	        if (lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' || lowerCaseChar == 'o' || lowerCaseChar == 'u') {
	            System.out.println("The character '" + character + "' is a vowel.");
	        } else {
	            System.out.println("The character '" + character + "' is a consonant.");
	        }
	    }
	
	    public static void calculateAreaOfCircle(double radius) {
	        System.out.println("--- Double Method ---");
	        double area = Math.PI * radius * radius;
	        System.out.printf("The area of a circle with radius %.2f is %.2f.\n", radius, area);
	    }
	
	    public static void displayStatus(boolean isActive) {
	        System.out.println("--- Boolean Method ---");
	        if (isActive) {
	            System.out.println("The system is currently active.");
	        } else {
	            System.out.println("The system is currently inactive.");
	        }
	    }

	    // Tasks 7 - Method Without Arguments - Return type
	    
		/*
		 * 1) Create 5 Return type Methods which will return Different data type Values.
		 * Create Different Data Type and Calculations inside them and Call them in Main
		 * method ( You can use , addition, Subtraction, If else , Print Statement etc )
		 * . And Prove that it is returning the Value ( By Printing the Calling method’s
		 * value , you can prove that)
		 */
	   
	    public static int getIntegerSum() {
	        int a = 100;
	        int b = 50;
	        return a + b;
	    }
	
	  
	    public static double getDoubleProduct() {
	        double x = 7.5;
	        double y = 2.0;
	        return x * y;
	    }
	
	 
	    public static String getStringMessage() {
	        return "This message was returned from a method.";
	    }
	
	   
	    public static boolean getBooleanStatus() {
	        boolean status = true;
	        return status;
	    }
	
	  
	    public static char getCharValue() {
	        return 'Z';
	    }
	
		/*
		 * 2) Create 4 Return type Methods .4 DIfferent Methods will return (1 dim
		 * Object Array,1 dim Int array,2 Dim String Array, 2 Dim Object Array). And
		 * Prove that it is returning the Value ( By Printing the Calling method’s value
		 * , you can prove that But remember , if it is returning an Array , You have to
		 * put the return value in an Array box. And you can prove it by printing with
		 * for Each loops/. For loops) – check next 2 example ss for reference
		 */
	
	   
	    public static int[] getIntArray() {
	        int[] numbers = {1, 2, 3, 4, 5};
	        return numbers;
	    }
	
	   
	    public static Object[] getObjectArray() {
	        Object[] data = {"Apple", 123, 45.67};
	        return data;
	    }
	
	   
	    public static String[][] getStringMatrix() {
	        String[][] matrix = {
	            {"A", "B", "C"},
	            {"D", "E", "F"}
	        };
	        return matrix;
	    }
	
	   
	    public static Object[][] getObjectMatrix() {
	        Object[][] matrix = {
	            {"Row 1", 10, true},
	            {"Row 2", 20, false}
	        };
	        return matrix;
	    }

	    // --- Tasks 8 - Method With Arguments - Return type ---
	    
		/*
		 * 1) Create 5 Return type Methods which will return Different data type Values.
		 * Put different Different Data Type Input parameter and do some Calculations
		 * inside the method body ,Return a Value and Call the method from Main method (
		 * You can use , addition, Subtraction, If else , Print Statement etc ) . And
		 * Prove that it is returning the Value ( By Printing the Calling method’s value
		 * , you can prove that)
		 */
	    
	    public static int multiplyNumbers(int a, int b) {
	        return a * b;
	    }
	
	    
	    public static double divideNumbers(double x, double y) {
	        if (y != 0) {
	            return x / y;
	        } else {
	            System.out.println("Cannot divide by zero.");
	            return 0.0;
	        }
	    }
	
	    
	    public static String createSentence(String part1, String part2) {
	        return part1 + " " + part2;
	    }
	
	    
	    public static boolean isNumberPositive(int number) {
	        return number > 0;
	    }
	
	    
	    public static char getNextCharacter(char character) {
	        return (char) (character + 1);
	    }
	
		/*
		 * 2) Create 4 Return type Methods .4 DIfferent Methods will return (1 dim
		 * Object Array,1 dim Int array,2 Dim String Array, 2 Dim Object Array). Put
		 * different Different Data Type Input parameter And Prove that it is returning
		 * the Value ( By Printing the Calling method’s value , you can prove that But
		 * remember if it is , if it is returning an Array , You have to put the return
		 * value in an Array box. And you can prove it by printing with for Each loops/.
		 * For loops) – check next 2 example ss for reference
		 */
	    
	   
	    public static Object[] createObjectArray(String arg1, int arg2, boolean arg3) {
	        Object[] arr = {arg1, arg2, arg3};
	        return arr;
	    }
	
	   
	    public static int[] createIntArray(int size) {
	        int[] arr = new int[size];
	        for (int i = 0; i < size; i++) {
	            arr[i] = i * 10;
	        }
	        return arr;
	    }
	
	    
	    public static String[][] createStringMatrix(int rows, int cols) {
	        String[][] matrix = new String[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = "R" + (i + 1) + "C" + (j + 1);
	            }
	        }
	        return matrix;
	    }
	
	    
	    public static Object[][] createObjectMatrix(int rows, int cols) {
	        Object[][] matrix = new Object[rows][cols];
	        matrix[0][0] = "Header";
	        matrix[0][1] = 1;
	        matrix[1][0] = "Data";
	        matrix[1][1] = false;
	        return matrix;
	    }
}