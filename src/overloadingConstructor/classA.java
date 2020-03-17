package overloadingConstructor;

public class classA
{
    double num1;
    double num2;
    double num3;
    int var1;
    int var2;
    int numObj;

    public classA()         //non-parameter ready method
    {    }

    classA(int numObj)
    {
        this.numObj = numObj;
    }

    public classA(double num1, double num2, double num3)        //parameter ready method
    {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    public classA(int p1, int p2)
    {
        this.var1 = p1;
        this.var2 = p2;
    }

    void sendValue(int num4, int num5)          //Call by Value, Sends Copy
    {
        num4 = num4 - 2;
        num5 = num5 + 2;
        System.out.println("sendValue Method inside the method..\n " +
                "Num4: " + num4 + " Num5: " + num5);
        //System.out.println("===================");
    }

    void sendObj(classA comingObj)              //Call by Reference, Sends original value
    {
        comingObj.var1 -= 5;
        comingObj.var2 += 5;
        System.out.println("sendObj Method inside the method..\n " +
                "Var1: " + var1 + " var2: " + var2);
    }

    //Creating object inside the method
    classA createObjInMet()
    {
        classA classAObjInMet = new classA(this.numObj + 71);
        return classAObjInMet;                  //Returning object because method type is method name
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
