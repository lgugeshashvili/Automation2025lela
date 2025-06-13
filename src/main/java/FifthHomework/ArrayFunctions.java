package FifthHomework;

import java.util.Scanner;

public class ArrayFunctions {
    public static void main(String[] args) {
        int[] array = {24, 13, 35, 63};

        int result = getElementByIndex(array, 2);
        System.out.println("ამოცანა 1");
        System.out.println("მითითებულ ინდექსზე მნიშვნელობა არის: " + result);
        int result2 = getElementByIndex(array, 5);
        System.out.println("მითითებულ ინდექსზე მნიშვნელობა არის: " + result2);
        System.out.println("__________________________");

//მეორე ამოცანის
        System.out.println("ამოცანა 2");
        int[] resultArray = createFillPrintAndReturnArray();
        System.out.println("__________________________");
//მესამე ამოცანის
        System.out.println("ამოცანა 3");
        int[] minMax = findMinMax(resultArray);
        System.out.println("__________________________");
    }

 //1: ელემენტის ინდექსით მიღება
 //**მიზანი:** ფუნქციის შექმნა, რომელიც მასივიდან ინდექსის მიხედვით დააბრუნებს ელემენტს.

    static int getElementByIndex(int[] array, int index) {
        if (array == null || index < 0 || index >= array.length) {
            return -1; // არასწორი ინდექსი

        }
        return array[index]; // სწორი ინდექსი
    }

    //ამოცანა 2: მასივის შევსება და min/max პოვნა
    //**მიზანი:** სამი ფუნქციის შექმნა - ერთი მასივის შევსებისთვის, მეორე min/max
    // ელემენტების პოვნისთვის, მესამე შედეგების დასაბრუნებლად.


     static int[] createFillPrintAndReturnArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიყვანეთ მასივის ზომა:  ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        // შევსება
        for (int i = 0; i < size; i++) {
            System.out.println("შეიყვანეთ ელემენტი ინდექსზე " + i + ":");
            array[i] = scanner.nextInt();
        }

        // დაბეჭდვა
        System.out.println("მასივის ელემენტებია:");
        for (int i = 0; i < size; i++) {
            System.out.println( array[i]);
        }
        return array;
    }

    public static int[] findMinMax(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int num : array) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("მინიმუმი: " + min);
        System.out.println("მაქსიმუმი: " + max);

        // აბრუნებს მასივს [min, max]
        return new int[]{min, max};
    }


    }







