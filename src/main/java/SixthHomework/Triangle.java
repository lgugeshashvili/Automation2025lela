package SixthHomework;

import java.util.Scanner;

public class Triangle {
    double side1, side2, side3;
    boolean isValid;

    public Triangle() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("გთხოვთ შეიყვანეთ პირველი გვერდის სიგრძე");
        double side1= scanner.nextInt();
        System.out.println("გთხოვთ შეიყვანეთ მეორე გვერდის სიგრძე");
        double side2=scanner.nextInt();
        System.out.println("გთხოვთ შეიყვანეთ მესამე გვერდის სიგრძე");
        double side3=scanner.nextInt();

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.isValid = checkValidity();

    }
    private boolean checkValidity() {
        return side1 > 0 && side2 > 0 && side3 > 0 &&
                side1 + side2 > side3 &&
                side1 + side3 > side2 &&
                side2 + side3 > side1;
    }


    public double getPerimeter() {
        if (!isValid) {
            return -1;
        }
        return side1 + side2 + side3;
    }

    public boolean isValid() {
        return isValid;
    }


    public double getArea() {
        if (!isValid) {
            return -1;
        }
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

}
