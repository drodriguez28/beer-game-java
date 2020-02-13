
/**
 * Beer
 */
import java.util.Scanner;

public class Beer {
    public static void instructions() {
        // the instructions of the game 
        System.out.println("Bienvenido a Deivid's Cantina");
        System.out.println("Si quieres una chela .. you gotta tell me your age wei");
        System.out.println("Enter Age");


    }

    public static void main(String[] args) {
        instructions();
        Scanner myObj = new Scanner(System.in);
        int age;

        // Enter age and press Enter
        age = myObj.nextInt();

        // the logic of the game .. if your under 21, you can't get a beer, but if your over 21 you can 
        if (age >= 21) {
            System.out.println("Ten una chela");
        } else {
            System.out.println("Ni madres wei!");
        }
    }
}