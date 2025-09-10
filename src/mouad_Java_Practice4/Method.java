// -------------------------------- Task 1 ----------------------------------------------------------------------------------------------------//
package mouad_Java_Practice4;

public class Method {

    // ---------------- PUBLIC METHODS ----------------
    public static void publicStaticMethod() {
        System.out.println("This is a PUBLIC STATIC method.");
    }

    public void publicNonStaticMethod1() {
        System.out.println("This is PUBLIC NON-STATIC method 1.");
    }

    public void publicNonStaticMethod2() {
        System.out.println("This is PUBLIC NON-STATIC method 2.");
    }

    // ---------------- PRIVATE METHODS ----------------
    private static void privateStaticMethod() {
        System.out.println("This is a PRIVATE STATIC method.");
    }

    private void privateNonStaticMethod1() {
        System.out.println("This is PRIVATE NON-STATIC method 1.");
    }

    private void privateNonStaticMethod2() {
        System.out.println("This is PRIVATE NON-STATIC method 2.");
    }

    // ---------------- PROTECTED METHODS ----------------
    protected static void protectedStaticMethod() {
        System.out.println("This is a PROTECTED STATIC method.");
    }

    protected void protectedNonStaticMethod1() {
        System.out.println("This is PROTECTED NON-STATIC method 1.");
    }

    protected void protectedNonStaticMethod2() {
        System.out.println("This is PROTECTED NON-STATIC method 2.");
    }

    // ---------------- DEFAULT (PACKAGE-PRIVATE) METHODS ----------------
    static void defaultStaticMethod() {
        System.out.println("This is a DEFAULT STATIC method.");
    }

    void defaultNonStaticMethod1() {
        System.out.println("This is DEFAULT NON-STATIC method 1.");
    }

    void defaultNonStaticMethod2() {
        System.out.println("This is DEFAULT NON-STATIC method 2.");
    }

    // Helper to show private methods (only callable inside this class)
    public static void testPrivateMethods() {
        Method obj = new Method();
        privateStaticMethod();
        obj.privateNonStaticMethod1();
        obj.privateNonStaticMethod2();
    }
}