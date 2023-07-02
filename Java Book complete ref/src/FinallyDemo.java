public class FinallyDemo {
    static void m1() {
        try {

            throw new NullPointerException("Demo");


        } catch (NullPointerException e) {

            System.out.println("Caught m1()");
            throw e;
        } finally {
            System.out.println("m1() finally");
        }
    }
    static void m2(){
        try{
            System.out.println("m2()");
            return;
        }catch (NullPointerException e) {

            System.out.println("Caught m2()");
            //
        } finally {
            System.out.println("m2() finally");
        }

    }
    public static void main(String[] args) {
        try {
            m1();
        } catch (NullPointerException e) {
            System.out.println("Recaught" + e);
        }
        m2();
    }
}
