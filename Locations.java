/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final_Project;

import java.util.Scanner;
/**
 *
 * @author 27144004
 */
public class Locations
{
    public String name;
    public String description;
    public String opponantName;
    
    public Locations(String name, String description, String opponantName)
    {
        this.name = name;
        this.description = description;
        this.opponantName = opponantName;
    }

    public pokemonCenter(Pokemon player)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello, welcome to the pokemon center. would you like to heal your pokemon? [yes/no]: ");
        String heal = scanner.nextLine();
        if(heal.equalsIgnorecase("yes"))
        {
            player.setHp(player.getMaxHp());
        }
        System.out.printin("After you visit at the pokemon center, you head back to the way you came from.");
        return ;
    }

    public forest1()
    {
        System.out.println("As you walk into the forest, the path comes to a halt as the path is blocked off by a"
                           + " sleeping snorlax, seeing no way around it, you decide to go back.");
        return;
    }

    Public forestBattle()
    {
        System.out.println("As you walk into the forest, you hear a sound eminating from the tall grass, as you walked closer"
                           + " a wild bulbasaur pops out and attempts to attack.");
    }

    public trainerBattle()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("As you walk into the small town, you see a guy thats standing on the side of the road,"
                           + "just starin into a wall with a smile on his face, as you walk infront of him he stops you dead in your tracks,"
                           + "You walked infront of me,  lets battle!");
        return;
    }

    public town()
    {
        System.out.println("As you walk into town, you see that there is not much to be found, nothing but a couple of "
                           + " abandoned homes and buildings, seeing nothing interesting, youdecide to go back.");
    }
}
