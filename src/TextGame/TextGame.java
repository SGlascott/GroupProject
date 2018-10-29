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
        int map[][] = new int[10][10];
        
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
                checkMap(character);
            }
            else if(input.equals("South"))
            {
                character.y--;
                checkMap(character);
            }
            else if(input.equals("East"))
            {
                character.x++;
                checkMap(character);
            }
            else if(input.equals("West"))
            {
                character.x--;
                checkMap(character);
            }
            else if(input.equals("Character"))
            {
                System.out.println(character.toString());
            }
        }
    }
    
    private static void checkMap(User character)
    {
        if(character.x == 0 && character.y == 0)
        {
            System.out.println("Welcome to our game!");
        }
        else if(character.x == 0 && character.y == 1)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 0 && character.y == 2)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 0 && character.y == 3)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 0 && character.y == 4)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 0 && character.y == 5)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 0 && character.y == 6)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 0 && character.y == 7)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 0 && character.y == 8)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 0 && character.y == 9)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 1 && character.y == 0)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 1 && character.y == 1)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 1 && character.y == 2)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 1 && character.y == 3)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 1 && character.y == 4)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 1 && character.y == 5)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 1 && character.y == 6)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 1 && character.y == 7)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 1 && character.y == 8)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 1 && character.y == 9)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 2 && character.y == 0)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 2 && character.y == 1)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 2 && character.y == 2)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 2 && character.y == 3)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 2 && character.y == 4)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 2 && character.y == 5)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 2 && character.y == 6)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 2 && character.y == 7)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 2 && character.y == 8)
        {
            System.out.println("Your new position is 0,1");
        }
        else if(character.x == 2 && character.y == 9)
        {
            System.out.println("Your new position is 0,1");
        }
    }
    
}
