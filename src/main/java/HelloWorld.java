import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class HelloWorld {
    public static void sayHello(){
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        sayHello();

        Scanner prompt = new Scanner(System.in);
        System.out.println("Please enter something \n");
        String userInput = prompt.nextLine();
        System.out.println("You entered: " + userInput);



    }
}
