package exceptionHandling;

public class bankAccTest
{
    public static void main(String[] args)
    {
        bankAccount account = new bankAccount(11718242);
        System.out.println("\nTotal Balance: 74600 \n");
        account.add(11460.00);
        try
        {
            System.out.println("\nWithdrawal: 666");
            account.subtrackt(666.00);
            System.out.println("\nWithdrawal: 566");
            account.subtrackt(566.00);
            System.out.println("\nWithdrawal: 766");
            account.subtrackt(766.00);

        } catch (controlExp e)
        {
            System.out.println("\nOut of Balance! " + e.getGap() + " Money Missing. ");
            //e.printStackTrace();
        }
    }
}
