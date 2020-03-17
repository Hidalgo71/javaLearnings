package overloadingConstructor;

public class accessModifiers
{
    //Public, Protected -> default, Private Methods.
    public      int num1;
    protected   int num2;
                int num3;
    private     int num4;

    static int num5 = 8;
    static int num6;

    public final double PINUM = 3.1415926535;

    static void print(int i)                    //Static ony work with static
    {
        System.out.println("i = " + i);
        System.out.println("num5: " + num5 + " num6: " + num6);
    }

    static
    {
        System.out.println("Static block inside the area...");
        num6 = num5 * 5;
    }

    public static void main(String[] args)
    {
        print(7171);
    }

    public int getNum1()
    {
        return num1;
    }

    public void setNum1(int num1)
    {
        this.num1 = num1;
    }

    public int getNum2()
    {
        return num2;
    }

    public void setNum2(int num2)
    {
        this.num2 = num2;
    }

    public int getNum3()
    {
        return num3;
    }

    public void setNum3(int num3)
    {
        this.num3 = num3;
    }

    public int getNum4()
    {
        return num4;
    }

    public void setNum4(int num4)
    {
        this.num4 = num4;
    }

    //Final Classes
    //public final class classFinal         //Final class can't inherit
    //Final Method
    //public final String finMet()          // Final method can't override
}
