
/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Athlete
{
    private String name;
    private double height;
    private int rankingACC;
    
    public Athlete(String name)
    {
        this.name = name;
        height = 5.2;
        rankingACC = 3;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public void wasMVP()
    {
        rankingACC *= 2;
    }
    
    public void wearPlatformShoes()
    {
        height += 0.5;
    }

}