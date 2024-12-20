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
    
    System.out.println("You sent out " + player + ", your opponant sent out a " + opponant);

    while(true)
      {
        System.out.println(opponant + " HP:" + opponant.getHP());
        System.out.println(player + " HP: " + player.getHP());
        
        System.out.println("WHat will you like to do?" 
                           + "Opion 1: " + playerAttack1 + ": damage" +  + " pp: " + playerAttack1.getPP
                           + "\n Option2:" + playerAttack2 + ": damage" +  + " pp: " + playerAttack2.getPP);
        String choice = scanner.nextLine();
        if()
        {
          
        }

        
      }
  }
}

