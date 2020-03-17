package overloadingConstructor;

public class paraMethodMain
{
    public static void main(String[] args)
    {
        paraMethod obj1 = new paraMethod();
        paraMethod obj2 = new paraMethod(1, 4);
        paraMethod obj3 = new paraMethod(5, 3);
        paraMethod obj4 = new paraMethod();
        paraMethod obj5 = new paraMethod(5, 3);

        System.out.println("obj1 == obj2: " + obj1.compareObj(obj2));
        System.out.println("obj1 == obj3: " + obj1.compareObj(obj3));
        System.out.println("obj1 == obj4: " + obj1.compareObj(obj4));
        System.out.println("obj5 == obj3: " + obj5.compareObj(obj5));
    }
}
