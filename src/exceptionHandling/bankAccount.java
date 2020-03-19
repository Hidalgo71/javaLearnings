package exceptionHandling;

import javax.naming.ldap.Control;

public class bankAccount
{
    private double balance;
    @SuppressWarnings("unused")
    private long accountNO;

    public bankAccount(int accountNO)
    {
        this.accountNO = accountNO;
    }

    public void add(double amount)
    {
        this.balance = this.balance + amount;
    }

    public void subtrackt(double amount) throws controlExp
    {
        if (amount <= this.balance)
        {
            this.balance = this.balance - amount;
        }
        else
        {
            double gap = amount - this.balance;
            throw new controlExp(gap);
        }
    }

    public double getBalance()
    {
        return balance;
    }
}
