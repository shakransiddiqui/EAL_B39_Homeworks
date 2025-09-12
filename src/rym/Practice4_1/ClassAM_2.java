package rym.Practice4_1;

import rym.Prectice4.C1_T1_P4;

public class ClassAM_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C1_T1_P4 ob1 = new C1_T1_P4();
		
		ob1.publicNonStaticMethod1();
		
		ob1.publicNonStaticMethod2();
		
		C1_T1_P4.publicStaticMethod();
		
// Private methods — NOT accessible
        
       
         
//		ob1.privateNonStaticMethod1(); 

        // Protected methods —  not accessible in a different package
        
//        C1_T1_P4.protectedStaticMethod();
//        
//        ob1.protectedNonStaticMethod1();
//        
//        ob1.protectedNonStaticMethod2();

        // Default methods —  not accessible in a different package
        
        //C1_T1_P4.defaultStaticMethod();
        
//        ob1.defaultNonStaticMethod1();
//        
//        ob1.defaultNonStaticMethod2();
		
	}

}
