package polymorphism;

public class shapeClass
{
    float edge1, edge2;

    public shapeClass()
    {   super();    }

    public shapeClass(float edge1, float edge2)
    {
        this.edge1 = edge1;
        this.edge2 = edge2;
    }

    protected float calcArea()
    {
       System.out.println("Shape Class Calc Area Method!");
        return 0.0f;
    }

    protected float calcRegion()
    {
        System.out.println("Shape Class Calc Region Method!");
        return 0.0f;
    }
}
