import java.io.*;

public class Pr26 {
    public static void main(String[] args) {

        int charCount = 0, wordCount = 0, lineCount = 0;

        try {
            // Check if filename is provided
            if (args.length < 1) {
                System.out.println("Please provide file name as command-line argument.");
                return;
            }

            File file = new File(args[0]);

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                lineCount++;

                // Count characters (excluding newline)
                charCount += line.length();

                // Count words (split by whitespace)
                String[] words = line.trim().split("\\s+");

                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }
            }

            br.close();

            // Display results
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
/*output 
  Hello world
Java programming is fun
Lines: 2
Words: 6 
Characters: 36 */
