package polymorphism;

public class mainClass
{
    public static void main(String[] args)
    {
        shapeClass shapeObjRef;

        //shapeClass shapeObj = new shapeClass(71f, 12f);
        squareClass squareObj = new squareClass(12f, 99f);
        triangleClass triObj = new triangleClass(3, 4, 5);

        shapeObjRef = squareObj;
        System.out.println(shapeObjRef.calcArea());
        System.out.println(shapeObjRef.calcRegion());

        System.out.println("===================");

        shapeObjRef = triObj;
        System.out.println(shapeObjRef.calcArea());
        System.out.println(shapeObjRef.calcRegion());

        System.out.println("===================");

       // shapeObjRef = shapeObj;
        System.out.println(shapeObjRef.calcArea());
        System.out.println(shapeObjRef.calcRegion());

        System.out.println(shapeObjRef.print2());

        if (triObj instanceof shapeClass)
        {
            System.out.println("triObj in shapeClass");
        }
        else
        {
            System.out.println(" Not triObj in shapeClass");
        }

        /*shapeClass aObjRef = dObj;
        aObjRef.print();

        aObjRef = bObj;
        aObjRef.print();

        aObjRef = cObj;
        aObjRef.print();

        aObjRef = dObj;
        aObjRef.print();

        aObjRef = aObj;
        aObjRef.print();*/
    }
}
