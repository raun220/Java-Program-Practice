package Serialization;

import java.io.*;

public class ExternalizationDemo implements Externalizable {
    String s;
    int i;
    int j;
    public ExternalizationDemo(){
        System.out.println("Externalizable No-Arg Constructor");
    }
    ExternalizationDemo(String s, int i, int j){
        this.s = s;
        this.i = i;
        this.j = j;
    }
    public void writeExternal(ObjectOutput out)  throws IOException{
        out.writeObject(s);
        out.writeInt(i);
    }
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
        s = (String) in.readObject();
        i = in.readInt();
    }
}
class ExtDemo{
    public static void main(String[] args) throws Exception{
        ExternalizationDemo ob1 = new ExternalizationDemo("Durga", 10, 20);
        System.out.println(ob1.s+" "+ob1.i+" "+ob1.j);

        FileOutputStream fileOutputStream = new FileOutputStream("abc.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(ob1);

        FileInputStream fileInputStream = new FileInputStream("abc.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ExternalizationDemo ob2 = (ExternalizationDemo)objectInputStream.readObject();

        System.out.println(ob2.s+" "+ob2.i+" "+ob2.j);


    }
}
