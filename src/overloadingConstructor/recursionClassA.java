package overloadingConstructor;

public class recursionClassA
{
    int takeFactorial(int n)
    {
        int result;
        if ((n == 1) || (n <= 0))
        {
            return 1;
        }
        else
            {
                return takeFactorial(n-1) * n;
            }
    }
}
