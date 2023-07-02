public class ThrowsDemo {
    static void m1() throws IllegalAccessException, NullPointerException, ArithmeticException {
        System.out.println("Inside throws");
        throw new IllegalAccessException("demo");
      //  throw new NullPointerException("demo");
    }
    public static void main(String[] args) {
        try {
            m1();
        } catch (NullPointerException e) {
            System.out.println("Recaught" + e);
        }
        catch (IllegalAccessException e) {
           System.out.println("Recaught " +e);
        }
    }
}
