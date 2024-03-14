package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
    public static String encrypt(String text) {
        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();

        // Iterate through the characters of the input text
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // Check if the character is a letter or digit
            if (Character.isLetterOrDigit(c)) {
                // Append even-index characters to evenChars StringBuilder
                if (i % 2 == 0) {
                    evenChars.append(c);
                } else {
                    // Append odd-index characters to oddChars StringBuilder
                    oddChars.append(c);
                }
            }
        }

        // Combine even and odd characters and return the result
        return evenChars.toString() + oddChars.toString();
    }
}

