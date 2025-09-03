package rym.Prectice4;

public class ClassAM_1 {
	
	public static void main(String[] args) {
        C1_T1_P4 obj = new C1_T1_P4 ();

        // Public methods
        
        obj.publicNonStaticMethod1();
        
        obj.publicNonStaticMethod2();
        
        C1_T1_P4.publicStaticMethod();;

        // Private methods — NOT accessible
        
        // AccessLevelDemo.privateStaticMethod(); ❌
        // obj.privateNonStaticMethod1(); ❌

        // Protected methods — accessible in same package
        
        C1_T1_P4.protectedStaticMethod();
        
        obj.protectedNonStaticMethod1();
        
        obj.protectedNonStaticMethod2();

        // Default methods — accessible in same package
        
        C1_T1_P4.defaultStaticMethod();
        
        obj.defaultNonStaticMethod1();
        
        obj.defaultNonStaticMethod2();
    }


}
