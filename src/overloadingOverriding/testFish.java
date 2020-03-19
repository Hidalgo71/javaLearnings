package overloadingOverriding;

public class testFish
{
    public static void main(String[] args)
    {
        hamsi hamsiObj = new hamsi(2, 4.3, false, "Blue", "Blacksea");
        System.out.println(hamsiObj.fishInfo());

        hamsiObj = new hamsi(3, 5.9, true, "Yellow", "mediterranean sea");
        System.out.println(hamsiObj.fishInfo(12, 14.71));
    }
}
