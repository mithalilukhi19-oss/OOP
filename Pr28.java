import java.io.*;

public class Pr28 {
    public static void main(String[] args) {

        int lineCount = 0, wordCount = 0, charCount = 0;

        BufferedReader br = null;

        try {
            // Open file
            br = new BufferedReader(new FileReader("data.txt"));

            String line;

            // Read line by line
            while ((line = br.readLine()) != null) {
                lineCount++;

                // Count words
                String[] words = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }

                // Count characters (excluding spaces)
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ') {
                        charCount++;
                    }
                }
            }

            // Display results
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces & newline): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");

        } catch (IOException e) {
            System.out.println("Error reading file.");

        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }

            System.out.println("Process completed.");
        }
    }
}
/* output 
 Hello world
 Java is easy 

Total Lines: 2
Total Words: 5
Total Characters (excluding spaces & newline): 21
Process completed. */

    
              
