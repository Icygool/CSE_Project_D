import java.util.Scanner;
import java.util.Arrays;

public class MyProgram 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        String[] pokemons = { "Bulbasaur", "Charmander", "Squirtle"};
        String[] hp = {300, 360, 390};
        String[] attacks = {"Solar Beam", "Flamethrower", "Hydro Pump", "Bite", "Slash", "Headbutt",};
        String[] types = {"Grass", "Fire", "Water", "Other"};
        int[] damages = {120, 100, 120, 50, 40, 50};
        int[] pps = {2, 5, 2, 25, 25, 30};

        String[] locationChoices = {"East", "North", "West"};

        String playerName = "";
        
        System.out.println("Pokemon Text Adventure");
        System.out.println("Start \nExit");
        System.out.println("Enter a command: ");
        String beginning = scanner.nextLine();
    
        if(beginning.equalsIgnoreCase("start")) //introduction sequence
        {
            System.out.println("Hi! Sorry to keep you waiting! Welcome to the world of Pokémon! My name is Oak. People call me the Pokémon Professor."
            + "\nThis is a world inhabited by creatures called Pokémon."
            + "\nFor some people, Pokémon are pets. Others use them for fights. Myself... I study Pokémon as a profession." 
            + "\nBut first, tell me a little about yourself. what's your name: ");
            playerName = scanner.nextLine();
            System.out.println("All right, so your name is " + playerName + ". Your adventure is about to unfold. Fun experiences, difficult experiences..."
            + "\nThere's so much waiting for you. Dreams, adventure, let's go!");

            System.out.println();
        
            while(true) //choose a pokemon
            {
                System.out.println("First. Please select one of the following pokemon."
                + "\nOption 1: Bulbasaur"
                + "\nOption 2: Charmander"
                + "\nOption 3: Squirtle");
                String pokemonSelected = scanner.nextLine();
                int correctChoice = BinarySearch(pokemons, pokemonSelected);
                if(correctChoice >= 0) //creates the players pokemon
                {
                    Attacks attack1 = new Attacks(attacks[correctChoice], pps[correctChoice], pps[correctChoice], damages[correctChoice], types[correctChoice]);
                    Attacks attack2 = new Attacks(attacks[attacks.length - correctChoice], pps[attacks.length - correctChoice], pps[attacks.length - correctChoice], damages[attacks.length - correctChoice], types[3]);
                    Pokemon player = new Pokemon(pokemons[correctChoice], hp[correctChoice], hp[correctChoice], attack1, attack2, types[correctChoice]);
                    break;
                }
            }
            
            System.out.println();
            goTo1 = "";
            boolean trainerEncounter = false;
            while(true) //first section of the game
            {
                while(true) //picking a location to visit
                {
                    System.out.println("As you begin your journey. You find yourself at a crossroads that splits into 3 separate paths,"
                    + "\n The North path leads deep into the forest, where wild pokemon are bound to be present."
                    + "\n The West path leads directly into a small town, where you may encounter other pokemon trainers,"
                    + "\n the East path leads directly into a city, you can find a pokemon center there to heal your pokemon.");
            
                    System.out.println("Option 1: North"
                    + "\nOption 2: West"
                    + "\nOption 3: East"
                    + "\nEnter Where you would like to go: ");
                    goTo1 = scanner.nextLine();
                    int isRealLocation = BinarySearch(locationChoices, goTo1);
                    if(isRealLocation >= 0)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("That is not a location you can visit. Please try again.");
                    }
                }
                if(goTo1.equalsIgnoreCase("north"))
                {
                    Locations.forest();
                }
                else if(goTo1.equalsIgnoreCase("west"))
                {   //creates the opponant pokemon
                    Attacks trainerAttack1  = new Attacks(attacks[1], pps[1], pps[1], damages[1], types[1]);
                    Attacks trainerAttack2  = new Attacks(attacks[4], pps[4], pps[4], damages[4], types[3]);
                    Pokemon trainer = new Pokemon(pokemons[1], hp[1], hp[1], trainerAttack1, trainerAttack2, types[1]);
                        
                    Locations.trainerBattle();
                    trainerEncounter = Encounter(player, trainer).battle(); //pokemon battle
                    if(trainerEncounter == true) //does the player win
                    {
                        break;
                    }
                    else //player loss
                    {
                        Locations.pokemonCenter(player, false);
                    }
                }
                else
                {
                    Locations.pokemonCenter(player, true);
                }
            }
            
            String goTo2 = "";
            boolean wildEncounter = false;
            while(true) //second section of the game
            {
                while(true) //selecting a location to visit
                {
                    System.out.println("After the battle with pokemon trainer, you continue your journey west, before coming across another fork in the road"
                    + "\n The North path leads into another forest, the path might not be blocked this time."
                    + "\n The West path leads directly into a town, it doesnt seem like thers much people around"
                    + "\n the East path leads directly into a city, you can find a pokemon center there to heal your pokemon.");
            
                    System.out.println("Option 1: North"
                    + "\nOption 2: West"
                    + "\nOption 3: East"
                    + "\nEnter Where you would like to go: ");
                    goTo2 = scanner.nextLine();
                    int isRealLocation = BinarySearch(locationChoices, goTo2);
                    if(isRealLocation >= 0)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("That is not a location you can visit. Please try again.");
                    }
                }
                if(goTo2.equalsIgnoreCase("north"))
                {   //creates opponant pokemon
                    Attacks wildAttack1  = new Attacks(attacks[2], pps[2], pps[2], damages[2], types[2]);
                    Attacks wildAttack2  = new Attacks(attacks[5], pps[5], pps[5], damages[5], types[3]);
                    pokemon wild = new Pokemon(pokemons[2], hp[2], hp[2], wildAttack1, wildAttack2, types[2]);
                        
                    Locations.trainerBattle();
                    wildEncounter = Encounter(player, wild).battle();
                    if(wildEncounter == true) //does the player win
                    {
                        break;
                    }
                    else //player loss
                    {
                        Locations.pokemonCenter(player, false);
                    }
                }
                else if(goTo2.equalsIgnoreCase("west"))
                {
                    Locations.town();
                }
                else
                {
                    Locations.pokemonCenter(player, true);
                }
            }
        }
    System.out.println("End of demo!"); //the end
}
        

    public static int binarySearch(String[] a1, String str) //a binary search method
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
