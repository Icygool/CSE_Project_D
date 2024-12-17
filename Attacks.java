/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final_Project;

/**
 *
 * @author 27144004
 */
public class Attacks
{
    public String name;
    public int pp;
    public int damage;
    
    public Attacks(String name, int pp, int damage)
    {
        this.name = name;
        this.pp = pp;
        this.damage = damage;
    }

    public getDamage()
    {
        return damage;
    }

    public isUseable()
    {
        if(pp > 0)
        {
            return true;
        }
    }
}
