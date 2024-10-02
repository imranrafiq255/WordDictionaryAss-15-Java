import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Dictionary {
    private static HashMap<String, List<String>> dictionary = new HashMap<>();
    private Scanner scan;

    public Dictionary() {
        scan = new Scanner(System.in);
    }

    public void addWordWithSynonyms() {
        System.out.println("Enter word:");
        String word = scan.next();

        List<String> synonyms = new ArrayList<>();
        int addMore = 1;
        do {
            System.out.println("Enter synonym for " + word + ":");
            String synonym = scan.next();
            synonyms.add(synonym);
            System.out.println("Enter 1 to add more, or any other number to quit:");
            addMore = scan.nextInt();
        } while (addMore == 1);

        dictionary.put(word, synonyms);
        System.out.println(word + " is added successfully.");
    }

    public void searchWord() {
        if (dictionary.isEmpty()) {
            System.out.println("Dictionary is empty.");
            return;
        }
        System.out.println("Enter word to search:");
        String word = scan.next();

        if (!dictionary.containsKey(word)) {
            System.out.println(word + " not found.");
            return;
        }

        System.out.println("The word is: " + word);
        System.out.println("Synonyms:");
        List<String> synonyms = dictionary.get(word);
        for (int i = 0; i < synonyms.size(); i++) {
            System.out.println((i + 1) + ". " + synonyms.get(i));
        }
    }

    public void deleteWord() {
        if (dictionary.isEmpty()) {
            System.out.println("Dictionary is empty.");
            return;
        }
        System.out.println("Enter word to delete:");
        String word = scan.next();

        List<String> removedSynonyms = dictionary.remove(word);
        if (removedSynonyms == null) {
            System.out.println(word + " not found.");
        } else {
            System.out.println(word + " is deleted successfully.");
        }
    }

    public void updateWord() {
        if (dictionary.isEmpty()) {
            System.out.println("Dictionary is empty.");
            return;
        }
        System.out.println("Enter word to update:");
        String updatingWord = scan.next();

        if (!dictionary.containsKey(updatingWord)) {
            System.out.println(updatingWord + " not found.");
            return;
        }

        List<String> synonyms = dictionary.get(updatingWord);
        int addMore = 1;
        do {
            System.out.println("Enter synonym for " + updatingWord + ":");
            String synonym = scan.next();
            synonyms.add(synonym);
            System.out.println("Enter 1 to add more, or any other number to quit:");
            addMore = scan.nextInt();
        } while (addMore == 1);

        dictionary.put(updatingWord, synonyms);
        System.out.println(updatingWord + " is updated successfully.");
    }
}
