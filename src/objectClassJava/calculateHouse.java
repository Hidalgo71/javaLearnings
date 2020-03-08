package objectClassJava;

import javaLearningPack.nestedClass;

public class calculateHouse
{
    public static void main(String[] args) 
    {
        houseJava homeObj = new houseJava();
        homeObj.width = 7;
        homeObj.length = 8;
        homeObj.height = 5;

        System.out.println("House Width: " + homeObj.width);
        System.out.println("House Length: " + homeObj.length);
        System.out.println("House Height: " + homeObj.height);

        double volume = homeObj.width * homeObj.length * homeObj.height;
        System.out.println("House's Volume is: " + volume);

        System.out.println("===================");

        houseJava homeObj2;             //Empty Allocation
        homeObj2 = new houseJava();     //Memory Allocated
        homeObj2.height = 11;
        homeObj2.length = 8;
        homeObj2.width = 9;

        System.out.println("House 2 Width: " + homeObj2.width);
        System.out.println("House 2 Length: " + homeObj2.length);
        System.out.println("House 2 Height: " + homeObj2.height);

        double volume2 = homeObj2.width * homeObj2.length * homeObj2.height;
        System.out.println("House's Volume is: " + volume2);
    }
}
