
abstract class Abs{
    abstract void m1();
    abstract void m2();

}


public class AbstractDemo extends Abs{
    public void m1(){
        System.out.print("Hi");
    }

    @Override
    void m2() {

    }

    public static void main(String[] args) {
       AbstractDemo ob1 = new AbstractDemo();
    }

}
