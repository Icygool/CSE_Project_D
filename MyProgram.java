/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Final_Project;

import java.util.Scanner;

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
        
        String[] pokemons = new String["Charmander", "Squirtle", "Bulbasaur"];
        String[] hp = new int[360, 390, 300];
        String[] attacks = new String["Flamethrower", "Hydro Pump", "Solar Beam", "Headbutt", "Bite", "Slash"];
        String[] types = new String["Fire", "Water", "Grass", "Other"];
        int[] damages = new int["100", "120", "120", "50" , "50", "40"];
        int[] pps = new int["5", "2", "2", "30", "25", "25"];
        String[] locations = new String["north", "west", "east", "south"];

        String trainerBattle = "You walked in front of me, lets battle!";
        String HealPokemon = "Would you like to rest your pokemon?";
        String forest1 = "It is an empty forest";
        String town2 = "A snorlax is blocking the way";
        String forest2 = "YOu encountered a wild bulbasaur";
        
        
        String[] descriptions = new String[trainerBattle, HealPokemon, forest1]

        String playerName = "";
        String[] trainer = [];
        String[] wild = [];
        
        ArrayList<Pokemon> allPokemons = new ArrayList<Pokemon>
        ArrayList<Attacks> allAttacks = new  ArrayList<Attacks>
        
        System.out.println("Pokemon Text Adventure");
        System.out.println("Start \nExit");
        System.out.println("Enter a command: ");
        String beginning = scanner.nextLine();
        
        if(beginning.equalsIgnoreCase("start"))
        {
            System.out.println("Hi! Sorry to keep you waiting! Welcome to the world of Pokémon! My name is Oak. People call me the Pokémon Professor."
            + "\nThis is a world inhabited by creatures called Pokémon."
            + "\nFor some people, Pokémon are pets. Others use them for fights. Myself... I study Pokémon as a profession." 
            + "\nBut first, tell me a little about yourself. what's your name: "
            playerName = scanner.nextLine();
            System.out.println("All right, so your name is " + playerName + ". Your adventure is about to unfold. Fun experiences, difficult experiences..."
            + "\nThere's so much waiting for you. Dreams, adventure, let's go!");                  
        }
        else
        {
            System.out.println("nothing");
        }
        
        System.out.println();
        

        while(true)
            {
                System.out.println("First. Please select one of the following pokemon."
                + "\nOption 1: Charmander"
                + "\nOption 2: Squirtle"
                + "\nOption 3: Bulbasaur");
                String pokemonSelected = scanner.nextLine();
                int correctChoice = BinarySearch(pokemon, pokemonSelected);
                if(correctChoice >= 0)
                {
                    Attacks attack1 = new Attacks(attacks.(correctChoice), pps.(correctChoice), damage.(correctChoice));
                    Attacks attack2 = new Attacks(attacks.(attacks.length() - correctChoice), );
                    
                    Pokemon player = new Pokemon(pokemons.(correctChoice), hp.(correctChoice), attacks.(correctChoice), attacks.(attacks.length() - correctChoice);
                    break;
                }
            }
        
        System.out.println();
        
        while(true)
        {
            String goTo = "";
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
                    goTo += locations1;
                    break;
                }
                else
                {
                    System.out.println("That is not a location you can visit. Please try again.");
                }
            }
            if(goTo.equalsIgnorecase("north"))
            {
                locations.forest();
                
            }
            else if(goTo.equalsIgnorecase("west"))
            {
                locations.trainerBattle();
                
                break;
            }
            else
            {
                locations.pokemonCenter();
                
            }    
        }

        while(true)
        {
            String goTo = "";
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
                    goTo += locations1;
                    break;
                }
                else
                {
                    System.out.println("That is not a location you can visit. Please try again.");
                }
            }
            if(goTo.equalsIgnorecase("north"))
            {
                locations.forest();
            }
            else if(goTo.equalsIgnorecase("west"))
            {
                locations.();
                break;
            }
            else
            {
                locations.pokemonCenter();
            }    
        }
    }

    public static int binarySearch(String[] a1, String str)
    {
        int low = 0;
        int high = a1.length - 1;
        
        int indexOf = 0;
        
        while (low <= high)
        {
            int mid = (low + high) / 2;
            int isEqual = a1[mid].compareToIgnoreCase(str);
            
            if(a1[mid].equalsIgnoreCase(str))
            {
                indexOf = mid;
                return indexOf;
            }
            else if(isEqual <= 0)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -1;
    }
}
