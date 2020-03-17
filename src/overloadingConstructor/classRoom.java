package overloadingConstructor;

public class classRoom
{
    double width;
    double length;
    double height;

    public classRoom()
    {
        this.width = 1;
        this.height = 1;
        this.length = 1;
    }
    public classRoom(double width)
    {
        this.width = this.length = this.height = width;
    }

    public classRoom(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public classRoom(double width, double length, double height)
    {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    double calcVol()
    {
        return this.width * this.length * this.height;
    }

    double calcVol(double width, double length, double height)
    {
        return width * length * height;
    }
}
