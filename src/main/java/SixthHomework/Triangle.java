package SixthHomework;

public class Triangle {
    double side1, side2, side3;
    boolean isValid;

    public Triangle(double side1, double side2, double side3) {
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

    // მეთოდი პერიმეტრის გამოსათვლელად
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
