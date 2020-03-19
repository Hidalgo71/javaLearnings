package polymorphism;

public abstract class classFinalA
{
    final double PI = 3.1415;

    protected double calc1(int p1, double p2)
    {
        return p1 * p2;
    }

    protected abstract double calc2(int p1, double p2);

    protected final double calc3(int p1, double p2)
    {
        return p1 * p2 * 100;
    }
}