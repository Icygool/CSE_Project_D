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
    public String type;
    public int hp;
    public Attacks attack1;
    public Attacks attack2;
    
    public int damage;
    
    
    public Pokemon(String name, String type, int hp, Attack attack1, Attack attack2)
    {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.attack1 = attack1;
        this.attack2 = attack2;
    }

    public getName()
    {
        return name;
    }

    public getHP()
    {
        return hp;
    }
    
    public takeDamage()
    {
        
    }

    public isAlive()
    {
        if(hp <= 0)
        {
            return false;
        }
        return true;
    }
}
