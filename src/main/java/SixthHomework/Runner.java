package SixthHomework;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("ამოცანა 1");
        Cat cat= new Cat();
cat.meow();
cat.eat();


        Triangle t1 = new Triangle();
        System.out.println("პერიმეტრი: " + t1.getPerimeter());
        System.out.println("ფართობი: " + t1.getArea());


    }
}
