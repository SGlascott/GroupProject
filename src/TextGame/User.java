package TextGame;

public class User {
    String name;
    int gold;
    int EXP;
    int Melee;
    int Range;
    int Magic;
    int Defense;
    Item[] inventory;
    Item hand;
    int x;
    int y;
    
    public User(String name)
    {
        this.name = name;
        this. gold = 50;
        this.EXP = 0;
        this.Melee = 1;
        this.Range = 1;
        this.Magic = 1;
        this.Defense = 1;
        this.inventory = new Item[14];
        this.x = 0;
        this.y = 0;
    }
    
    public String toString()
    {
        String ret = "Name: " + this.name + "\nEXP: " + this.EXP + "\nMelee: " + this.Melee + "\nRange: " + this.Range + "\nMagic: "+ this.Magic +"\nDefense: " + this.Defense;
        return ret;
    }

    
    
}
