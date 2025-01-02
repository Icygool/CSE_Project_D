/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final_Project;

/**
 *
 * @author 27144004
 */
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

    public String getName()
    {
        return name;
    }

    public Attack getAttack1()
    {
        return attack1;
    }

    public Attack getAttack2()
    {
        return attack2;
    }

    public int getMaxHp()
    {
        return maxHp;
    }

    public int getHP()
    {
        return hp;
    }
    
    public void setHp(int currentHp)
    {
        hp = currentHp;
        if(hp < 0)
        {
            hp = 0;
        }
    }

    public boolean isAlive()
    {
        return hp < 0;
    }
}
