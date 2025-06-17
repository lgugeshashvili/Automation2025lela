package SixthHomework;

public class Cat {
    private String saxeli, jishi, sqesi;
    private int asaki;
    private int bitesize = 10; // ← გინდა თუ არა private ველი, ასე უნდა გამოაცხადო

    public void meow() {
        System.out.println("meowing...");
    }

    // eat მეთოდი, რომელიც აბრუნებს ლუკმების რაოდენობას
    public int eat(int grams) {
        int lukmebisRaodenoba = grams / bitesize;
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