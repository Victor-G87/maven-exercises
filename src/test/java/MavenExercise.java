import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;


public class MavenExercise {

    public static void main(String[] args) {

        Scanner userInput =  new Scanner(System.in);



        System.out.print("\n\tEnter input to the console. \n\t>");
        String userString = userInput.nextLine();



        System.out.println("User Input: ");
        System.out.println(userString);
        System.out.println("Input Tests:");



        if (StringUtils.isNumeric(userString)) {
            System.out.println(".isNumeric: The input is not a string ");
        } else {
            System.out.println("isNumeric: The input is  a string");
        }



        System.out.println(".swapCase:  " + StringUtils.swapCase(userString));
        System.out.println(".reverse:  " + StringUtils.reverse(userString));
        System.out.println(".deleteWhiteSpace:  " + StringUtils.deleteWhitespace(userString) + "\n");

    }


}
