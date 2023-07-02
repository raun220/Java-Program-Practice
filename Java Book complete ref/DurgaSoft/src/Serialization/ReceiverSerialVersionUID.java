package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReceiverSerialVersionUID {

    public static void main(String[] args) throws Exception  {

        // Deserialization
        FileInputStream fileInputStream = new FileInputStream("abc1.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
       SerialVersionUIDExample ob2 = (SerialVersionUIDExample) objectInputStream.readObject();

        System.out.println("After DeSer: " +ob2.i+" "+ ob2.j);
    }
}
