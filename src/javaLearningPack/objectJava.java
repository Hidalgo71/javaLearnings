package javaLearningPack;

public class objectJava
{
        double width;
        double length;
        double height;

        public static void main(String[] args)
        {
            objectJava homeObj = new objectJava();
            homeObj.width = 7;
            homeObj.length = 8;
            homeObj.height = 5;

            System.out.println("House Width: " + homeObj.width);
            System.out.println("House Length: " + homeObj.length);
            System.out.println("House Height: " + homeObj.height);

        }
}
