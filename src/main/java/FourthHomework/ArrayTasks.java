package FourthHomework;


import java.util.Scanner;

public class ArrayTasks {
    public static void main(String[] args) {


        System.out.println("ამოცანა 1");
/* ა) მომხმარებელს მოსთხოვეთ შეიტანოს მასივის ზომა
ბ) შექმენით ამ ზომის მასივი(სთრინგის)
გ) მომხმარებელმა ყველა ცარიელი ინდექსები უნდა შეავსოს(scanner, იმ შემთხვევაში თუ მომხმარებელი enter-ს დააწვება
 როცა input ცარიელია default-ად გააგზავნოს "-" ქერექტერი)
დ) მასივი გადაავსეთ შემოტანილი ინფორმაციით
 */
        System.out.println("შეიყვანეთ მასივის ზომა: ");
        Scanner scanner= new Scanner(System.in);
        int massivesize= scanner.nextInt();
        scanner.nextLine();

        String[] mas=new String[massivesize];
        System.out.println("შეიყვანეთ მნიშვნელობები მასივის შესავსებად: ");
        for (int i=0; i<massivesize; i++){
            String value=scanner.nextLine();
            if(value.isEmpty()){
                mas[i]="-";
            } else mas[i]=value;
        }
        System.out.println("მასივის ელემენტებია:");
        for (String value : mas) {
            System.out.println(value);
        }

        System.out.println("ამოცანა 2");
        /* ა) მომხმარებელს მოსთხოვეთ მასივის ზომა
ბ) შექმენით int ტიპის მასივი
გ) შეავსეთ მასივი მომხმარებლის შემოტანილი(scanner) რიცხვებით
დ) გამოთვალეთ ყველა ელემენტის ნამრავლი
  */

        System.out.println("შეიყვანეთ მეორე მასივის ზომა: ");
        int mas2size= scanner.nextInt();
        int[] mas2= new int[mas2size];
        System.out.println("მასივის ზომა არის "+mas2size);
        int namravli=1;
        System.out.println("შეიყვანეთ რიცხვითი მნიშვნელობები: ");
        for(int i=0; i<mas2size; i++){
            int value2= scanner.nextInt();
            mas2[i]=value2;
            namravli=namravli*value2;
        }
        System.out.println("მნიშვნელობების ნამრავლი =  "+namravli);


        System.out.println("ამოცანა 3");
      /*  ა) მომხმარებელს მოსთხოვეთ მასივის ზომა
        ბ) შექმენით String ტიპის მასივი
        გ) შეავსეთ მასივი მომხმარებლის შემოტანილი მონაცემებით(scanner)
        დ) იპოვეთ ყველა უნიკალური ელემენტი (რომელიც მხოლოდ ერთხელ გვხდება) */


        System.out.print("შეიყვანეთ მესამე მასივის ზომა: ");
        int mas3size = scanner.nextInt();
        scanner.nextLine(); // ← აუცილებელია, რადგან შემდეგში nextLine() ვიყენებთ

        String[] mas3 = new String[mas3size];

        System.out.println("შეიყვანეთ მასივის ელემენტები:");

        for (int i = 0; i < mas3size; i++) {
            mas3[i] = scanner.nextLine();
        }

        System.out.println("უნიკალური ელემენტები:");

        for (int i = 0; i < mas3.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < mas3.length; j++) {
                if (i != j && mas3[i].equals(mas3[j])) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(mas3[i]);
            }
        }


        System.out.println("ამოცანა 4");
        /* ა) მომხმარებელს მოსთხოვეთ მატრიცის განზომილებები (მწკრივები და სვეტები)
ბ) შექმენით ორგანზომილებიანი int მასივი
გ) შეავსეთ მასივი მომხმარებლის შემოტანილი რიცხვებით(scanner)
დ) დაბეჭდეთ მატრიცის სახით (მწკრივ-მწკრივად)
  */

        System.out.println("მიუთითე მწკრივების რაოდენობა: ");
        int mwkrivi=scanner.nextInt();
        System.out.println("მიუთითე სვეტების რაოდენობა");
        int sveti=scanner.nextInt();

        int[][] mas4=new int[mwkrivi][sveti];

        System.out.println("შეიყვანეთ მატრიცის ელემენტები:");
        for (int i = 0; i < mwkrivi; i++) {
            for (int j = 0; j < sveti; j++) {
                System.out.print("მატრიცა [" + i + "][" + j + "] = ");
                mas4[i][j] = scanner.nextInt();
            }
        }
        System.out.println("შეყვანილი მნიშვნელობები :");
        for (int i = 0; i < mwkrivi; i++) {
            for (int j = 0; j < sveti; j++) {
                System.out.print(mas4[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("ამოცანა 5");
 /*   ა) შექმენით 7x7 ზომის int მასივი
        ბ) ინიციალიზაცია გაუკეთეთ შემდეგი შაბლონით:

        0 1 1 1 1 1 1

        0 0 1 1 1 1 1

        0 0 0 1 1 1 1

        0 0 0 0 1 1 1

        0 0 0 0 0 1 1

        0 0 0 0 0 0 1

        0 0 0 0 0 0 0

        გ) შექმენით ალგორითმი, რომელიც გადააქცევს მას საპირისპირო ვერსიად
*/
        int[][] matrix = new int[7][7]; //
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j > i) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println("საწყისი მატრიცა:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

               for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j < i) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }


        System.out.println("საპირისპირო მატრიცა:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }




    }
}
