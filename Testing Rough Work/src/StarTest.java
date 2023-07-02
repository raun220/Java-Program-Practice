import java.util.Scanner;

public class StarTest {
    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = n - 1;
        int star = 1;
        while(n!=0) {
            for(int i =1; i<=space; i++) {
                System.out.print("\t");
            }
            for(int i = 1; i<=star;i++) {
                System.out.print("*\t");
            }
            System.out.println();
            star++;
            space--;
            n--;
        }
    }
}
