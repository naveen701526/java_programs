import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner principal = new Scanner(System.in);
        System.out.print("Principal: ");
        int principalCost = principal.nextInt();
        System.out.print("Annual Interest Rate: ");
        Scanner annualInterest = new Scanner(System.in);
        double monthlyInterest = annualInterest.nextDouble()/1200;
        Scanner period = new Scanner(System.in);
        System.out.print("Period (Years): ");
        int duration = period.nextInt()*12;
        double mortgage = principalCost * ((monthlyInterest * Math.pow(1+monthlyInterest,duration))/(Math.pow(1+monthlyInterest,duration)-1));

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Mortgage: " + currency.format(mortgage));



    }
}
