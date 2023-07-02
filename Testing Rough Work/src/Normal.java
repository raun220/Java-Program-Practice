




abstract class AbstractDemo{
    AbstractDemo(){
        System.out.println("Inside Abstract");
    }

}

public class Normal extends AbstractDemo {

    Normal(){
        System.out.println("Inside Normal");
    }

    public static void main(String[] args) {
        Normal obj = new Normal();
    }
}