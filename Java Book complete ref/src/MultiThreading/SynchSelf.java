package MultiThreading;

public class SynchSelf {
    synchronized void call(String msg) {
        // using synchronized statement
        //  void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
class Caller2 implements Runnable {
    SynchSelf ob;
    String str;
    public Caller2(SynchSelf ob, String str){
        this.ob = ob;
        this.str = str;
    }

    @Override
    public void run() {
        ob.call(str);
    }
}

class Synch2 {
    public static void main(String[] args) throws InterruptedException {
        SynchSelf target = new SynchSelf();
        Caller2 ob1 = new Caller2(target, "Hello");
        Caller2 ob2 = new Caller2(target, "Synchronized");
        Caller2 ob3 = new Caller2(target, "World");

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);
        Thread t3 = new Thread(ob3);


        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
// wait for threads to end
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }

    }
}
