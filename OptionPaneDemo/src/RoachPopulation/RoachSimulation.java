package RoachPopulation;

import java.text.DecimalFormat;
import java.util.*;

public class RoachSimulation
{
    public static void main (String [] args)
    {
        RoachPopulation bred = new RoachPopulation (10);
        bred.breed();
        bred.spray();
        JOptionPane.showInputDialog(bred.getRoaches());
        bred.breed();
        bred.spray();
        JOptionPane.showInputDialog(bred.getRoaches());
        bred.breed();
        bred.spray();
        JOptionPane.showInputDialog(bred.getRoaches());
        
        
        DecimalFormat decFormat = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null, "Killed: " + decFormat.format(kill));

    }
}
