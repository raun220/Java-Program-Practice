public class CloneObject implements Cloneable {
    private int value;

    public CloneObject(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}

 class CloneCall {
    public static void main(String[] args) {
        CloneObject obj1 = new CloneObject(10);

        try {
            CloneObject obj2 = (CloneObject) obj1.clone();
            System.out.println("obj1 value: " + obj1.getValue());
            System.out.println("obj2 value: " + obj2.getValue());

            obj2.setValue(20);

            System.out.println("obj1 value after changing obj2: " + obj1.getValue());
            System.out.println("obj2 value after changing obj2: " + obj2.getValue());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

