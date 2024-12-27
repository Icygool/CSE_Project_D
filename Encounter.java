import java.util.Scanner;
import java.util.Random;

public class Encounter
{
  public Pokemon player;
  public Pokemon opponant;
  
  public Encounter(Pokemon player, Pokemon opponant)
  {
    this.player = player;
    this.opponant = opponant;
  }

  public battle()
  {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    
    System.out.println("You sent out " + player.getName() + ", your opponant sent out a " + opponant.getName());
    boolean victory;

    while(true)
      {
        System.out.println(opponant.getName() + " HP:" + opponant.getHP());
        System.out.println(player.getName() + " HP: " + player.getHP());

        while(true)
          {
            while(true)
              {
                System.out.println("What will you like to do?" 
                           + "Opion 1: " + player.Attack1().getName() + ": damage" +  + " pp: " + player.Attack1().getPP()
                           + "\n Option2:" + player.Attack2().getName() + ": damage" +  + " pp: " + player.Attack2().getPP());
                String choice = scanner.nextLine();
                if(choice.equalsIgnorecase(player.Attack1().getName()))
                {
                  System.out.println("");
                  opponant.getHP() -= player.Attack1().getDamage();
                  
                  break;
                }
                else if(choice.equalsIgnorecase(player.Attack1().getName()))
                {  
                  System.out.println("");
                  opponant.getHP() -= player.Attack2().getDamage();
                  break;
                }
              }
            if(opponant.isAlive() == false)
              {
                System.out.println("Congratulations, you win!");
                victory = true;
                break;
              }
            int opponantMove = rand.nextInt(2) + 1;
            if(opponantMove == 1)
            {
              System.out.println("");
              player.getHP() -= opponant.Attack1().getdamage();
            }
            else if(opponantMove == 2)
            {
              System.out.println("");
              player.getHP() -= opponant.Attack2().getdamage();
            }

            if(player.isAlive() == false)
            {
              System.out.println("You lose the battle.");
              victory = false;
              break;
            }
          }
        break;
      }
    return victory;
  }
}

