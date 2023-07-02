interface A {
    int MAX_VALUE = 100;
    void methodA();
    default void m1(){
        System.out.println("A Default");
    }
 }
 interface C{
     default void m1(){
         System.out.println("A Default");
     }
 }

interface B extends A,C{
    int x=1;
    void methodB();
    default void m1(){
        //super();
        System.out.println("B Default");
    }
}

public class MultipleInheritance extends MethodOverl implements A, B {
    public void methodA() {
        System.out.println("Implementation of methodA from interface A");
    }
    public void methodB() {
        System.out.println("Implementation of methodB from interface B");
    }
    public void m1(){
       // A.super.m1();
        System.out.println("MI Default");
    }

    public static void main(String[] args){
        MultipleInheritance multipleInheritance = new MultipleInheritance();
        multipleInheritance.methodA();
        multipleInheritance.m1();
       //A.super.m1();
        A a = new MultipleInheritance();
        a.m1(); // calls the default method of interface A


    }
}


