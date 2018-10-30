package TextGame;
import java.util.Scanner;
/**
 *
 * @author SCOTT AND JOEY
 */
public class TextGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character name:");
        String NameInput = sc.nextLine();
        User character = new User(NameInput);
        boolean running = true;
        Map map = new Map();
        
        while(running)
        {            
            System.out.printf("Enter a command: North, South, East, West, Character, Quit\n");
            String input = sc.nextLine();
            if(input.equals("Quit"))
            {
                running = false;
            }
            else if(input.equals("North"))
            {
                character.y++;
                map.checkMap(character);
            }
            else if(input.equals("South"))
            {
                character.y--;
                 map.checkMap(character);
            }
            else if(input.equals("East"))
            {
                character.x++;
                 map.checkMap(character);
            }
            else if(input.equals("West"))
            {
                character.x--;
                 map.checkMap(character);
            }
            else if(input.equals("Character"))
            {
                System.out.println(character.toString());
            }
        }
    }
    
    
    
}
