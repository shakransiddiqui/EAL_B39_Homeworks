package mouad_Java_Practice4;

//-------------------------------------------------------- Task 4 ----------------------------------------------------------------------------------------------------//

public class ClassE {
 private ClassE createObj1() {
     System.out.println("createObj1() returning new ClassE object");
     return new ClassE();
 }

 private ClassE createObj2() {
     System.out.println("createObj2() returning new ClassE object");
     return new ClassE();
 }

 private ClassE createObj3() {
     System.out.println("createObj3() returning new ClassE object");
     return new ClassE();
 }

 // Public wrapper to expose private methods
 public void testReturnMethods() {
     ClassE obj1 = createObj1();
     ClassE obj2 = createObj2();
     ClassE obj3 = createObj3();

     System.out.println("Objects created: " + obj1 + ", " + obj2 + ", " + obj3);
 }
}
