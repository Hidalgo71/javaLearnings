package overloadingOverriding;

public class fishs
{
    private int fishLayingSeason;
    private double lifeTime;
    private boolean isMigrating;
    private String color;
    private int setFishLayingSeason;

    public fishs()
    {
        super();
    }

    public fishs(int fishLayingSeason, double lifeTime, boolean isMigrating, String color)
    {
        this.fishLayingSeason = fishLayingSeason;
        this.lifeTime = lifeTime;
        this.isMigrating = isMigrating;
        this.color = color;
    }

    public int getFishLayingSeason()                                //Set & Get for private objs. Changing values.
    {
        return fishLayingSeason;
    }

    public void setFishLayingSeason(int fishLayingSeason)
    {
        this.fishLayingSeason = fishLayingSeason;
    }

    public double getLifeTime()
    {
        return lifeTime;
    }

    public void setLifeTime(double lifeTime)
    {
        this.lifeTime = lifeTime;
    }

    public boolean isMigrating()
    {
        return isMigrating;
    }

    public void setMigrating(boolean migrating)
    {
        isMigrating = migrating;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

protected String fishInfo()
    {
        String migratingInfo, seasonInfo;
        if (!this.isMigrating)
        {
            migratingInfo = "No Migrating";
        }
        else
        {
            migratingInfo = "Migrating";
        }

        switch (this.setFishLayingSeason)
        {
            case 1: seasonInfo = "Spring"; break;
            case 2: seasonInfo = "Summer"; break;
            case 3: seasonInfo = "autumn"; break;
            //case 4: seasonInfo = "Winter"; break;
            default: seasonInfo = "Winter"; break;
        }

        return "Migrating Info: " + migratingInfo + "\n" +
                        "Color: " + this.color + "\n" +
                        "Life Time: " + this.lifeTime + "\n" +
                        "Laying Season: " + this.fishLayingSeason + "\n";
    }


protected String fishInfo(double size, int weight)                                 //Overloading
    {
        String migratingInfo, seasonInfo;
        if (!this.isMigrating)
        {
            migratingInfo = "No Migrating";
        }
        else
        {
            migratingInfo = "Migrating";
        }

        switch (this.setFishLayingSeason)
        {
            case 1: seasonInfo = "Spring"; break;
            case 2: seasonInfo = "Summer"; break;
            case 3: seasonInfo = "autumn"; break;
            //case 4: seasonInfo = "Winter"; break;
            default: seasonInfo = "Winter"; break;
        }

        return "Migrating Info: " + migratingInfo + "\n" +
                "Color: " + this.color + "\n" +
                "Life Time: " + this.lifeTime + "\n" +
                "Laying Season: " + this.fishLayingSeason + "\n" +
                "Size: " + size + "\n" +
                "Weight: " + weight + "\n";
    }

    protected String fishInfo(int size, double weight)                                 //Overloading
    {
        String migratingInfo, seasonInfo;
        if (!this.isMigrating)
        {
            migratingInfo = "No Migrating";
        }
        else
        {
            migratingInfo = "Migrating";
        }

        switch (this.setFishLayingSeason)
        {
            case 1: seasonInfo = "Spring"; break;
            case 2: seasonInfo = "Summer"; break;
            case 3: seasonInfo = "autumn"; break;
            //case 4: seasonInfo = "Winter"; break;
            default: seasonInfo = "Winter"; break;
        }

        return "Migrating Info: " + migratingInfo + "\n" +
                "Color: " + this.color + "\n" +
                "Life Time: " + this.lifeTime + "\n" +
                "Laying Season: " + this.fishLayingSeason + "\n" +
                "Size: " + size + "\n" +
                "Weight: " + weight + "\n";
    }
}