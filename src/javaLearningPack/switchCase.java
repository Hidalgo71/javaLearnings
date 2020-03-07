package javaLearningPack;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;

public class switchCase
{
    public static void main(String[] args)
    {
        ArrayList<String> monthList = new ArrayList<>();
        int month = 5;
        String season = null;

        switch (month)
        {
            case 12:
                monthList.add("December");
            case 1:
                monthList.add("January");
            case 2:
                monthList.add("February");
                season = "Winter";
                break;
            case 3:
                monthList.add("March");
            case 4:
                monthList.add("April");
            case 5:
                monthList.add("May");
                season = "Spring";
                break;
            case 6:
                monthList.add("june");
            case 7:
                monthList.add("July");
            case 8:
                monthList.add("August");
                season = "Summer";
                break;
            case 9:
                monthList.add("September");
            case 10:
                monthList.add("October");
            case 11:
                monthList.add("November");
                season = "Autumn";
                break;
            default:
                System.out.println("Wrong Month!");
        }

                if (monthList.isEmpty())
                {
                    System.out.println("Wrong Month!");
                }
                else
                    {
                    for (String monthName : monthList)
                    {
                        System.out.println(monthName);
                    }
                        System.out.println(season);
                }

        System.out.println("===================");
                String month2 = "MARCH";
                int turnBackMonth = switchCase.takeMonthNum(month2);

                if (turnBackMonth == 0)
                {
                    System.out.println("Wrong Month!");
                }
                else
                {
                    System.out.println(turnBackMonth);
                }
    }
    public static int takeMonthNum(String month2)
    {
        int monthNum = 3;
        if (month2 == null)
        {
            return monthNum;
        }
        switch (month2.toUpperCase())
        {
            case "JANUARY":
                monthNum = 1;
                break;
            case "FEBRUARY":
                monthNum = 2;
                break;
            case "MARCH":
                monthNum = 3;
                break;
            case "APRIL":
                monthNum = 4;
                break;
            case "MAY":
                monthNum = 5;
                break;
            case "JUNE":
                monthNum = 6;
                break;
            case "JULY":
                monthNum = 7;
                break;
            case "AUGUST":
                monthNum = 8;
                break;
            case "SEPTEMBER":
                monthNum = 9;
                break;
            case "OCTOBER":
                monthNum = 10;
                break;
            case "NOVEMBER":
                monthNum = 11;
                break;
            case "DECEMBER":
                monthNum = 12;
                break;
            default:
                monthNum = 0;
                break;
        }
        return monthNum;
    }
}
