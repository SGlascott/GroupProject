/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextGame;

/**
 *
 * @author paint
 */
public class NPC {
    private String Name;
    private boolean friendly;
    private int level;
    private int Melee;
    private int Range;
    private int Magic;
    private int Defense;
    private Item droptable[];
    
    public NPC(String name, boolean friendly, int level, int mele, int range, int magic, int defense){
        this.Name = name;
        this.level = level;
        this.Melee = mele;
        this.Range = range;
        this.Magic = magic;
        this.Defense = defense;   
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the friendly
     */
    public boolean isFriendly() {
        return friendly;
    }

    /**
     * @param friendly the friendly to set
     */
    public void setFriendly(boolean friendly) {
        this.friendly = friendly;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * @return the Melee
     */
    public int getMelee() {
        return Melee;
    }

    /**
     * @param Melee the Melee to set
     */
    public void setMelee(int Melee) {
        this.Melee = Melee;
    }

    /**
     * @return the Range
     */
    public int getRange() {
        return Range;
    }

    /**
     * @param Range the Range to set
     */
    public void setRange(int Range) {
        this.Range = Range;
    }

    /**
     * @return the Magic
     */
    public int getMagic() {
        return Magic;
    }

    /**
     * @param Magic the Magic to set
     */
    public void setMagic(int Magic) {
        this.Magic = Magic;
    }

    /**
     * @return the Defense
     */
    public int getDefense() {
        return Defense;
    }

    /**
     * @param Defense the Defense to set
     */
    public void setDefense(int Defense) {
        this.Defense = Defense;
    }

    /**
     * @return the droptable
     */
    public Item[] getDroptable() {
        return droptable;
    }

    /**
     * @param droptable the droptable to set
     */
    public void setDroptable(Item[] droptable) {
        this.droptable = droptable;
    }
}
