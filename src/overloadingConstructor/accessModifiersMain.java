package overloadingConstructor;

public class accessModifiersMain
{
    public static void main(String[] args)
    {
        accessModifiers obj = new accessModifiers();                        //Creating Object.

        obj.num1 = 1;
        obj.num2 = 2;
        obj.num3 = 3;
        //obj.num4 = 4; Private!

        System.out.println("Num1: " + obj.num1);
        System.out.println("Num2: " + obj.num2);
        System.out.println("Num3: " + obj.num3);

        System.out.println("==========PUBLIC=========");

        obj.setNum1(10);
        System.out.println("Num1: " + obj.num1);
        System.out.println("Num1: " + obj.getNum1());

        System.out.println("==========DEFAULT=========");

        obj.setNum2(20);
        System.out.println("Num2: " + obj.num2);
        System.out.println("Num2: " + obj.getNum2());

        System.out.println("=========PROTECTED==========");

        obj.setNum3(30);
        System.out.println("Num3: " + obj.num3);
        System.out.println("Num3: " + obj.getNum3());

        System.out.println("=========PRIVATE==========");

        obj.setNum4(40);
        //System.out.println("Num3: " + obj.num4);          //Private Cant access
        System.out.println("Num3: " + obj.getNum4());
    }
}
