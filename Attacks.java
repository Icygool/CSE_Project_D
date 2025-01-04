public class Main
{
    public static void main(String[] args)
    {
        MyProgram.main(args);
    }
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

    public String getName() //returns the name
    {
        return name;
    }

    public int getDamage() //returns the damage
    {
        return damage;
    }

    public String getType() //returns the type
    {
        return type;
    }

    public int getPP() //returns the amount of PP the attack has
    {
        return currentPP;
    }

    public void decreasePP() //decreases the PP of the attack when used
    {
        currentPP -= 1;
    }

    public void resetPP() //resets the PP
    {
        currentPP = maxPP;
    }

    public boolean isUseable() //checks if the attack still has pp
    {
        return pp > 0;
    }
}
