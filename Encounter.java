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

    int currantHpOpponant = opponant.getHP();
    int currantHpPlayer = player.getHP();

    while(true)
      {
        System.out.println(opponant.getName() + " HP:" + currantHpOpponant);
        System.out.println(player.getName() + " HP: " + currantHpPlayer);

        while(true)
          {
            while(true)
              {
                System.out.println("What will you like to do?" 
                           + "Opion 1: " + player.Attack1().getName() + ": damage" +  + " pp: " + player.Attack1().getPP()
                           + "\n Option2:" + player.Attack2().getName() + ": damage" +  + " pp: " + player.Attack2().getPP());
                String choice = scanner.nextLine();
                if(choice.equalsIgnorecase(player.getAttack1().getName()))
                {
                  System.out.println("");
                  int damage = calculateDamage(opponant, player.getAttack1());
                  currantHpOpponant -= damage;
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

  public calculateDamage(Pokemon target,Attack attackUsed)
  {
        double typeEffectiveness = 0;
        if((target.getType().equals("fire") and attackUsed.getType().equals("water"))
           || (target.getType().equals("water") and attackUsed.getType().equals("grass"))
           || (target.getType().equals("grass") and attackUsed.getType().equals("fire")))
        {
            typeEffectiveness = 2;
        }
        else if((target.getType().equals("fire") and attackUsed.getType().equals("grass"))
          || (target.getType().equals("water") and attackUsed.getType().equals("fire"))
          || (target.getType().equals("grass") and attackUsed.getType().equals("water")))
        {
            typeEffectiveness = 0.5;
        }
        else
        {
            typeEffectiveness = 1;
        }
          
        double damage = attackUsed.getDamage() * typeEffectiveness;
        return damage;
    }
}
