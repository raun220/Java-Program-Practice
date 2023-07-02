
public class MethodOverload {
    public static void foo(int x) {
        System.out.println("foo(int x) called");
    }

    public static void foo(double x) {
        System.out.println("foo(double x) called");
    }

    public static void main(String[] args) {
        char c = 'a';
        foo(c);
    }
}

