package objectClassJava;

public class newHouses
{
    public static void main(String[] args)
    {
        houseJava houseObj3 = new houseJava();
        houseJava houseObj4 = houseObj3;       //Pointing same memory location

        houseObj3.width = 50;
        houseObj3.length = 100;
        houseObj3.height = 6;

        System.out.println("House3 Width: " + houseObj3.width);
        System.out.println("House3 Length: " + houseObj3.length);
        System.out.println("House3 Height: " + houseObj3.height);

        double volume = houseObj3.width * houseObj3.length * houseObj3.height;
        System.out.println("House 3's Volume is: " + volume);

        System.out.println("===================");

        System.out.println("House4 Width: " + houseObj4.width);
        System.out.println("House4 Length: " + houseObj4.length);
        System.out.println("House4 Height: " + houseObj4.height);

        double volume2 = houseObj4.width * houseObj4.length * houseObj4.height;
        System.out.println("House 3's Volume is: " + volume2);

        System.out.println("===================");

        System.out.println("House4 New Dimensions\n");
        houseObj4.height = 71;
        houseObj4.length = 45;
        houseObj4.width = 84;

        System.out.println("House4 New Width: " + houseObj4.width);
        System.out.println("House4 New Length: " + houseObj4.length);
        System.out.println("House4 New Height: " + houseObj4.height);

        double volume3 = houseObj4.width * houseObj4.length * houseObj4.height;
        System.out.println("House 4's New Volume is: " + volume3);


    }
}
