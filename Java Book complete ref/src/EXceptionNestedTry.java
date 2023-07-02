public class EXceptionNestedTry {

    public static void main(String[] args) {
        try {
            //int num = 10 / 0; // this will throw an ArithmeticException
            // outer try block
            try {
                // inner try block
                int[] arr = {1, 2, 3};
                System.out.println(arr[3]); // this will throw an ArrayIndexOutOfBoundsException
            } catch (ArithmeticException e) {
                System.out.println("Inner1 catch block: " + e);
            }
           // catch (ArrayIndexOutOfBoundsException e) {
           //     System.out.println("Inner2 catch block: " + e);
          //  }

            int num = 10 / 0; // this will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Outer1 catch block: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer2 catch block: " + e);
        }

    }

}
