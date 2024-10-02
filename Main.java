import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("Enter 0 to exit");
            System.out.println("Enter 1 to add words");
            System.out.println("Enter 2 to find word with synonyms");
            System.out.println("Enter 3 to delete word");
            System.out.println("Enter 4 to update word");
            System.out.println("Choose your option");
            option = scanner.nextInt();
            switch (option){
                case 0:
                    break;
                case 1:
                    dictionary.addWordWithSynonyms();
                    break;
                case 2:
                    dictionary.searchWord();
                    break;
                case 3:
                    dictionary.deleteWord();
                    break;
                case 4:
                    dictionary.updateWord();
                    break;
                default:
                    System.out.println("invalid option");
                    break;
            }
        }while(option != 0);
    }
}
