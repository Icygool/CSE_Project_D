/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final_Project;

/**
 *
 * @author 27144004
 */
public static void main(String... args)
    {
        MyProgram.main(args);
    }

public class Attacks
{
    public String name;
    public int maxPP;
    public int currentPP;
    public int damage;
    public String type;
    
    public Attacks(String name, int maxPP, int currentPP, int damage, String type)
    {
        this.name = name;
        this.maxPP = maxPP;
        this.currentPP = currentPP;
        this.damage = damage;
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public int getDamage()
    {
        return damage;
    }

    public String getType()
    {
        return type;
    }

    public int getPP()
    {
        return currentPP;
    }

    public void decreasePP()
    {
        currentPP -= 1;
    }

    public void resetPP()
    {
        currentPP = maxPP;
    }

    public boolean isUseable()
    {
        return pp > 0;
    }
}
