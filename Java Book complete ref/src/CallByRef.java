public class CallByRef {
    double length;
    double breath;

    CallByRef(double length, double breath){
        this.length=length;
        this.breath=breath;
    }
    public void vol2(){

        System.out.println(length*breath);
    }
    public CallByRef volume(CallByRef o){
        o.length= length*2;
        o.breath= breath*2;
        return o;
    }
    public CallByRef volume3(){
        CallByRef object = new CallByRef(length+1, breath+1);
        return object;
    }


}
class Call{
    public static void main(String[] args){
        CallByRef ob1 = new CallByRef(10.1, 11.2);
        ob1.vol2();

        CallByRef ob2 = new CallByRef(10.0,10.0);
       // double d2= ob1.volume(ob1);
        //System.out.println(d2);
        CallByRef ob3 = ob1.volume(ob1);
        ob3.vol2();

        CallByRef ob4 = ob2.volume(ob1);
        ob4.vol2();

        CallByRef ob5 = ob1.volume3();
        ob5.vol2();

    }
}
