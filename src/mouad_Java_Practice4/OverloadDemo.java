package mouad_Java_Practice4;

//-------------------------------------------------------- Task 3 ----------------------------------------------------------------------------------------------------//


public class OverloadDemo {

 // ---------- METHOD OVERLOADING WITH NAME "mouad" ----------
 public void mouad() {
     System.out.println("mouad() → No parameters");
 }

 public void mouad(int a) {
     System.out.println("mouad(int) → a = " + a);
 }

 public void mouad(String name) {
     System.out.println("mouad(String) → name = " + name);
 }

 public void mouad(double d) {
     System.out.println("mouad(double) → d = " + d);
 }

 public void mouad(int a, int b) {
     System.out.println("mouad(int,int) → sum = " + (a + b));
 }

 public void mouad(String first, String last) {
     System.out.println("mouad(String,String) → " + first + " " + last);
 }

 public void mouad(boolean flag) {
     System.out.println("mouad(boolean) → flag = " + flag);
 }

 public void mouad(char c) {
     System.out.println("mouad(char) → char = " + c);
 }

 public void mouad(int[] arr) {
     System.out.println("mouad(int[]) → array length = " + arr.length);
 }

 public void mouad(Object obj) {
     System.out.println("mouad(Object) → obj = " + obj);
 }

 // ---------- CONSTRUCTOR OVERLOADING ----------
 public OverloadDemo() {
     System.out.println("Constructor 1 → No parameters");
 }

 public OverloadDemo(int a) {
     System.out.println("Constructor 2 → int = " + a);
 }

 public OverloadDemo(String s) {
     System.out.println("Constructor 3 → String = " + s);
 }

 public OverloadDemo(double d) {
     System.out.println("Constructor 4 → double = " + d);
 }

 public OverloadDemo(int a, int b) {
     System.out.println("Constructor 5 → sum = " + (a + b));
 }

 public OverloadDemo(String first, String last) {
     System.out.println("Constructor 6 → full name = " + first + " " + last);
 }

 public OverloadDemo(boolean flag) {
     System.out.println("Constructor 7 → flag = " + flag);
 }

 public OverloadDemo(char c) {
     System.out.println("Constructor 8 → char = " + c);
 }

 public OverloadDemo(int[] arr) {
     System.out.println("Constructor 9 → array length = " + arr.length);
 }

 public OverloadDemo(Object obj) {
     System.out.println("Constructor 10 → object = " + obj);
 }
}

