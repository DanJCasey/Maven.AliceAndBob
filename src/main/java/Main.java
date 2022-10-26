import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        //inquiring the name to lead to output
        System.out.println("What is your name?");

        String name = in.nextLine();
//set alice and bob to both be acceptable answers, regardless of case sensitivity, to output "Hello!" if it
        // matches either, and to output a different message if the names do not match either Bob or Alice.
        if(name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob")) {
            System.out.print("Hello!");
        } else {
            System.out.print("You shouldn't be here");
        }
    }
}
