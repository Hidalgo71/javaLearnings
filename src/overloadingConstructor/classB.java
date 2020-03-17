package overloadingConstructor;

public class classB
{
    public static void main(String[] args)
    {
        classA aObj = new classA();
        double result;
        int iNum = 3;

        aObj.test();
        aObj.test(2);
        aObj.test(4, 5);
        aObj.test(8, 9, iNum);

        result = aObj.test(26f);        //calls double method f knows
        System.out.println(result);

        System.out.println(aObj.test(26.0));

        classA aObj2 = new classA(10, 7, 1);
        aObj2.test();
    }
}
