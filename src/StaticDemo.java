public class StaticDemo {
    static int a=19;
    static int b;
    static void display(int x){
        System.out.println("x:"+x);
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
    static {
        System.out.println("Static block");
        b = a*2;
        a=22;
    }

}
