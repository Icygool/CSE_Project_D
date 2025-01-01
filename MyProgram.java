/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Final_Project;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author 27144004
 */
public class MyProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        String[] pokemons = {"Charmander", "Squirtle", "Bulbasaur"};
        String[] hp = {360, 390, 300};
        String[] attacks = {"Flamethrower", "Hydro Pump", "Solar Beam", "Headbutt", "Bite", "Slash"};
        String[] types = new String["Fire", "Water", "Grass", "Other"];
        int[] damages = new int["100", "120", "120", "50" , "50", "40"];
        int[] pps = new int["5", "2", "2", "30", "25", "25"];
        String[] locations = new String["north", "west", "east", "south"];

        
        
        String[] descriptions = new String[trainerBattle, HealPokemon, forest1]

        String playerName = "";
        
        System.out.println("Pokemon Text Adventure");
        System.out.println("Start \nExit");
        System.out.println("Enter a command: ");
        String beginning = scanner.nextLine();
    
        if(beginning.equalsIgnoreCase("start"))
        {
            System.out.println("Hi! Sorry to keep you waiting! Welcome to the world of Pokémon! My name is Oak. People call me the Pokémon Professor."
             + "\nThis is a world inhabited by creatures called Pokémon."
             + "\nFor some people, Pokémon are pets. Others use them for fights. Myself... I study Pokémon as a profession." 
             + "\nBut first, tell me a little about yourself. what's your name: ");
             playerName = scanner.nextLine();
             System.out.println("All right, so your name is " + playerName + ". Your adventure is about to unfold. Fun experiences, difficult experiences..."
             + "\nThere's so much waiting for you. Dreams, adventure, let's go!");

            System.out.println();
        
            while(true)
                {
                    System.out.println("First. Please select one of the following pokemon."
                    + "\nOption 1: Charmander"
                    + "\nOption 2: Squirtle"
                    + "\nOption 3: Bulbasaur");
                    String pokemonSelected = scanner.nextLine();
                    int correctChoice = BubbleSearch(pokemon, pokemonSelected);
                    if(correctChoice >= 0)
                    {
                        Attacks attack1 = new Attacks(attacks.(correctChoice), pps.(correctChoice), damage.(correctChoice), types.(correctChoice));
                        Attacks attack2 = new Attacks(attacks.(attacks.length() - correctChoice), types.(3));
                        Pokemon player = new Pokemon(pokemons.(correctChoice), hp.(correctChoice), hp.(correctChoice), attacks.(correctChoice), attacks.(attacks.length() - correctChoice, types.(correctChoice));
                        break;
                    }
                }
            
                System.out.println();
            
                while(true)
                {
                    String goTo1 = "";
                    while(true)
                    {
                        System.out.println("As you begin your journey. You find yourself at a crossroads that splits into 3 separate paths,"
                        + "\n The North path leads deep into the forest, where wild pokemon are bound to be present."
                        + "\n The West path leads directly into a small town, where you may encounter other pokemon trainers,"
                        + "\n the East path leads directly into a city, you can find a pokemon center there to heal your pokemon.");
            
                        System.out.println("Option 1: North"
                        + "\nOption 2: West"
                        + "\nOption 3: East"
                        + "\nEnter Where you would like to go: ");
                        String locations1 = scanner.nextLine();
                         int isRealLocation = BinarySearch(locations, locations1);
                        if(isRealLocation > 0)
                        {
                            goTo1 += locations1;
                            break;
                        }
                        else
                        {
                            System.out.println("That is not a location you can visit. Please try again.");
                        }
                    }
                    if(goTo1.equalsIgnorecase("north"))
                    {
                        locations.forest();
                    
                    }
                    else if(goTo1.equalsIgnorecase("west"))
                    {
                        Attacks trainerAttack1  = new Attack(attacks(1), pps.(1), types.(1));
                        Attacks trainerAttack2  = new Attack(attacks.(4), pps.(4), types.(3));
                        pokemon trainer = new Pokemon(pokemons.(1), hp.(1), hp.(1), trainerAttack1, trainerAttack2, types(1));
                    
                        locations.trainerBattle();
                        boolean trainerEncounter = Encounter(player, trainer);
                         if(trainerEncounter == true)
                        {
                            break;
                        }
                    }
                    else
                    {
                        locations.pokemonCenter();
                    }
                }
    
                while(true)
                {
                    String goTo2 = "";
                    while(true)
                    {
                        System.out.println("After the battle with pokemon trainer, you continue your journey west, before coming across another fork in the road"
                        + "\n The North path leads into another forest, the path might not be blocked this time."
                        + "\n The West path leads directly into a town, it doesnt seem like thers much people around"
                        + "\n the East path leads directly into a city, you can find a pokemon center there to heal your pokemon.");
            
                        System.out.println("Option 1: North"
                        + "\nOption 2: West"
                        + "\nOption 3: East"
                        + "\nEnter Where you would like to go: ");
                        String locations1 = scanner.nextLine();
                        int isRealLocation = BinarySearch(locations, locations1);
                        if(isRealLocation > 0)
                        {
                            goTo2 += locations1;
                            break;
                        }
                        else
                        {
                            System.out.println("That is not a location you can visit. Please try again.");
                        }
                    }
                    if(goTo2.equalsIgnorecase("north"))
                    {
                        locations.forest();
                        Attacks wildAttack1  = new Attack(attacks.(2), pps.(2), types.(2));
                        Attacks wildAttack2  = new Attack(5), pps.(5), types.(3));
                        pokemon wild = new Pokemon(pokemons.(2), hp.(correctChoice), hp.(2), wildAttack1, wildAttack2, types.(2));
                        
                        locations.trainerBattle();
                        boolean wildEncounter = Encounter(player, wild);
                        if(wildEncounter == true)
                        {
                            break;
                        }
                    }
                    else if(goTo2.equalsIgnorecase("west"))
                    {
                        locations.();
                    }
                    else
                    {
                        locations.pokemonCenter();
                    }    
            }
        System.out.println("End of demo!");
    }
        

    private static int[] bubbleSort(int a1[])
    {
        int temp;
        boolean fixed = false;
        
        while(fixed == false)
        {
            fixed = true;
            for(int i = a1.length - 1; i > 0; i--)
            {
                if(a1[i] > a1[i - 1])
                {
                    temp = a1[i - 1];
                    a1[i - 1] = a1[i];
                    a1[i] = temp;
                    fixed = false;
                }
            }
        }
        return a1;
    }
}
