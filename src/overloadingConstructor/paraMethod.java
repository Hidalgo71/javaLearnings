package overloadingConstructor;

public class paraMethod
{
    double num1;
    double num2;

    public paraMethod()
    {
        this.num1 = 71;
        this.num2 = 812;
    }

    public paraMethod(double num1, double num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    boolean compareObj(paraMethod objectAPara)
    {
        return objectAPara.num1 == this.num1 && objectAPara.num2 == this.num2;
    }
}
