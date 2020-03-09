package javaMethods.headerSourceExp;

public class boxHeader
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
