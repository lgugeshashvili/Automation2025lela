package ThirdHomework;

import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args) {

       //პროგრამის შექმნა, რომელიც განსაზღვრავს შეტანილი რიცხვი ლუწია თუ კენტი.
        System.out.println("დავალება 1");
        Scanner scanner= new Scanner(System.in);
        System.out.println("შეიყვანე რიცხვითი მნიშვნელობა: ");
        int number= scanner.nextInt();
       if (number%2==0&&number!=0){
           System.out.println("შენ მიერ შეყვანილი რიცხვია: "+number+", ეს რიცხვი ლუწია");
       } else if (number%2==1) {
           System.out.println("შენ მიერ შეყვანილი რიცხვია: "+number+", ეს რიცხვი კენტია");
       } else System.out.println("შენ მიერ შეყვანილი რიცხვია: "+number+", ეს რიცხვი არც კენტია და არც ლუწი");


       //სამკუთხედის ვალიდაცია
        System.out.println("ამოცანა 2");
        System.out.println("შეიყვანე პირველი გვერდის სიგრძე: ");
        int gverdi1= scanner.nextInt();
        System.out.println("შეიყვანე მეორე გვერდის სიგრძე: ");
        int gverdi2= scanner.nextInt();
        System.out.println("შეიყვანე მესამე გვერდის სიგრძე: ");
        int gverdi3= scanner.nextInt();
        if((gverdi1+gverdi2)>gverdi3||(gverdi1+gverdi3)>gverdi2||(gverdi2+gverdi3)>gverdi1){
            System.out.println("ამ მონაცემებით შესაძლებელია სამკუთხედის აგება");
        } else System.out.println("ამ მონაცემებით არ არის შესაძლებელი სამკუთხედის აგება");



        //ჩინური კალენდარი
        System.out.println("ამოცანა 3");
        System.out.println("შეიყვანე შენი დაბადების წელი: ");
        int birthyear=scanner.nextInt();
        int startdate=1900;
        int chinesezociac=(birthyear-startdate)%12;
       switch (chinesezociac){
           case 0:
               System.out.println("ვირთხა");
               break;
           case 1:
               System.out.println("ხარი");
               break;
           case 2:
               System.out.println("ვეფხვი");
               break;
           case 3:
               System.out.println("კურდღელი");
               break;
           case 4:
               System.out.println("დრაკონი");
               break;
           case 5:
               System.out.println("გველი");
               break;
           case 6:
               System.out.println("ცხენი");
               break;
           case 7:
               System.out.println("თხა");
               break;
           case 8:
               System.out.println("მაიმუნი");
               break;
           case 9:
               System.out.println("მამალი");
               break;
           case 10:
               System.out.println("ძაღლი");
               break;
           case 11:
               System.out.println("ღორი");
               break;

       }



        //რიცხვების ჯამი
        System.out.println("ამოცანა 4");
        int sum=0;
        for(int i=0; i<11; i++){
            sum=sum+i;
        }
        System.out.println("0-დან 10-მდე რიცხვების ჯამია: "+sum);


        //რიცხვების კუბები
        System.out.println("ამოცანა 5");
        System.out.println("შეიყვანე რიცხვი: ");
                int numberForCube=scanner.nextInt();
for(int i=1; i<numberForCube; i++){
    int cube=i*i*i;
    System.out.println(i+"^3="+cube);
}

        //ორობითში გადაყვანა
        System.out.println("ამოცანა 6");
        System.out.print("შეიყვანე მთელი რიცხვი: ");
        int numb = scanner.nextInt();  // მომხმარებლის მიერ შეყვანილი რიცხვი

        String binary = "";              //  შეინახავს საბოლოო ორობით შედეგს

        int temp = numb;              // ვქმნით ცვლადს დროებითი მუშაობისთვის

        // თუ რიცხვი 0-ია, პირდაპირ ვწერთ
        if (temp == 0) {
            binary = "0";
        } else {
            // ვაკეთებთ გაყოფას 2-ზე სანამ temp არ გახდება 0
            while (temp > 0) {
                int remainder = temp % 2;          // ნაშთი — იქნება 0 ან 1
                binary = remainder + binary;       // ნაშთს ვამატებთ სტრინგის თავში
                temp = temp / 2;                   // ვაგრძელებთ გაყოფას
            }
        }

        System.out.println("ორობითი ფორმა: " + binary);
    }
}


