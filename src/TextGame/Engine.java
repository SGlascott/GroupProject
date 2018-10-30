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
public class Engine {
    private String itemFile;
    
    public Engine()
    {
        itemFile = "./Items.csv";
    }
    
    public Item lookUpItem(int ID)
    {
        CSVReader reader = new CSVReader(itemFile);
        String itemStr[] = reader.findObj(ID);
        Item ret = new Item();
        ret.setId(Integer.parseInt(itemStr[0]));
        ret.setName(itemStr[1]);
        ret.setAttBonus(Integer.parseInt(itemStr[0]));
        ret.setRangeBonus(Integer.parseInt(itemStr[0]));
        ret.setMagicBonus(Integer.parseInt(itemStr[0]));
        ret.setAttribute(Integer.parseInt(itemStr[0]));
        ret.setReqLvl(Integer.parseInt(itemStr[0]));
        return ret;
    }
}
