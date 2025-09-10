package mouad_Java_Practice4;

//-------------------------------------------------------- Task 4 ----------------------------------------------------------------------------------------------------//

public class ClassA {
 private void method1() {
     System.out.println("Private Method 1 in ClassA");
 }

 private void method2() {
     System.out.println("Private Method 2 in ClassA");
 }

 private void method3() {
     System.out.println("Private Method 3 in ClassA");
 }

 // Public wrapper to call private methods
 public void callPrivateMethods() {
     method1();
     method2();
     method3();
 }
}
