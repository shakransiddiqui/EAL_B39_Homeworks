// --------------------------------- Task 1 ----------------------------------------------------------------------------------------------------//
package mouad_Java_Practice4;

public class ClassAM_1 {
    public static void main(String[] args) {
        Method obj = new Method();

        System.out.println("=== SAME PACKAGE TEST ===");

        
        Method.publicStaticMethod();
        obj.publicNonStaticMethod1();
        obj.publicNonStaticMethod2();

        

        
        Method.protectedStaticMethod();
        obj.protectedNonStaticMethod1();
        obj.protectedNonStaticMethod2();

      
        Method.defaultStaticMethod();
        obj.defaultNonStaticMethod1();
        obj.defaultNonStaticMethod2();
    }
}
