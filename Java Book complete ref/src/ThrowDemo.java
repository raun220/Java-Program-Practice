public class ThrowDemo {
    static void m1() {
        try {
            throw new NullPointerException("Demo");

        } catch (NullPointerException e) {
            System.out.println("Caught");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            m1();
        } catch (NullPointerException e) {
            System.out.println("Recaught" + e);
        }
    }
}
