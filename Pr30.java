import java.util.*;

public class Pr30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Convert to lowercase for consistent counting
        input = input.toLowerCase();

        // Split sentence into words
        String[] words = input.split("\\s+");

        // Create HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Count frequency
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // Display result
        System.out.println("\nWord Frequency:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}
/* output 
  Enter a sentence: Java is fun and Java is powerful

Word Frequency:
java -> 2
is -> 2
fun -> 1
and -> 1
powerful -> 1 */
