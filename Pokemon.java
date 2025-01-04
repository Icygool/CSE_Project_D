public class Pokemon
{
    public String name;
    
    public int maxHp;
    public int hp;
    public Attacks attack1;
    public Attacks attack2;
    public String type;
    
    public Pokemon(String name, int maxHp, int hp, Attack attack1, Attack attack2, String type)
    {
        this.name = name;
        this.type = type;
        this.maxHp = maxHp;
        this.hp = hp;
        this.attack1 = attack1;
        this.attack2 = attack2;
    }

    public String getName() //gets the name of the pokemon
    {
        return name;
    }

    public Attack getAttack1() //gets the first attack of the pokemon
    {
        return attack1;
    }

    public Attack getAttack2() //gets the second attack of the pokemon
    {
        return attack2;
    }

    public int getMaxHp() //gets the maximum hp of the pokemon
    {
        return maxHp;
    }

    public int getHP() //gets the current hp of the pokemon
    {
        return hp;
    }
    
    public void setHp(int currentHp) //sets the new hp of the pokemon
    {
        hp = currentHp;
        if(hp < 0)
        {
            hp = 0;
        }
    }

    public boolean isAlive() //checks if the hp is above 0
    {
        return hp < 0;
    }
}
