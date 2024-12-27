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
    public int pp;
    public int damage;
    public String type;
    
    public Attacks(String name, int pp, int damage, String type)
    {
        this.name = name;
        this.pp = pp;
        this.damage = damage;
        this.type = type;
    }

    public getName()
    {
        return name;
    }

    public getDamage()
    {
        return damage;
    }

    public getType()
    {
        return type;
    }

    public getPP()
    {
        return pp;
    }

    public isUseable()
    {
        if(pp > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
