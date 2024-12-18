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
    public int attack1damage
    public int attack1pp
    public String attack2;
    public String attack2type;
    public int attack2damage;
    public int attack2pp
    
    
    public Pokemon(String name, String type, int hp, String attack1, String attack1type, int attack1damage, int attack1pp,
                   String attack2, String attack2type, int attack2damage, int attack2pp)
    {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.attack1 = attack1;
        this.attack1type = attack1type;
        this.attack1damage = attack1damage;
        this.attack1pp = attack1pp;
        this.attack2 = attack2;
        this.attack2 = attack2type;
        this.attack2 = attack2damage;
        this.attack2 = attack2pp;
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
