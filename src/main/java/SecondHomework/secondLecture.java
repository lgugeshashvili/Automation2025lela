package SecondHomework;

public class secondLecture {
    public static void main(String[] args) {
//ამოცანა 1; პირველი ვარიანტი, დამატებული ცვლადით
        System.out.println("ამოცანა 1:");
int a=5, b=7, c;
        System.out.println("პირველი ვარიანტი ცვლილებამდე a="+a+" b="+b);
c=a; // 5
a=b; // 7
b=c; // 5

        System.out.println("პირველი ვარიანტი ცვლილების შემდეგ a="+a+" b="+b);


//ამოცანა 1;  მეორე ვარიანტი, დამატებული ცვლადის გარეშე

        int x=8, y=9;
        System.out.println("მეორე ვარიანტი ცვლილებამდე x="+x+" y="+y);
x=x+y; //8+9=17
y=x-y; //17-9=8
x=x-y; //17-8=9
        System.out.println("მეორე ვარიანტი ცვლილების შემდეგ x="+x+" y="+y);

        System.out.println("ამოცანა 2:");
//ამოცანა 2; წელი ნაკიანია, თუ ის იყოფა 4-ზე და არ იყოფა 100-ზე, გარდა იმ შემთხვევისა, როცა ის იყოფა 400-ზე.
        int year=2025;

        boolean answer=(year%4==0&&year%100!=0)||(year%400==0);
        System.out.println("2025 წელი ნაკიანია? "+answer);

        System.out.println("ამოცანა 3:");
//ამოცანა 3; OR ოპერაციები


        boolean P = true;
        System.out.println("P | P = " + (P | P));
        System.out.println("P | false = " + (P | false));
        System.out.println("P | true = " + (P | true));
        System.out.println("P | !P = " + (P | !P));

//ამოცანა 3, AND ოპერაციები
        System.out.println("P & P = " + (P & P));
        System.out.println("P & false = " + (P & false));
        System.out.println("P & true = " + (P & true));
        System.out.println("P & !P = " + (P & !P));

        //ამოცანა 3, შერეული ოპერაციები

        System.out.println("P & P | false = " + ((P & P) | false));
        System.out.println("P & P | true = " + ((P & P) | true));
        System.out.println("P | P & true = " + (P | (P & true)));
        System.out.println("P | P & false = " + (P | (P & false)));


        System.out.println("ამოცანა 4");
       /*      ამოცანა 4, პირობები:
          1.   `A1 > B1 > C1`
          2.   `A1 < B1 < C1`
          3. `A1 > B1 && C1 > (A1 + B1)`     */


int A1=3, B1=2, C1=1;
    //1. **პირველი ეტაპი:** A, B, C-ის თავდაპირველი მნიშვნელობებით შედარება
        System.out.println("ცვლილებამდე A1="+A1+", B1="+B1+", C1="+C1);
        System.out.println("Logic1=A1>B1  "+(A1>B1)+", Logic2=B1>C1  "+(B1>C1)+", Logic3=A1>C1  "+(A1>C1));

       // 2. **მეორე ეტაპი:** მნიშვნელობების გაცვლა

      A1=A1+C1;  //3+1=4
      C1=A1-C1;  //4-1=3
        A1=A1-C1; //4-3=1

        System.out.println("ცვლილების შემდეგ A1="+A1+", B1="+B1+", C1="+C1);
//
        System.out.println("Logic1=A1<B1  "+(A1<B1)+", Logic2=B1<C1  "+(B1<C1)+", Logic3=A1<C1  "+(A1<C1));




    }
}
