package SixthHomework;

import java.util.Scanner;

public class Cat {
    private String saxeli, jishi, sqesi;
    private int asaki;
    private int bitesize = 10; //
    public void meow() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("გთხოვთ შეიყვანეთ კატის სახელი:");
        String name = scanner.nextLine();
        System.out.println("კატის სახელი: " + name);
        System.out.println(name+"-ს ხმა:   meowing...");
    }


    public int eat() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("გთხოვთ შეიყვანეთ საკვების რაოდენობა გრამებში");
        int grams= scanner.nextInt();

        int lukmebisRaodenoba = grams / bitesize;
        System.out.println("კატა ჭამს  "+grams+" გრამს, რაც არის "+(lukmebisRaodenoba+1)+" ლუკმა");
        for (int i = 0; i <= lukmebisRaodenoba; i++) {
            System.out.println("eating...");
        }
        return lukmebisRaodenoba;

    }

    // Setter-ები
    public void setSaxeli(String saxeli) {
        this.saxeli = saxeli;
    }

    public void setJishi(String jishi) {
        this.jishi = jishi;
    }

    public void setSqesi(String sqesi) {
        this.sqesi = sqesi;
    }

    // Getter-ები
    public String getSaxeli() {
        return this.saxeli;
    }

    public String getJishi() {
        return this.jishi;
    }

    public String getSqesi() {
        return this.sqesi;
    }
}