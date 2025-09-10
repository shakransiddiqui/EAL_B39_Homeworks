package mouad_Java_Practice4;

//-------------------------------------------------------- Task 4 ----------------------------------------------------------------------------------------------------//


public class ClassC {
 private void greet(String name) {
     System.out.println("Hello, " + name + "!");
 }

 private void addNumbers(int a, int b) {
     System.out.println("Sum = " + (a + b));
 }

 // Public wrapper
 public void callPrivateMethods(String name, int a, int b) {
     greet(name);
     addNumbers(a, b);
 }
}
