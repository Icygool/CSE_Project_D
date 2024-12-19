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
    System.out.println("You sent out " + player + ", your opponant sent out a " + opponant);

    while(true)
      {
        
      }
  }
}

