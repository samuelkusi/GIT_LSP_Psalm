package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        // Define the path to the input file
        String filePath = "src/org/howard/edu/lsp/assignment2/words.txt";

        // Read the file and count the words
        Map<String, Integer> wordCount = countWords(filePath);

        // Display the word count
        displayWordCount(wordCount);
    }

    private static Map<String, Integer> countWords(String filePath) {
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read each line from the file
            while ((line = br.readLine()) != null) {
                // Split the line into words using regex
                String[] words = line.split("\\s+");

                // Process each word
                for (String word : words) {
                    // Remove non-alphabetic characters and convert to lowercase
                    word = word.replaceAll("[^a-zA-Z']", "").toLowerCase();

                    // Check if the word is not trivial and not empty
                    if (word.length() > 3) {
                        // Update the word count
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordCount;
    }

    private static void displayWordCount(Map<String, Integer> wordCount) {
        // Display the word count
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
