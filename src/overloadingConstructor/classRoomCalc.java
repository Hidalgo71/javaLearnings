package overloadingConstructor;

public class classRoomCalc
{
    public static void main(String[] args)
    {
        classRoom roomObj1 = new classRoom();
        classRoom roomObj2 = new classRoom(6);
        classRoom roomObj3 = new classRoom(3, 2);
        classRoom roomObj4 = new classRoom(5, 7, 1);

        System.out.println("Non-Para: " + roomObj1.calcVol());
        System.out.println("1 Para: " + roomObj2.calcVol());
        System.out.println("2 Para: " + roomObj3.calcVol());
        System.out.println("3 Para: " + roomObj4.calcVol());

        double volume = roomObj1.calcVol(6, 3, 2);
        System.out.println("Para 1: " + volume);
        System.out.println("Para 2: " + roomObj2.calcVol(14, 5 ,3));
    }

}
