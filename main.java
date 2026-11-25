import java.util.Arrays;
import java.util.Optional;

public class main {
    public static void main(String[] args) {
        // Array of names
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Ethan"};
        
        // The name we are looking for
        String targetName = "Charlie";

        // Using a stream and a lambda expression to search for the name
        Optional<String> result = Arrays.stream(names)
                .filter(name -> name.equalsIgnoreCase(targetName)) // Lambda expression
                .findFirst();

        // Check if the name was found and print the result
        if (result.isPresent()) {
            System.out.println("Success! Found name: " + result.get());
        } else {
            System.out.println("Name not found in the array.");
        }
    }
}
