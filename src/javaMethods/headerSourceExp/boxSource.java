package javaMethods.headerSourceExp;

public class boxSource
{
    public static void main(String[] args)
    {
        double volume;
        boxHeader box1 = new boxHeader();
        boxHeader box2 = new boxHeader();
        boxHeader box3 = new boxHeader(8.71, 54.2,2);       //1st values

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

        System.out.println("===================");

        System.out.println("Box3 Width: " + box3.width);
        System.out.println("Box3 Length: " + box3.length);
        System.out.println("Box3 Height: " + box3.height);
        System.out.println();

        volume = box3.width * box3.length * box3.height;
        System.out.println("Box3's Volume is: " + volume);

        box3.calcVolumeNonPara();

        volume = box3.calcVolumeNonParaRet();
        System.out.println("Box3's Volume is(Non Para): " + volume);

        volume = box3.calcVolumePara(19.71, 25.6, 49.2);
        System.out.println("Box3's Volume is(Para): " + volume);
    }
}
