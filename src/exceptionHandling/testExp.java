package exceptionHandling;

public class testExp
{
    public static void main(String[] args)
    {
        try
        {
            int num[] = new int[142];
            System.out.println("Result: " + num[71]);
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e)                                            //Exception top of the hierarchy cant useable after that any exp
        {
            System.out.println("Exception Throw" + e);
            //e.printStackTrace();
        }   catch (RuntimeException e)
        {
            System.out.println("Exception Throw1" + e);
        }finally
        {
            System.out.println("Finally Block");
        }

        System.out.println("Outside of T-C finally block");
    }
}
