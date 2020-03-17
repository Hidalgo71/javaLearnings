package overloadingConstructor;

public class recursionClassMain
{
    public static void main(String[] args)
    {
        recursionClassA objA = new recursionClassA();
        System.out.println("-10! =" + objA.takeFactorial(-10));
        System.out.println("0! =" + objA.takeFactorial(0));
        System.out.println("1! =" + objA.takeFactorial(1));
        System.out.println("2! =" + objA.takeFactorial(2));
        System.out.println("3! =" + objA.takeFactorial(3));
        System.out.println("4! =" + objA.takeFactorial(4));
        System.out.println("5! =" + objA.takeFactorial(5));

    }
}
