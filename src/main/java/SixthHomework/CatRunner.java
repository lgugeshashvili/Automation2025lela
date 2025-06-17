package SixthHomework;

import java.util.Scanner;

public class CatRunner {
    public static void main(String[] args) {
        System.out.println("ამოცანა 1, დავალება 1");
        Cat cat= new Cat();
cat.meow();

        System.out.println("ამოცანა 1, დავალება 2");
        Scanner scanner= new Scanner(System.in);
        System.out.println("გთხოვთ შეიყვანეთ საკვების რაოდენობა გრამებში");
        int grami= scanner.nextInt();

        cat.eat(grami);


    }
}
