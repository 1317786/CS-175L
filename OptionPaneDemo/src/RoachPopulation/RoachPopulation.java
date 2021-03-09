package RoachPopulation;

public class RoachPopulation 
{
    private double numRoaches;
    
    public RoachPopulation (int amtRoaches)
    {
        numRoaches = amtRoaches;
    }
    
   
    public void spray ()
    {
        numRoaches = numRoaches * 10;
    }
    
 
    public void breed ()
    {
        numRoaches = numRoaches * 2;
    }
    
    public int getRoaches ()
    {
        return ((int) numRoaches);
    }
}