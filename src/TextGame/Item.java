
package TextGame;

public class Item {
    private String name;
    private int id;
    private int attBonus;
    private int rangeBonus;
    private int magicBonus;
    private int defenseBonus;
    private int attribute;
    private int reqLvl;
    
    public Item(String name, int id, int attBonus, int rangeBonus, int magicBonus, int defenseBonus, int attribute, int reqLvl)
    {
        this.name = name;
        this.attBonus = attBonus;
        this.rangeBonus = rangeBonus;
        this.magicBonus = magicBonus;
        this.defenseBonus = defenseBonus;
        this.attribute = attribute;
        this.reqLvl = reqLvl;        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the attBonus
     */
    public int getAttBonus() {
        return attBonus;
    }

    /**
     * @param attBonus the attBonus to set
     */
    public void setAttBonus(int attBonus) {
        this.attBonus = attBonus;
    }

    /**
     * @return the rangeBonus
     */
    public int getRangeBonus() {
        return rangeBonus;
    }

    /**
     * @param rangeBonus the rangeBonus to set
     */
    public void setRangeBonus(int rangeBonus) {
        this.rangeBonus = rangeBonus;
    }

    /**
     * @return the magicBonus
     */
    public int getMagicBonus() {
        return magicBonus;
    }

    /**
     * @param magicBonus the magicBonus to set
     */
    public void setMagicBonus(int magicBonus) {
        this.magicBonus = magicBonus;
    }

    /**
     * @return the defenseBonus
     */
    public int getDefenseBonus() {
        return defenseBonus;
    }

    /**
     * @param defenseBonus the defenseBonus to set
     */
    public void setDefenseBonus(int defenseBonus) {
        this.defenseBonus = defenseBonus;
    }

    /**
     * @return the attribute
     */
    public int getAttribute() {
        return attribute;
    }

    /**
     * @param attribute the attribute to set
     */
    public void setAttribute(int attribute) {
        this.attribute = attribute;
    }

    /**
     * @return the reqLvl
     */
    public int getReqLvl() {
        return reqLvl;
    }

    /**
     * @param reqLvl the reqLvl to set
     */
    public void setReqLvl(int reqLvl) {
        this.reqLvl = reqLvl;
    }
}
