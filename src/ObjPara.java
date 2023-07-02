public class ObjPara {
    int a;
     int b;
     private int c;
    ObjPara( int a, int b){
        this.a=a;
        this.b=b;
    }
    ObjPara(){
        this.a = -1;
        this.b = -1;
        this.c = -1;
    }
    boolean volume(ObjPara o){
        if(a==o.a && b==o.b)
            return true;
        else
            return false;
    }
    void meth(ObjPara o){
        o.a = o.a*2;
        o.b = o.b*2;
    }
    ObjPara test(){
        ObjPara myObj = new ObjPara(a+10, b+10);
        return myObj;
    }
    void setC(int i) {
        this.c = i;
    }
    int getC(){
        return c;
    }

}
