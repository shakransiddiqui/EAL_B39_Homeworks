// -------------------------------------------------------- Task 4 ----------------------------------------------------------------------------------------------------//

public class ClassB {
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        System.out.println("Calling ClassA private methods through public wrapper");
        obj.callPrivateMethods();
    }
}
