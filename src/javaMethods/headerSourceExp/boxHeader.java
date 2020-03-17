package javaMethods.headerSourceExp;

public class boxHeader          //if it is a parameter dont need to prefix "this"
{                               //if its class member need to be prefix "this"
    double width;
    double length;
    double height;

    public boxHeader()          //Non Parameter Method
    {

    }
    public boxHeader(double width, double length, double height)    //Parameter method constructor
    {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    void calcVolumeNonPara()
    {
        System.out.println("Non-P Method Volume Calculation: "
                + this.width*this.height*this.height);
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
