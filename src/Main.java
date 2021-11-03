import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        wordSet();

    }

    public static void wordSet() {
        Random random = new Random();

        String[] wordArr = new String[] {"apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int index = random.nextInt(wordArr.length);
        String word = wordArr[index];
        System.out.println("Загаданное слово - " + word);


        String answerWord;
        Scanner scanner = new Scanner(System.in);
        do {
            answerWord = scanner.nextLine();
            if (answerWord.equals(word)) {
                System.out.println("Верно!");
            }
            else {
                System.out.println("Попробуйте еще раз");
            }
        } while (answerWord.equals(word));

    }
}
