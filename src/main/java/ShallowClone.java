class Abc {
    int x, y;
}
class Xyz implements Cloneable{
    int a;
    int b;
    Abc abc = new Abc();
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    }
public class ShallowClone {
    public static void main(String[] args) throws CloneNotSupportedException {
       Xyz xyz =new Xyz();
       xyz.a=100;
       xyz.b=700;
       xyz.abc.x=110;
       xyz.abc.y=220;
        System.out.println(xyz.a+"  "+ xyz.b+"  "+xyz.abc.x+"   "+xyz.abc.y);//100 700 110 220
       Xyz xyz1= (Xyz) xyz.clone();
       xyz1.a=01;
       xyz1.abc.y= 22;// this will be modified for both xyz1 as well as xyz object.
        System.out.println(xyz1.a+"  "+ xyz1.b+"  "+xyz1.abc.x+"   "+xyz1.abc.y);// 1 700 110 22
        System.out.println(xyz.a+"  "+ xyz.b+"  "+xyz.abc.x+"   "+xyz.abc.y);// 100 700 110 22
        // (both object xyz and xyz1 are refering to the same address of object abc so xyz.abc.y and xyz1.abc.y gives same output.)
    }
}

