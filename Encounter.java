import java.util.Scanner;
import java.util.Random;

public class Encounter
{
  public Pokemon player;
  public Attacks playerAttack1;
  public Attacks playerAttack2;
  public Pokemon opponant;
  public Attacks opponantAttack1;
  public Attacks opponantAttack2;
  
  public Encounter(Pokemon player, Attacks playerAttack1, Attacks playerAttack2, Pokemon opponant, Attacks opponantAttack1, Attacks opponantAttack2)
  {
    this.player = player;
    this.playerAttack1 = playerAttack1;
    this.playerAttack2 = playerAttack2;
    this.opponant = opponant;
    this.opponantAttack1 = opponantAttack1;
    this.opponantAttack2 = opponantAttack2;
  }

  public battle()
  {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    
    System.out.println("You sent out " + player.getName() + ", your opponant sent out a " + opponant.getName());

    while(true)
      {
        System.out.println(opponant.getName() + " HP:" + opponant.getHP());
        System.out.println(player.getName() + " HP: " + player.getHP());

        while(true)
          {
            while(true)
              {
                System.out.println("What will you like to do?" 
                           + "Opion 1: " + playerAttack1.getName() + ": damage" +  + " pp: " + playerAttack1.getPP()
                           + "\n Option2:" + playerAttack2.getName() + ": damage" +  + " pp: " + playerAttack2.getPP());
                String choice = scanner.nextLine();
                if(choice.equalsIgnorecase(playerAttack1.getName()))
                {
                  System.out.println("");
                  opponant.getHP() -= playerAttack1.getDamage();
                  
                  break;
                }
                else if(choice.equalsIgnorecase(playerAttack1.getName()))
                {  
                  System.out.println("");
                  opponant.getHP() -= playerAttack2.getDamage();
                  break;
                }
              }
            int opponantMove = rand.nextInt(2) + 1;
            if(opponantMove == 1)
            {
              System.out.println("");
              player.getHP() -= opponantAttack1.getdamage();
            }
            else if(opponantMove == 2)
            {
              System.out.println("");
              player.getHP() -= opponantAttack2.getdamage();
            }
          }
        

        
      }
  }
}

