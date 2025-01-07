import java.util.Scanner;
import java.util.Random;

public class Encounter
{
  public Pokemon player;
  public Pokemon opponent;
  
  public Encounter(Pokemon player, Pokemon opponent)
  {
    this.player = player;
    this.opponent = opponent;
  }

  public boolean battle() //the battle sequece
  {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    
    System.out.println("You sent out " + player.getName() + ", your opponent sent out a " + opponent.getName());
    boolean victory;

    int currentHpOpponent;
    int currentHpPlayer;
    int numHits;
    int damage;
    Attacks playerChoice;
    Attacks opponentChoice = null;

    while(true) //repeats until the player or opponant wins
    {
        currentHpOpponent = opponent.getHP();
        currentHpPlayer = player.getHP();
        
        System.out.println("---------------------------------------------------------------------");
      
        System.out.println("Opponants " + opponent.getName() + " HP:" + currentHpOpponent);
        System.out.println("Your " + player.getName() + " HP: " + currentHpPlayer);     

        while(true) //breaks when player enters a proper input
        {
          System.out.println("\nWhat will you like to do?" 
          + "\n Opion 1: " + player.getAttack1().getName() + "| damage: " + player.getAttack1().getDamage() + "| pp: " + player.getAttack1().getPP() + "| type: " + player.getAttack1().getType()
          + "\n Option 2: " + player.getAttack2().getName() + "| damage: " + player.getAttack2().getDamage() + " :pp " + player.getAttack2().getPP() + "| type: " + player.getAttack2().getType()
          + "\n[enter attack name]: ");
          String choice = scanner.nextLine();
          if(choice.equalsIgnoreCase(player.getAttack1().getName()))
          {
            playerChoice = player.getAttack1();
            break;
          }
          else if(choice.equalsIgnoreCase(player.getAttack2().getName()))
          {  
            playerChoice = player.getAttack2();
            break;
          }
          else
          {
            System.out.println("That is not an option, please choose again");
          }
        }
                
        System.out.println("");
        if(playerChoice.isUseable() == false) //player attacks
        {
          System.out.println("You do not have enough pp to use this move.");
          numHits = rand.nextInt(5);
          damage = struggle(opponent, player, numHits);
          currentHpOpponent -= damage;
        }
        else
        {
          damage = calculateDamage(opponent, playerChoice);
          playerChoice.decreasePP();
          System.out.println("You used " + playerChoice.getName()  
                              + " dealing " + damage + " damage to the opposing " + opponent.getName() + ".");
          currentHpOpponent -= damage;
        }
        opponent.setHp(currentHpOpponent);
        if(opponent.isAlive() == false)
        {
          System.out.println("Congratulations, you win!");
          victory = true;
          break;
        }
            
        int opponantMove = rand.nextInt(2) + 1; //randomly selects a attack for the opponant
        if(opponantMove == 1)
        {
          opponentChoice = opponent.getAttack1();
        }
        else if(opponantMove == 2)
        {
          opponentChoice = opponent.getAttack2();
        }
    
        System.out.println("");
        if(opponentChoice != null) //chatGPT
        {
            System.out.println("");
            if(opponentChoice.isUseable() == false) //opponant attacks
            {
                System.out.println("The opponant does not have pp to use this move. ");
                numHits = rand.nextInt(5) + 1;
                damage = struggle(player, opponent, numHits);
                currentHpPlayer -= damage;
            }
            else
            {
                damage = calculateDamage(player, opponentChoice);
                opponent.getAttack2().decreasePP();
                System.out.println("The opponant used " + opponentChoice.getName()  
                                + " dealing " + damage + " damage to your " + player.getName() + ".");
                currentHpPlayer -= damage;
            }
        }
        
        player.setHp(currentHpPlayer);
        if(player.isAlive() == false)
        {
          System.out.println("You lose the battle.\n you run to the nearest pokemon center toheal your pokemon.");
          victory = false;
          break;
        }
      }
    return victory;
  }        

  public static int calculateDamage(Pokemon target,Attacks attackUsed) //calculates the damage dealt
  {
      double typeEffectiveness;
      if((target.getType().equalsIgnoreCase("fire") && attackUsed.getType().equalsIgnoreCase("water"))
          || ((target.getType().equalsIgnoreCase("water") && attackUsed.getType().equalsIgnoreCase("grass")))
          || (target.getType().equalsIgnoreCase("grass") && attackUsed.getType().equalsIgnoreCase("fire")))
      {
          System.out.println("The attack was super effective");
          typeEffectiveness = 2;
      }
      else if(((target.getType().equalsIgnoreCase("fire") && attackUsed.getType().equalsIgnoreCase("grass")))
          || ((target.getType().equalsIgnoreCase("water") && attackUsed.getType().equalsIgnoreCase("fire")))
          || (target.getType().equalsIgnoreCase("grass") && attackUsed.getType().equalsIgnoreCase("water")))
      {
          System.out.println("The attack was not very effective");
          typeEffectiveness = 0.5;
      }
      else
      {
          typeEffectiveness = 1;
      }
      
      double calculatingDamage = attackUsed.getDamage() * typeEffectiveness;
      int damage = (int)calculatingDamage; //https://www.geeksforgeeks.org/convert-double-to-integer-in-java/
      return damage;
  }

  public static int struggle(Pokemon target, Pokemon attacker, int num) //recursion for when the attack has no PP
  {
      int numOfHits = 0;
      
      if(num == 0)
      {
          return 0;
      }
      numOfHits += 1;
      System.out.println("The " + attacker.getName() + " Struggled against " + target.getName() + ", hitting " + numOfHits
                         + " time, dealing " + (10 * numOfHits) + " damage.");
    
      return struggle(target, attacker, num - 1) + 10 * numOfHits;
  }
}
