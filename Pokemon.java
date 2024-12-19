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
    public String attack1;
    public String attack1type;
    public int attack1damage;
    public int attack1pp;
    public String attack2;
    public String attack2type;
    public int attack2damage;
    public int attack2pp;
    
    public int damage;
    
    
    public Pokemon(String name, String type, int hp, String attack1, String attack2)
    {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.attack1 = attack1;
        this.attack2 = attack2;
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
