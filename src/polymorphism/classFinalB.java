package polymorphism;

public class classFinalB extends classFinalA
{

    @Override
    protected double calc2(int p1, double p2) {
        return p1 + p2;
    }

/*    @Override
    protected final double calc3(int p1, double p2)
    {
        return p1 * p2 * 100;
    }*/
}
