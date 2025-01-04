import java.util.Scanner;

public class Locations
{
    public static void pokemonCenter(Pokemon player)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello, welcome to the pokemon center. would you like to heal your pokemon? [yes/no]: ");
        String heal = scanner.nextLine();
        if(heal.equalsIgnorecase("yes"))
        {
            player.setHp(player.getMaxHp());
            player.getAttack1().resetPP();
            player.getAttack2().resetPP();
        }
        System.out.println("After you visit at the pokemon center, you head back to the way you came from.");
    }

    public static void forest1()
    {
        System.out.println("As you walk into the forest, the path comes to a halt as the path is blocked off by a"
                           + " sleeping snorlax, seeing no way around it, you decide to go back.");
        return;
    }

    public static void forestBattle()
    {
        System.out.println("As you walk into the forest, you hear a sound eminating from the tall grass, as you walked closer"
                           + " a wild pokemon pops out and attempts to attack.");
    }

    public static void trainerBattle()
    {
        System.out.println("As you walk into the small town, you see a guy thats standing on the side of the road,"
                           + "just starin into a wall with a smile on his face, as you walk infront of him he stops you dead in your tracks,"
                           + "You walked infront of me,  lets battle!");
        return;
    }

    public static void town()
    {
        System.out.println("As you walk into town, you see that there is not much to be found, nothing but a couple of "
                           + " abandoned homes and buildings, seeing nothing interesting, youdecide to go back.");
    }
}
