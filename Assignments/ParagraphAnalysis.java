import java.util.Scanner;
import java.util.HashMap;

class ParagraphAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        String[] words = paragraph.split(" ");

        System.out.println("\n----- Separated Words -----");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("\nTotal Number of Words: " + words.length);

        String longest = words[0];
        String shortest = words[0];

        int totalCharacters = 0;

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {

            totalCharacters += word.length();

            if (word.length() > longest.length()) {
                longest = word;
            }

            if (word.length() < shortest.length()) {
                shortest = word;
            }

            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1);
            } else {
                frequency.put(word, 1);
            }
        }

        double average = (double) totalCharacters / words.length;

        System.out.println("\nLongest Word: " + longest);
        System.out.println("Shortest Word: " + shortest);
        System.out.println("Average Word Length: " + average);

        System.out.println("\n----- Words in Uppercase -----");
        for (String word : words) {
            System.out.println(word.toUpperCase());
        }

        System.out.println("\n----- Words in Lowercase -----");
        for (String word : words) {
            System.out.println(word.toLowerCase());
        }

        System.out.println("\n----- Word Frequency -----");
        for (String word : frequency.keySet()) {
            System.out.println(word + " : " + frequency.get(word));
        }

        System.out.println("\n----- Unique Words -----");
        for (String word : frequency.keySet()) {
            System.out.println(word);
        }

        sc.close();
    }
}