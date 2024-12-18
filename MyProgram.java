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
        
        
        String[] descriptions = new String[trainer, , ]

        String playerName = "";
        String[] trainer = [];
        String[] wild = [];
        
        
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
                    Pokemon player = new Pokemon();
                    player.add(pokemons.(correctChoice));
                    player.add(hp.(correctChoice));
                    player.add(attacks.(correctChoice));
                    player.add(types.(correctChoice));
                    player.add(pp.(correctChoice));
                    player.add(attacks.(attacks.length() - correctChoice));
                    player.add(types.(types.length() - correctChoice));
                    player.add(pp.(pp.length() - correctChoice));
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
                System.out.println("After the battle with pokemon trainer, he tells you to go ,"
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
            }
            if(goTo.equalsIgnorecase("north"))
            {
                locations.forest();
            }
            else if(goTo.equalsIgnorecase("west"))
            {
                locations.rival();
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
