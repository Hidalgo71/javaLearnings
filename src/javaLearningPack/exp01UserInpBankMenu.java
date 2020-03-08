package javaLearningPack;

import java.io.IOException;
import java.util.Scanner;

public class exp01UserInpBankMenu
{
    public static void main(String[] args) throws IOException
    {
        char selected;
       // char selectBankAccNum;
        Scanner scanner = new Scanner(System.in);

        do
            {
                System.out.println("Welcome To Main Menu\n");
                System.out.println("1. Live Exchange Rates");
                System.out.println("2. Transfer");
                System.out.println("3. Send Top-Up");
                System.out.println("4. Open Bank Account");
                System.out.println("5. Show Limits\n");

                System.out.print("Please Select an Option...");
                selected = (char) System.in.read();
            }
        while (selected < '1' || selected > '5'); // || => OR
        //System.out.println("\n");
        switch (selected)
        {
            case '1':
                System.out.println("$: 6.08₺");
                System.out.println("€: 6.88₺");
                System.out.println("Gram Gold: 327₺");
                System.out.println("Bitcoin/TL: 57.462₺");
                System.out.println("Ripple/TL: 1.42₺");
                break;
            case '2':
                System.out.print("Select Your Bank Account...");
                int selectBankAccNum = scanner.nextInt();
                //selectBankAccNum = (char) System.in.read();
                if (selectBankAccNum < 0 || selectBankAccNum > 4)
                {
                    System.out.println("Bank Account can't  found!");
                }
                else
                {
                    switch (selectBankAccNum)
                    {
                        case 1:
                            System.out.println("Your money transferred to Account 1");
                            break;
                        case 2:
                            System.out.println("Your money transferred to Account 2");
                            break;
                        case 3:
                            System.out.println("Your money transferred to Account 3");
                            break;
                    }
                }
                break;
            case '3':
                System.out.println("Case 3 is working");
                break;
            case '4':
                System.out.println("Case 4 is working");
                break;
            case '5':
                System.out.println("Case 5 is working");
                break;
            default:
                System.out.println("Wrong menu number!");
        }
    }
}
