package javaMethods;

public class landCalculation
{
    double width;
    double length;

    double calcArea()
    {
        System.out.println("Inside Method Area: " + width*length);
        return width * length;
    }
}

class calc
{
    public static void main(String[] args)
    {
        double area;
        landCalculation landObj1 = new landCalculation();
        landCalculation landObj2 = new landCalculation();

        System.out.println("landObj Values");
        landObj1.length = 88.7;
        landObj1.width = 71.2;
        System.out.println("landObj1 Length: " + landObj1.length);
        System.out.println("landObj1 Width: " + landObj1.width);

        area = landObj1.width * landObj1.length;
        System.out.println("landObj area: " + area);
        area = landObj1.calcArea();
        System.out.println("Method Calculation Area: " + area);

        System.out.println("===================");

        System.out.println("landObj2 Values");
        landObj2.length = 110.5;
        landObj2.width = 87.1;
        System.out.println("landObj2 Length: " + landObj2.length);
        System.out.println("landObj2 Width: " + landObj2.width);

        area = landObj2.width * landObj2.length;
        System.out.println("landObj2 area: " + area);
        System.out.println("Method Calculation Area: " + landObj2.calcArea());
    }
}
