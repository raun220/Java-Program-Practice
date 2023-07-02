public class MethodOverl {
    public static void foo(char x) {
        System.out.println("foo(int x) called");
    }

    public static void foo(int x) {
        System.out.println("foo(double x) called");
    }

    public static void main(String[] args) {
        foo(2);
    }

}
