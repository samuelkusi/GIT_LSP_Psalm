package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
    /**
     * Encrypts a string by rearranging characters to even-indexed followed by odd-indexed, ignoring punctuation and whitespace.
     * 
     * @param text The string to be encrypted.
     * @return The encrypted string.
     */
    public static String encrypt(String text) {
        // Remove all spaces from the input string
        String textWithoutSpaces = text.replaceAll("\\s+", "");

        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();

        // Loop through each character in the input string without spaces
        for (int i = 0; i < textWithoutSpaces.length(); i++) {
            char c = textWithoutSpaces.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                if (i % 2 == 0) {
                    evenChars.append(c);
                } else {
                    oddChars.append(c);
                }
            }
        }

        // Combine even and odd characters to form the encrypted string
        return evenChars.toString() + oddChars.toString();
    }
}
