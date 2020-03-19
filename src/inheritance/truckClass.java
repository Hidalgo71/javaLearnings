package inheritance;

public class truckClass extends vehicleClass
{
    public truckClass()
    {
        super();
        System.out.println("Truck");
    }

    public static void main(String[] args)
    {
        truckClass truck = new truckClass();
        truck.fuelTankCap = 250;
        truck.hp = 2071;
        truck.maxSpeed = 180;
        truck.modelYear = 2018;
        truck.tireNum = 10;
        truck.brandName = "TOGG";
        truck.fuelType = "Electricity";

        System.out.println("Vehicle name: " + truck.brandName);

        truck.engineStart();
        truck.speedUp();
        truck.changeGear();
        truck.brakeOn();
        truck.engineOff();
    }
}
