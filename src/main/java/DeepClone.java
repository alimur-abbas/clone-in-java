class Pqr
{
    int x, y;
}
class Mno implements Cloneable{
    int a,b;
    Pqr pqr = new Pqr();
    public Mno clone() throws CloneNotSupportedException {
        Mno mno = (Mno) super.clone();
        mno.pqr= new Pqr();// create a new refernce(address) for the pqr oblect of the class Pqr
        mno.pqr.x= pqr.x; // passed the state of the variables of class Pqr with previous pqr object
        mno.pqr.y= pqr.y; // further changes made to the variable will be reflected in the new memory location no the previous one
        return mno;
    }
}
public class DeepClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mno mno = new Mno();
        mno.a=100;
        mno.b=200;
        mno.pqr.x=300;
        mno.pqr.y=400;
        System.out.println(mno.a+" "+ mno.b+" "+mno.pqr.x+" "+mno.pqr.y);//100 200 300 400
        Mno mno1 =  mno.clone();
        mno1.a=500;
        mno1.pqr.x=600;
        System.out.println(mno1.a+" "+mno1.b+" "+mno1.pqr.x+" "+mno1.pqr.y);// 500 200 600 400
        // only mno1.a and mno1.pqr.x value changed
        System.out.println(mno.a+" "+ mno.b+" "+mno.pqr.x+" "+mno.pqr.y);//  100 200 300 400
        // changes made on the variables doesn't reflected in all other object.
    }
}
