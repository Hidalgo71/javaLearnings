package overloadingConstructor;

public class classA
{
    double num1;
    double num2;
    double num3;

    public classA()         //non-parameter ready method
    {    }

    public classA(double num1, double num2, double num3)        //parameter ready method
    {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    void test()
    {
        System.out.println("Non-P Method:");
        System.out.println("Num1: " + num1 + "\nNum2: " + num2 + "\nNum3: " + num3);
        System.out.println("===================");
    }

    void test(int num1)
    {
        System.out.println("Num1: " + num1);
        System.out.println("===================");
    }

    double test(float num1)
    {
        System.out.println("Num1: " + num1);
        System.out.println("===================");
        return num1 * num1;
    }

    double test(double num1)
    {
        System.out.println("Num1: " + num1);
        System.out.println("===================");
        return num1 * num1;
    }

    void test(int num1, int num2)
    {
        System.out.println("Num1: " + num1 + "\nNum2: " + num2);
        System.out.println("===================");
    }


    void test(int num1, int num2, int num3)
    {
        System.out.println("Num1: " + num1 + "\nNum2: " + num2 + "\nNum3: " + num3);
        System.out.println("===================");
    }
}
