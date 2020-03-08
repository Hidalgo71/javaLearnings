package javaLearningPack;

public class nestedClass  //Class 1
{
    double width;
    double length;
    double height;
}

class calculate             //Class 2
{
    public static void main(String[] args)
    {
        nestedClass homeObj = new nestedClass();
        homeObj.width = 7;
        homeObj.length = 8;
        homeObj.height = 5;

        System.out.println("House Width: " + homeObj.width);
        System.out.println("House Length: " + homeObj.length);
        System.out.println("House Height: " + homeObj.height);

        double volume = homeObj.width * homeObj.length * homeObj.height;
        System.out.println("House's Volume is: " + volume);
    }
}