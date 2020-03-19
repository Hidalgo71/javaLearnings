package polymorphism;

public abstract class shapeClass
{
    float edge1, edge2;

    public shapeClass()
    {   super();    }

    public shapeClass(float edge1, float edge2)
    {
        this.edge1 = edge1;
        this.edge2 = edge2;
    }

    protected abstract float calcArea();
    /*{
       System.out.println("Shape Class Calc Area Method!");
        return 0.0f;
    }*/

    protected abstract float calcRegion();
   /* {
        System.out.println("Shape Class Calc Region Method!");
        return 0.0f;
    }*/

    protected void print1()
    {
        System.out.println("Shape Class");
    }
    protected String print2()
    {
        return "Shape Class";
    }
}
