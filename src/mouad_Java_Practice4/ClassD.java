package mouad_Java_Practice4;

//-------------------------------------------------------- Task 4 ----------------------------------------------------------------------------------------------------//

public class ClassD {
 public static void main(String[] args) {
     ClassC obj = new ClassC();
     System.out.println("Calling ClassC private methods with parameters");
     obj.callPrivateMethods("Mouad", 10, 20);
 }
}
