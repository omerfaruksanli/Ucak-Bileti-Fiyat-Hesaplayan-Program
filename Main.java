import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int flightdistance, age, pick;
        double discount1 = 0.50, discount2 = 0.10, discount3 = 0.30, discount4 = 0.20, km = 0.10, price, total, discountTotal,discountTotal2;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the distance : ");
        flightdistance = input.nextInt();

        System.out.print("Please enter your age : ");
        age = input.nextInt();

        System.out.println("1 = One Direction\n2 = Round Trip");

        System.out.print("Please enter your travel type : ");
        pick = input.nextInt();

        total = flightdistance * km;


        if (pick == 1) {
            if (age < 12) {
                discountTotal = total * discount1;
                price = total - discountTotal;
                System.out.print("Your Price : " + price);
            } else if (age >= 12 && age <= 24) {
                discountTotal = total * discount2;
                price = total - discountTotal;
                System.out.print("Your Price : " + price);

            } else if (age >= 65) {
                discountTotal = total * discount3;
                price = total - discountTotal;
                System.out.print("Your Price : " + price);
            } else {
                price = total;
                System.out.print("Your Price : " +price );
            }

        } else if (pick == 2) {
            if (age < 12) {
                discountTotal = total * discount1;
                discountTotal2 = (total - discountTotal)*2;
                price = discountTotal - (discountTotal*discount4);
                System.out.print("Your Price : " + price);

            }else if (age >=12 && age <=24) {
                discountTotal = total * discount2;
                discountTotal2 = (total - discountTotal)*2;
                price = discountTotal - (discountTotal*discount4);
                System.out.print("Your Price : " + price);

            } else if (age >=65) {
                discountTotal = total * discount3;
                discountTotal2 = (total - discountTotal)*2;
                price = discountTotal - (discountTotal*discount4);
                System.out.print("Your Price : " + price);

            }else {
                price = total*2;
                price = price - (price*discount4);
                System.out.print("Your Price : "+ price) ;
            }


        }else{
            System.out.print("You entered incorrectly, Please Try Again !");
        }
    }
}