package polymorphism;

public class abstractClassB extends abstractClassA
{

    @Override
    protected int calc() {
        return 0;
    }

    @Override
    protected int sum() {
        return 0;
    }

    @Override
    double divide() {
        return 0;
    }

    //abstractClassA aObj = abstractClassA();               //Forbidden!
    abstractClassA aObjRef;                                 //Allowed
}
