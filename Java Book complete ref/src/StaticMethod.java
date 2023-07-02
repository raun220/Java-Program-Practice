public class StaticMethod {
    static void m1(){
        System.out.println("Static m1()");
    }
    //  default void m2(){  }   : default only possible inside interface
}
interface StaticDemo {
    static void m3() {
        System.out.println("Static m3()");
    }

    void callback();
    // static void m8();   //error, a static method in interface should have a body
    // abstract static void m87();  // can't be both abstract  & static
    // private void m987();  //error, a private method in interface should have a body
    // default void m87();  //error, a default method in interface should have a body
}
class callingSataic extends StaticMethod implements StaticDemo{
   public void callback(){ }
    static void m2(){
        System.out.println("Static m2()");
    }
    public static void main(String[] args){
        //StaticMethod ob1 = new StaticMethod();
        callingSataic ob2  = new callingSataic();
        ob2.m2();
        ob2.m1();
        StaticMethod.m1();
        //ob2.m3();
        StaticDemo.m3();;
    }
}
