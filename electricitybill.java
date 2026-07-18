import java.util.Scanner;

public class electricitybill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill = 0;

        if (units <= 100) {
            bill = units * 15;
        }
        else if (units <= 300) {
            bill = (100 * 15) + ((units - 100) * 25);
        }
        else if (units <= 500) {
            bill = (100 * 15) + (200 * 25) + ((units - 300) * 35);
        }
        else {
            bill = (100 * 15) + (200 * 25) + (200 * 35) + ((units - 500) * 50);
        }

        System.out.println("Total Electricity Bill = PKR " + bill);

        sc.close();
    }
}

