package overloadingOverriding;

public class hamsi extends fishs
{
    private String kind;

    public hamsi()
    {
        super();
    }

    public hamsi(int fishLayingSeason, double lifeTime, boolean isMigrating, String color)
    {
        super(fishLayingSeason, lifeTime, isMigrating, color);
    }

    public hamsi(int fishLayingSeason, double lifeTime, boolean isMigrating, String color, String kind)
    {
        super(fishLayingSeason, lifeTime, isMigrating, color);
        this.kind = kind;
    }

    @Override
    protected String fishInfo()
    {
        return super.fishInfo() + "Kind: " + this.kind + "\n";
    }

}

