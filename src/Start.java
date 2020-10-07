import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Start {
    /* Init field and data structures */
    static final Scanner commandLineGUI = new Scanner(System.in);

    static final String verbToExercise = "fly";
    static final String exerciseContent = "Complete the 2nd and 3rd forms of the irregular verb: " + verbToExercise;

    static final ArrayList<String> userResponses = new ArrayList<>();
    static final ArrayList<String> correctAnswers = new ArrayList<>();

    public static void main(String[] args) {
        /* Display exercise content */
        System.out.println(exerciseContent);

        /* Set good answers */
        correctAnswers.add("flew");
        correctAnswers.add("flown");

        /* How many time get input for user */
        IntStream.range(0, correctAnswers.size()).forEach(i -> userResponses.add(commandLineGUI.nextLine()));

        /* Display information about user responses */
        var counter = 0;
        while (counter < userResponses.size()) {
            System.out.println(userResponses.get(counter).equals(correctAnswers.get(counter)) ? "Good !" : "Bad");
            counter++;
        }
        /* Display good answers */
        correctAnswers.forEach(System.out::println);

        /* Closed scanner */
        commandLineGUI.close();
    }
}
