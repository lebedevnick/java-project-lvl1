package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String welcome(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println(String.format("Hello, %s!", name));
        return name;
    }

    public static Integer getGameNumber(Scanner scanner) {
        System.out.println(
                "Please enter the game number and press Enter.\n"
                        + "1 - Greet\n"
                        + "2 - Even\n"
                        + "0 - Exit");
        System.out.print("Your choice: ");
        return scanner.nextInt();
    }




}
