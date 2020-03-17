package inheritance;

public class outClass
{
    int num1 = 123;

    void outClassMethod()
    {
        innerClass innerClsObj = new innerClass();
        innerClsObj.innerClassMethod();
        System.out.println("Out Class's outer outClsMethod's Inside: "
                + num1);
    }

    class innerClass
    {
        int num1 = 321;
        void innerClassMethod()
        {
            System.out.println("Inner class's inside of innerClassMethod: "
                    + num1);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Out Class");
        outClass outClsObj = new outClass();
        outClsObj.outClassMethod();
    }

}
