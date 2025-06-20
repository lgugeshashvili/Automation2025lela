package SeventhHomework;

import java.util.ArrayList;
import java.util.Scanner;

public class TextAnalyzer {

     ArrayList<String> sentences = new ArrayList<>();
     StringBuilder report = new StringBuilder();


    public void addText() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("გთხოვთ შეიყვანეთ ტექსტი: ");
        String text = scanner.nextLine();
        String[] parts = text.split("\\.");

        for (String part : parts) {
            part = part.trim();
            if (!part.isEmpty()) {
                sentences.add(part);
            }

        }
        System.out.println("თქვენ მიერ შეყვანილი ტექსტი შედგება წინადადებებისგან: ");
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }


    /// ////////////////////////////
    public String generateWordReport(int index) {
       report.setLength(0);

        if (index < 0 || index >= sentences.size()) {
            String msg = "წინადადება ვერ მოიძებნა: ინდექსი " + index;
            System.out.println(msg);
            return msg;
        }

        String sentence = sentences.get(index);
        String[] words = sentence.split("\\s+");

        int wordCount = words.length;

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        report.append("წინადადება N ").append(index).append(":\n");
        report.append("სიტყვების რაოდენობა: ").append(wordCount).append("\n");
        report.append("ყველაზე გრძელი სიტყვა: ").append(longestWord);

        return report.toString();
    }


    /// ///////////////
    public ArrayList<String> findWordsContaining(String pattern) {
        ArrayList<String> matchingSentences = new ArrayList<>();

        String lowerPattern = pattern.toLowerCase();
        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(lowerPattern)) {
                matchingSentences.add(sentence);
            }
        }

        if (matchingSentences.isEmpty()) {
            System.out.println("არ მოიძებნა წინადადება რომელიც შეიცავს: " + pattern);
        } else {
            System.out.println("წინადადებები, რომლებიც შეიცავს " + pattern + "-ს:");
            for (String s : matchingSentences) {
                System.out.println(s);
            }
        }

        return matchingSentences;
    }



}





