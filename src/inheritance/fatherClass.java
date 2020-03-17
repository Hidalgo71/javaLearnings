package inheritance;

public class fatherClass
{
    double s1, s2;

    public fatherClass(double s1, double s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }

    public void setS1(double s1)
    {
        this.s1 = s1;
    }

    public void setS2(double s2)
    {
        this.s2 = s2;
    }

    public double getS1()
    {
        return s1;
    }

    public double getS2()
    {
        return s2;
    }

    class childClass extends fatherClass
    {
        int s3;                                                             //This's s3.

        public childClass(double s1, double s2, int s3)
        {
            super(s1, s2);                                                  //Upper class method.
            this.s3 = s3;                                                   //This: int3's this.
        }
    }
}
