package javaLearningPack;

public class operators
{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 76;
        double num3 = 34;
        int num4 = 23;
        int num5 = 71;

        num1 = num4 * num5;
        num3 = num2 / num4;

        System.out.println("Num1: " + num1);
        System.out.println("Num3: " + num3);
        System.out.println("Num4: " + num2 + num5);

        System.out.println("===================");

        //Mode
        System.out.println("Num1 mod 3: " + num1 % 3);
        System.out.println("Num4 mod 5: " + num4 % 5);
        num4 = ++num4;    //adding +1 to the number.
        System.out.println("Num4 mod 5: " + num4 % 5);

        num5 += 17;
        System.out.println("Num5: " + num5);
        num5 %= 3;
        System.out.println("Num5 Mod 3: " + num5);

        System.out.println("===================");

        //Adding and Subtracting

        int num6 = 5, num7 = 6;

        num6 = num7 + 1;
        System.out.println("Num6 (num7 + 1): " + num6);
        num6 = num7++;
        System.out.println("Num6 Postfix(+): " + num6);
        num6 = ++num7;
        System.out.println("Num6 Prefix(+): " + num6);

        num6 = num7--;
        System.out.println("Num6 Postfix(-): " + num6);
        num6 = --num7;
        System.out.println("Num6 Prefix(-): " + num6);

        System.out.println("===================");

        boolean result;
        result = num6 +1 > num7;
        System.out.println("Is num6 > num7? " + result);
        result = num7 > num6;
        System.out.println("Is num7 > num6? " + result);
        result = num6 == num7;
        System.out.println("Is num6 > num7? " + result);

        System.out.println("===================");

        //Integer Literals
        int decVal = 71;
        int hexVal = 0x1a;
        int binVal = 0b11001;

        System.out.println("Decimal: " + decVal);
        System.out.println("Hex: " + hexVal);
        System.out.println("Binary: " + binVal);

        System.out.println("===================");

        //Floating Points
        double d1 = 123.4;
        double d2 = 1.245e5; //e means 1.245 *10*10
        float f1 = 123.4f;

        System.out.println("Double d1: " + d1);
        System.out.println("Double d2: " + d2);
        System.out.println("Float: " + f1);

        System.out.println("===================");
        //Character Strings Literal

        long creditCardNo = 1234_5678_9012_3456L;
        long sskNo = 999_99_9999L;
        float pi =  3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;

        System.out.println("Credit Card no: " + creditCardNo);
        System.out.println("SSK No: " + sskNo);
        System.out.println("Pi: " + pi);
        System.out.println("HexBytes: " + hexBytes);
        System.out.println("HexWords: " + hexWords);
        System.out.println("MaxLong: " + maxLong);
        System.out.println("Nybbles: " + nybbles);
        System.out.println("Bytes: " + bytes);

        System.out.println("===================");

    }
}
