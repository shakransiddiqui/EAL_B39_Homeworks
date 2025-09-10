package mouad_Java_Practice4;

//-------------------------------------------------------- Task 2 ----------------------------------------------------------------------------------------------------//


public class Task2 {

 // ---------- STATIC METHOD ----------
 public static void staticExample() {
     System.out.println("Called STATIC method using Class name.");
 }

 // ---------- NON-STATIC METHODS ----------
 public void nonStaticExample1() {
     System.out.println("Called NON-STATIC method using Object reference #1.");
 }

 public void nonStaticExample2() {
     System.out.println("Called NON-STATIC method using Object reference #2.");
 }

 public void nonStaticExample3() {
     System.out.println("Called NON-STATIC method using Object reference #3.");
 }

 public void nonStaticExample4() {
     System.out.println("Called NON-STATIC method using Object reference #4.");
 }

 // ---------- MAIN METHOD ----------
 public static void main(String[] args) {
     // 1) Call STATIC method using class name
     Task2.staticExample();

     // Create object
     Task2 obj = new Task2();

     // 2) Call NON-STATIC method with object reference
     obj.nonStaticExample1();

     // 3) Another NON-STATIC method
     obj.nonStaticExample2();

     // 4) Another NON-STATIC method
     obj.nonStaticExample3();

     // 5) Another NON-STATIC method
     obj.nonStaticExample4();
 }
}
