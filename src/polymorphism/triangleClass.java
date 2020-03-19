package polymorphism;

public class triangleClass extends squareClass
{
    float edge3;
    public triangleClass()
    {        super();    }

    public triangleClass(float edge1, float edge2)
    {
        super(edge1, edge2);
    }

    public triangleClass(float edge1, float edge2, float edge3)
    {
        super(edge1, edge2);
        this.edge3 = edge3;
    }

    @Override
    protected float calcArea()
    {
        System.out.println("Triangle Class Calc Area Method!");
        return (this.edge1 * this.edge2) / 2;
    }

    @Override
    protected float calcRegion()
    {
        System.out.println("Triangle Class Calc Region Method!");
        return this.edge1 + this.edge2 + edge3;
    }

}
