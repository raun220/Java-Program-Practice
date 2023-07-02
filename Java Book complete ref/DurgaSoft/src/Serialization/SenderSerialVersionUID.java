package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SenderSerialVersionUID {
    public static void main(String[] args) throws Exception {
        SerialVersionUIDExample ob1 = new SerialVersionUIDExample();
        //System.out.println("Before Ser: " + ob1.i + " " + ob1.j);

        // serialization
        FileOutputStream fileOutputStream = new FileOutputStream("abc1.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(ob1);

    }
}
