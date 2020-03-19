package exceptionHandling;

public class controlExp extends Exception
{
    private double gap;

    public controlExp(double gap)
    {
        this.gap = gap;
    }

    public double getGap()
    {
        return gap;
    }
}
