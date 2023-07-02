public abstract class AbstractDemo823 {
    abstract void m1() ;
}

 class Main88 extends AbstractDemo823 {
    void m1(){
        System.out.println("m1 Hello world!");
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AbstractDemo823 ob1 = new Main88();
        ob1.m1();
    }
}