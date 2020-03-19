package polymorphism;

public class finalClassMain
{
    public static void main(String[] args)
    {
        classFinalA aObjRef = null;
        classFinalB bObj = new classFinalB();
        //classFinalA aObj = new classFinalA();               //Abstract!

        System.out.println(bObj.calc3(10, 4.7));

        aObjRef = bObj;                                       //Work like B object.
        System.out.println(aObjRef.calc2(10, 4.7));
    }
}
