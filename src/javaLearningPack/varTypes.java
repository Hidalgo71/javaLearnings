package javaLearningPack;

public class varTypes
{
    public static void main(String[] args)
    {
        //Numeric

        System.out.println("Hello Java,\n " +
                "my name is Yekta\n" +
                "How are you?");
        double pi = 3.14159265;
        double radius = 5.71;
        double area = 0;
        float a = 12.71f;
        float b = (float) 12.71f;
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        area = /*(int)*/ pi * radius*radius;
        System.out.println("Area: " + area);

        //character
        char name1 =71;
        char name2='K'; //Ascii number.
        // string name3 = 'a';
        System.out.println("Name1: " + name1);
        System.out.println("Name2: " + name2);

        name1 = (char) (name1 + 1);
        name2 = 'B';
        //System.out.println("Name3: " + name3);
        System.out.println("New Name1: " + name1);

        //Boolean
        boolean boolType = true;
        System.out.println("Bool:" + boolType);

        if (boolType)
        {
            System.out.println("Bool Type True:" + boolType);
        }
    }
}