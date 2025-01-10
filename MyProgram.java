import java.util.Scanner;

public class MyProgram 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        String[] pokemons = { "Bulbasaur", "Charmander", "Squirtle"};
        int[] hp = {370, 350, 390};
        String[] attacks = {"vine whip", "ember", "water gun", "Bite", "Slash", "Headbutt",};
        String[] types = {"Grass", "Fire", "Water", "Other"};
        int[] damages = {75, 85, 65, 55, 95, 100};
        int[] pps = {2, 2, 4, 25, 25, 30};
        String[] locationChoices = {"East", "North", "West"};

        String playerName;
        Attacks attack1;
        Attacks attack2;
        Pokemon player;
                
        System.out.println("Pokemon Text Adventure");
        System.out.println("Start \nExit");
        System.out.println("Enter a command [Start/Exit]: ");
        String beginning = scanner.nextLine();
        System.out.println();
    
        if(beginning.equalsIgnoreCase("start")) //introduction sequence, player decides to actually play the game
        {
            System.out.println("--------------------------------------------------------------------------------------"
            + "\nHi! Sorry to keep you waiting! Welcome to the world of Pokémon! My name is Oak. People call me the Pokémon Professor."
            + "\nThis is a world inhabited by creatures called Pokémon."
            + "\nFor some people, Pokémon are pets. Others use them for fights. Myself... I study Pokémon as a profession." 
            + "\nBut first, tell me a little about yourself. what's your name: ");
            playerName = scanner.nextLine();
            System.out.println("All right, so your name is " + playerName + ". Your adventure is about to unfold. Fun experiences, difficult experiences..."
            + "\nThere's so much waiting for you. Dreams, adventure, let's go!");
;
        
            while(true) //choose a pokemon
            {
                System.out.println("\nFirst. Please select one of the following pokemon."
                + "\nOption 1: Bulbasaur"
                + "\nOption 2: Charmander"
                + "\nOption 3: Squirtle"
                + "\n[Enter name]: ");
                String pokemonSelected = scanner.nextLine();
                int correctChoice = binarySearch(pokemons, pokemonSelected);
                
                if(correctChoice >= 0) //creates the players pokemon
                {
                    attack1 = new Attacks(attacks[correctChoice], pps[correctChoice], pps[correctChoice], damages[correctChoice], types[correctChoice]);
                    attack2 = new Attacks(attacks[attacks.length - correctChoice - 1], pps[attacks.length - correctChoice - 1], pps[attacks.length - correctChoice - 1], damages[attacks.length - correctChoice - 1], types[3]);
                    player = new Pokemon(pokemons[correctChoice], hp[correctChoice], hp[correctChoice], attack1, attack2, types[correctChoice]);
                    
                    System.out.println("You have selected " + player.getName() + " The " + player.getType() + "type pokemon");
                    break;
                }
                System.out.println("That is not a valid reponse, please try again.\n");
            }
            
            String goTo1 = "";
            Attacks trainerAttack1;
            Attacks trainerAttack2;
            Pokemon trainer;
            
            while(true) //first section of the game
            {
                while(true) //picking a location to visit
                {
                    System.out.println("\n--------------------------------------------------------------------------------"
                    + "\nAs you begin your journey. You find yourself at a crossroads that splits into 3 separate paths,"
                    + "\nThe North path leads deep into the forest, where wild pokemon are bound to be present."
                    + "\nThe West path leads directly into a small town, where you may encounter other pokemon trainers,"
                    + "\nthe East path leads directly into a city, you can find a pokemon center there to heal your pokemon.");
            
                    System.out.println("\nOption 1: North"
                    + "\nOption 2: West"
                    + "\nOption 3: East"
                    + "\nEnter Where you would like to go"
                    + "\n[North, West, East]: ");
                    goTo1 = scanner.nextLine();
                    int isRealLocation = binarySearch(locationChoices, goTo1);
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
                    trainerAttack1  = new Attacks(attacks[1], pps[1], pps[1], damages[1], types[1]);
                    trainerAttack2  = new Attacks(attacks[4], pps[4], pps[4], damages[4], types[3]);
                    trainer = new Pokemon(pokemons[1], hp[1], hp[1], trainerAttack1, trainerAttack2, types[1]);
                        
                    Locations.trainerBattle();
                    boolean trainerEncounter = new Encounter(player, trainer).battle(); //pokemon battle
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
            Attacks wildAttack1;
            Attacks wildAttack2;
            Pokemon wild;
            while(true) //second section of the game
            {
                while(true) //selecting a location to visit
                {
                    System.out.println("\n----------------------------------------------------------------------------------------------------"
                    + "\nAfter the battle with pokemon trainer, you continue your journey west, before coming across another fork in the road"
                    + "\nThe North path leads into another forest, the path might not be blocked this time."
                    + "\nThe West path leads directly into a town, it doesnt seem like thers much people around"
                    + "\nthe East path leads directly into a city, you can find a pokemon center there to heal your pokemon.");
            
                    System.out.println("Option 1: North"
                    + "\nOption 2: West"
                    + "\nOption 3: East"
                    + "\nEnter Where you would like to go"
                    + "\n[North, West, East]: ");
                    goTo2 = scanner.nextLine();
                    int isRealLocation = binarySearch(locationChoices, goTo2);
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
                    wildAttack1  = new Attacks(attacks[2], pps[2], pps[2], damages[2], types[2]);
                    wildAttack2  = new Attacks(attacks[3], pps[3], pps[3], damages[3], types[3]);
                    wild = new Pokemon(pokemons[2], hp[2], hp[2], wildAttack1, wildAttack2, types[2]);
                        
                    Locations.forestBattle();
                    boolean wildEncounter = new Encounter(player, wild).battle();
                    if(wildEncounter == true) //does the player win
                    {
                        System.out.println("after the battle, You move forward on your journey, not knowing where it will take you. \n");
                        break;
                    }
                    else //player loss
                    {
                        Locations.pokemonCenter(player, false);
                    }
                }
                else if(goTo2.equalsIgnoreCase("west"))
                {
                    wildAttack1  = new Attacks(attacks[0], pps[0], pps[0], damages[0], types[0]);
                    wildAttack2  = new Attacks(attacks[5], pps[5], pps[5], damages[5], types[3]);
                    wild = new Pokemon(pokemons[0], hp[0], hp[0], wildAttack1, wildAttack2, types[0]);
                    
                    Locations.town();
                    boolean wildEncounter = new Encounter(player, wild).battle();
                    if(wildEncounter == true) //does the player win
                    {
                        System.out.println("After the battle, you quickly head back to where you came");
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
        }
    System.out.println("end of demo"); //the end
}
        

    public static int binarySearch(String[] a1, String str) //a binary search method
    {
        int low = 0;
        int high = a1.length - 1;
        
        int indexOf;
        
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
