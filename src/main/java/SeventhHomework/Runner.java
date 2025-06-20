package SeventhHomework;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        TextAnalyzer analyzer = new TextAnalyzer(); // ობიექტის შექმნა
        Scanner scanner = new Scanner(System.in);
        analyzer.addText();

        ///
        System.out.println("შეიყვანეთ წინადადების ინდექსი რეპორტისთვის (დაწყებული 0-დან): ");
        int index = scanner.nextInt();
        scanner.nextLine();

        String report = analyzer.generateWordReport(index);
        System.out.println("რეპორტი:");
        System.out.println(report);
///
        System.out.print("შეიყვანეთ საძიებო სიტყვა: ");
        String word = scanner.nextLine();
        analyzer.findWordsContaining(word);
    }
}