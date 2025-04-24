import java.text.NumberFormat;
import java.util.Scanner;

//        Calculator 3: A calculator that determines the present value of an
//        ordinary annuity. (Note: this is difficult)

public class Main {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Monthly Payout (no commas) ($): ");
        double monthlyPayout = input.nextDouble();

        System.out.print("Enter Expected Interest Rate (e.x 7.65): ");
        double interestRate = input.nextDouble() / 100;

        System.out.print("Enter Years to Pay Out: ");
        int years = input.nextInt();

        double monthlyInterestRate = interestRate / 12;
        int months = years * 12;

        double pv = monthlyPayout * (1 - Math.pow(1 + monthlyInterestRate, -months)) / monthlyInterestRate;

        System.out.println("Present Value: \n" + currency.format(pv));

//        Example: To fund an annuity that pays $3,000 monthly for 20
//        years and earns an expected 2.5% interest, you would need to
//        invest $566,141.46 today.

    }
}