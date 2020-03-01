package javaLearningPack;

public class dynamicVariables
{
    public static void main(String[] args)
    {
        int num1 = 7;
        int num2 = 15;
        float num3 = 40.0f;
        double numD1 = 0.0;

        numD1 = num1 + num2;
        System.out.println("NumD1 but int Format:" + numD1);

        //num3 = num2 + 5.71; It's an error because num3 = int but 5.71 is a double

        num3 = (float) Math.sqrt(num2+num1);
        System.out.println("Num3: " + num3);

        //Scope
        int numS = 54;
        if (numS == 54)
        {
            int numA = 98;
            System.out.println("Yes: " + numA);
        }
        else
        {
            int numA = 89; //Same name, diff memory location and value
            System.out.println("Yes: " + numA); //numA not defined in this else Scope
        }
    }
}