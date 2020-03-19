package polymorphism;

public class squareClass extends shapeClass
{
    public squareClass()
    {        super();    }

    public squareClass(float edge1, float edge2)
    {
        super(edge1, edge2);
    }

    @Override
    protected float calcArea()
    {
        System.out.println("Square Class Calc Area Method!");
        return this.edge1 * this.edge2;
    }

    @Override
    protected float calcRegion()
    {
        System.out.println("Square Class Calc Region Method!");
        return 2 * (this.edge1 + this.edge2);
    }
}
