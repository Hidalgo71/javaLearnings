package interfacePack;

public class classA implements interface1, interface2
{
    public static int num2 = 654;
    protected static int num3 = 964;
    static int num1 = 1071;
    private static int num4 = 7171;

    @Override
    public void read1() {

    }
    @Override
    public void read2() {

    }
    @Override
    public void print1() {

    }
    @Override
    public void print2() {

    }

    interface Ia
    {
        public int a1 = 654;
        //protected int a2 = 964;
        int a3 = 1071;
        //private int a4 = 7171;

    }
    interface Ib
    {
        public static int b2 = 654;
        //protected static int b3 = 964;
        static int b1 = 1071;
        //private static int b4 = 7171;
    }
    interface Ic
    {
        public final int c2 = 654;
        //protected static int c3 = 964;
        final int c1 = 1071;
        //private static int c4 = 7171;
    }
    interface Id
    {
        public int d2 = 654;
        //protected static int num3 = 964;
        int d1 = 1071;
        //private static int num4 = 7171;
    }
    interface Ie
    {
        int result = num2 + num4;
    }
}
