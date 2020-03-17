package overloadingConstructor;

public class classB
{
    public static void main(String[] args)
    {

        classA aObj = new classA();
        double result;
        int iNum = 3;
        int num4 = 14;
        int num5 = 53;

        aObj.test();
        aObj.test(2);
        aObj.test(4, 5);
        aObj.test(8, 9, iNum);

        result = aObj.test(26f);        //calls double method f knows
        System.out.println(result);

        System.out.println(aObj.test(26.0));

        classA aObj2 = new classA(10, 7, 1);
        aObj2.test();

        classA obj1 = new classA();
        System.out.println("Class B before values passed: " + num4 + " " + num5);
        obj1.sendValue(num4, num5);
        System.out.println("Class B after values passed: " + num4 + " " + num5);

        System.out.println("===================");

        classA obj2 = new classA(num4, num5);
        System.out.println("Class B before object passed: " + obj2.var1 + " " + obj2.var2);
        obj2.sendObj(obj2);
        System.out.println("Class B after object passed: " + obj2.var1 + " " + obj2.var2);

        System.out.println("===================");

        classA obj3 = new classA(5);
        classA obj4;

        obj4 = obj3.createObjInMet();
        System.out.println("Obj3 value: " + obj3.numObj);
        System.out.println("Obj4 value: " + obj4.numObj);

        obj4 = obj4.createObjInMet();
        System.out.println("Obj4 after method called: " + "Numeric Value:" + obj4.numObj);
        System.out.println("Obj3 after method called: " + "Numeric Value:" + obj3.numObj);
    }
}
