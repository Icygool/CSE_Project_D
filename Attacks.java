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
    
    public Attacks(String name, int maxPP, int currantPP, int damage, String type)
    {
        this.name = name;
        this.maxPP = maxPP;
        this.currantPP = currantPP;
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
        return currantPP;
    }

    public decreasePP()
    {
        currantPP -= 1;
        return currantHp;
    }

    public isUseable()
    {
        if(currantPP > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
