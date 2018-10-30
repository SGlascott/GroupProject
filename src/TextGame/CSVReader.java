/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextGame;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author paint
 */
public class CSVReader {
    String csvFile;
    BufferedReader br = null;
    String line = "";
    String cvsSplitBy = ",";
    
    public CSVReader(String file)
    {
        this.csvFile = file;
    }
    
    public String[] findObj(int ID)
    {
        int lines = 0;
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                if(lines == ID+1)
                {
                    return line.split(cvsSplitBy);     
                }
                lines++;
                
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
