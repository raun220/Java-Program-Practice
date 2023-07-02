// What is the output of the following Java code?

/*
Correct answer: 2. Div by zero
Explanation: in try block, once an exception occur, try block will throw that exception to next catch block, without executing the rest of the code. So, here exception occur at line 8, now control will passed to catch block without executing the line 9


 Correct answer: 2. Div by zero
Explanation: in the try block, once an exception occurs, the try block will throw that exception to the next catch block, without executing the rest of the code. So, here exception occurs at line 8, now control will be passed to catch block without executing line 9
 */
public class TryCatchDemo {

    public static void main(String[] args) {
        try {
            int x = 0;
            int[] arr = {1, 2, 3};
            int result = 78 / x;
            int arrValue = arr[79];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound");
        } catch (ArithmeticException e) {
            System.out.println("Div by zero");
        }
    }
}
