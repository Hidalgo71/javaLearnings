package polymorphism;

public abstract class abstractClassA                //forces other classes, methods use your methods!
{

    public abstractClassA()
    {        super();    }


    abstract int calc();
    abstract int sum();
    double multiply()                               //It's not ABSTRACT, this method is no forced to use!
    {
        return 2*3;
    }
    abstract double divide();

}
