package inheritance;

public class vehicleClass
{
    int maxSpeed;
    int hp;
    int tireNum;
    int fuelTankCap;
    int modelYear;
    String fuelType, brandName;

    public void engineStart()
    {
        System.out.println("Engine Started.");
    }

    public void brakeOn()
    {
        System.out.println("Put on brake.");
    }

    public void speedUp()
    {
        System.out.println("Speed up.");
    }

    public void changeGear()
    {
        System.out.println("Gear changed.");
    }

    public void engineOff()
    {
        System.out.println("Engine stopped.");
    }

    public vehicleClass()
    {

    }

    public static void main(String[] args)
    {
        vehicleClass car1 = new vehicleClass();
        car1.engineStart();
        car1.speedUp();
        car1.changeGear();
        car1.brakeOn();
        car1.engineOff();
    }
}
