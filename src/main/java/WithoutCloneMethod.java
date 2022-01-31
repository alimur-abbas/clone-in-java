class Test {
    int x, y;
    Test()
    {
        x = 10;
        y = 20;
    }
}
public class WithoutCloneMethod {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.x+"   "+ test.y);//10  20
        Test test1=test;
        test.x=500;
        System.out.println(test1.x+"   "+ test1.y);//500  20
        // because test and test1 share the same memory reference
        System.out.println(test.x+"   "+ test.y);//500   20
    }

}
