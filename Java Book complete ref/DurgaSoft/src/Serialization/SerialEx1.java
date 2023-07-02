package Serialization;

import java.io.*;

public class SerialEx1 implements Serializable{
    //int i =10;
     transient int i =10;
    //transient static int i =10;
    //transient final int i =10;
    int j =20;
}
class SerialDemo {
    public static void main(String[] args) throws Exception  {
        SerialEx1 ob1 = new SerialEx1();
        System.out.println("Before Ser: "+ob1.i+" "+ ob1.j);

        // serialization
        FileOutputStream fileOutputStream = new FileOutputStream("abc.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(ob1);

        // Deserialization
        FileInputStream fileInputStream = new FileInputStream("abc.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SerialEx1 ob2 = (SerialEx1) objectInputStream.readObject();

        System.out.println("After DeSer: " +ob2.i+" "+ ob2.j);
    }
}
