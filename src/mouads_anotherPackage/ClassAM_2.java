package mouads_anotherPackage;

//-------------------------------------------------------- Task 1 from Java_Practice 4 ----------------------------------------------------------------------------------------------------//
import mouad_Java_Practice4.Method;

public class ClassAM_2 extends Method{
 public static void main(String[] args) {
     Method obj = new Method();
     ClassAM_2 childObj = new ClassAM_2();

     System.out.println("=== DIFFERENT PACKAGE TEST ===");

     Method.publicStaticMethod();
     obj.publicNonStaticMethod1();
     obj.publicNonStaticMethod2();

     ClassAM_2.protectedStaticMethod(); 
     childObj.protectedNonStaticMethod1(); 
     childObj.protectedNonStaticMethod2();
 }
}
