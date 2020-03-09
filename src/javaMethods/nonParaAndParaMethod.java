package javaMethods;

public class nonParaAndParaMethod
{
    double width;
    double length;
    double height;

    void calcVolumeNonPara()
    {
        System.out.println("Non-P Method Volume Calculation: "
                + width*length*height);
    }

    double calcVolumeNonParaRet()
    {
        System.out.println("Non-P Double Type Method Volume Calculation: "
                + width*length*height);
        return width*length*height;
    }

    double calcVolumePara(double widthP, double lengthP, double heightP)
    {
        System.out.println("Parameter Method Volume Calculation: "
                + widthP*lengthP*heightP);
        return widthP*lengthP*heightP;
    }
}

class calculate
{
    public static void main(String[] args)
    {
        double volume;
        nonParaAndParaMethod box1 = new nonParaAndParaMethod();
        nonParaAndParaMethod box2 = new nonParaAndParaMethod();

        box1.width = 17.1;
        box1.length = 84.2;
        box1.height = 75.5;

        System.out.println("Box Width: " + box1.width);
        System.out.println("Box Length: " + box1.length);
        System.out.println("Box Height: " + box1.height);
        System.out.println();

        volume = box1.width * box1.length * box1.height;
        System.out.println("Box's Volume is: " + volume);

        box1.calcVolumeNonPara();

        volume = box1.calcVolumeNonParaRet();
        System.out.println("Box's Volume is(Non Para): " + volume);

        volume = box1.calcVolumePara(11.71, 52.6, 60.2);
        System.out.println("Box's Volume is(Para): " + volume);


        System.out.println("===================");

        box2.width = 71.1;
        box2.length = 48.2;
        box2.height = 57.5;

        System.out.println("Box2 Width: " + box2.width);
        System.out.println("Box2 Length: " + box2.length);
        System.out.println("Box2 Height: " + box2.height);
        System.out.println();

        volume = box2.width * box2.length * box2.height;
        System.out.println("Box2's Volume is: " + volume);

        box2.calcVolumeNonPara();

        volume = box2.calcVolumeNonParaRet();
        System.out.println("Box2's Volume is(Non Para): " + volume);

        volume = box2.calcVolumePara(19.71, 25.6, 49.2);
        System.out.println("Box2's Volume is(Para): " + volume);
    }
}
