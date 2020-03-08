package javaMethods;

public class nonParaVoidMethod
{
    double width;
    double length;
    double height;

    void calcVolume()
    {
        System.out.println("Inside Method Volume: " + width*height*length);
    }

    public static void main(String[] args)
    {
        nonParaVoidMethod houseObj = new nonParaVoidMethod();

        houseObj.width = 7;
        houseObj.length = 8;
        houseObj.height = 5;

        System.out.println("House Width: " + houseObj.width);
        System.out.println("House Length: " + houseObj.length);
        System.out.println("House Height: " + houseObj.height);

        double volume = houseObj.width * houseObj.length * houseObj.height;
        System.out.println("House's Volume is: " + volume);

        houseObj.calcVolume();

        System.out.println("===================");

        nonParaVoidMethod houseObj2 = new nonParaVoidMethod();
        houseObj2.length = 32.7;
        houseObj2.height = 23.9;
        houseObj2.width = 8.5;

        System.out.println("House2 Width: " + houseObj2.width);
        System.out.println("House2 Length: " + houseObj2.length);
        System.out.println("House2 Height: " + houseObj2.height);

        houseObj2.calcVolume();
    }
}
