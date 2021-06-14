import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter something: ");

        String userInput = sc.nextLine();
        //Tells whether or not what the user entered is a number.
        if (!StringUtils.isNumeric(userInput)) {
            System.out.println("\"" + userInput + "\" is not a number.");
        } else {
            System.out.println(userInput);
        }

        //Flips case of the string
        System.out.println(StringUtils.swapCase("Flipped case: " + userInput));

        //Reverses the string
        System.out.println("Reversed :" + StringUtils.reverse(userInput));
    }

}