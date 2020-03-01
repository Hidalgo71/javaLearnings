package javaLearningPack;

public class arrays
{
    public static void main(String[] args)
    {
        //How To Keep In Memory
        //ABCD
        //00 01 02 03
        //EFGH
        //10 11 12 13
        //IJKL
        //20 21 22 23
        //ABCDEFGHIJKL
        //Row x Column

        //1 dimensional Array
        int[] arrNull; //null
        int[] arrInt = new int[8]; //Holding 8 int places on memory
        arrInt[0] = 10;
        arrInt[1] = 23;
        arrInt[2] = 12;
        arrInt[3] = 56;
        arrInt[4] = 63;
        arrInt[5] = 69;
        arrInt[6] = 55;
        arrInt[7] = 20;
        System.out.println("Array Cell 1:" + arrInt[0]);
        System.out.println("Array Cell 6:" + arrInt[6]);
        System.out.println("Array Cell 3:" + arrInt[3]);

        System.out.println("===================");

        int[] arrInt2 = {5,6,9,7};
        System.out.println("ArrInt2 Cell 1:" + arrInt2[0]);
        System.out.println("ArrInt2 Cell 2:" + arrInt2[1]);
        System.out.println("ArrInt2 Cell 3:" + arrInt2[2]);
        System.out.println("ArrInt2 Cell 4:" + arrInt2[3]);

        System.out.println("===================");

        //2 Dimensional Array
        int[][] arr2Dim = new int[3][4];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                arr2Dim[i][j] = i+j*2;
            }
        }

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print(" " + arr2Dim[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===================");
        //Different Row size Arrays
        //00
        //10 11
        //20 21 23
        int[][] arr2Dim2 = new int[3][];
        arr2Dim2[0]/*i*/ = new int [1]; //like defining 1 dim. array.
        arr2Dim2[1] = new int [2];
        arr2Dim2[2] = new int [3];

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < i + 1; j++)
            {
                arr2Dim2[i][j] = i+j*2;
            }
        }

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < i + 1; j++)
            {
                System.out.print(" " + arr2Dim2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("===================");

        //2 Dimensional Array Adding Values
        double[][] arrInt3 =
                {
                        {5.71, 6.45, 9.10, 7.32},
                        {1, 2, 3, 6},
                        {3+6, 5-1, 6-2, 2*2},
                        {2.8, 9.81, 2.24, 3.21}
                };
        for (int i = 0; i < 4 ; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print("   " + arrInt3[i][j]);
            }
            System.out.println();
        }

        System.out.println("===================");

        //3 Dimensional Arrays
        int[][][] arr3Dim = new int[3][4][5];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                for (int k = 0; k < 5; k++)
                {
                    arr3Dim[i][j][k] = (i+j+k)*2;
                }

            }
        }

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                for (int k = 0; k < 5; k++)
                {
                    System.out.print(" " + arr3Dim[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("===================");


        //Array Declaration
        int[] arr4 = new int[5];                        //C style declaration
        int[] arrJavaType = new int[5];                 //JAva style declaration

        char[][] arrChar = new char[5][7];

        float[] arrMultiple1, arrMultiple2, arrMultiple3;
        double[] bank;
        double[] credit;
    }
}
