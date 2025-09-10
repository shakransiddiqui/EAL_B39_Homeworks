package mouad_Java_Practice4;

//-------------------------------------------------------- Task 3 ----------------------------------------------------------------------------------------------------//


public class S10t2 {
 public static void main(String[] args) {
     System.out.println("=== Method Overloading Calls ===");
     OverloadDemo obj = new OverloadDemo();

     obj.mouad();
     obj.mouad(10);
     obj.mouad("Mouad");
     obj.mouad(15.5);
     obj.mouad(5, 7);
     obj.mouad("Toyota", "Honda");
     obj.mouad(true);
     obj.mouad('A');
     obj.mouad(new int[]{1, 2, 3});
     obj.mouad(new java.util.Date());

     System.out.println("\n=== Constructor Overloading Calls ===");
     new OverloadDemo();
     new OverloadDemo(42);
     new OverloadDemo("Hello");
     new OverloadDemo(9.99);
     new OverloadDemo(3, 4);
     new OverloadDemo("First", "Last");
     new OverloadDemo(false);
     new OverloadDemo('Z');
     new OverloadDemo(new int[]{10, 20, 30, 40});
     new OverloadDemo("Custom Object");
 }
}
