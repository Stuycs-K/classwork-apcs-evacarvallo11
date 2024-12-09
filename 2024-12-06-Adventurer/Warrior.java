import java.util.Random;
public class Warrior extends Adventurer
  {
    private int rage;
    public Warrior(String name, int hp)
    {
      super(name, hp);
      this.rage = 0;
    }
    public String getSpecialName()
    {
      return "Rage";
    }
    public int getSpecial()
    {
      return this.rage;
    }
    public void setSpecial(int n)
    {
      this.rage = n;
    }
    public int getSpecialMax() 
    {
      return 80;
    }
    public String attack(Adventurer other)
    {
      other.applyDamage(15);
      return this.getName() + " attacked" + other.getName();
    }
    public String support(Adventurer other)
    {
      other.setHP(other.getHP() + 5);
      return this.getName() + "support" + other.getName();
    }
    public String support()
    {
      this.setHP(this.getHP() + 5);
      return this.getName() + "heals itself";
        }
    public String specialAttack(Adventurer other)
    {
      other.applyDamage(10);
      this.rage -= 10;
      return this.getName() + " special attack";
    }
  }
