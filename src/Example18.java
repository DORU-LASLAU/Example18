import java.util.Scanner;
public class Example18 {
    public static void main(String[] argv) {
        double pricePerHour, numberOfHours, grossPay, taxes, netPay;

        Scanner inputValue = new Scanner(System.in);

        System.out.println("Enter number of hours:");
        numberOfHours = inputValue.nextDouble();

        System.out.println("Enter price per hour:");
        pricePerHour = inputValue.nextDouble();

        if (numberOfHours > 35) {
            grossPay = (35 * pricePerHour) + (numberOfHours - 35) * (pricePerHour*1.5);
        } else {
            grossPay = numberOfHours * pricePerHour;
        }
        System.out.println("Gross salary:"+grossPay);

        if (grossPay>500) {
            if (grossPay>900) {
                taxes = 400*0.25 + (grossPay-900)*0.45;
            } else {
                taxes=(grossPay-500)*0.25;
            }
        } else {
            taxes=0;
        }

        netPay=grossPay-taxes;
        System.out.println("Taxes are:"+taxes);
        System.out.println("Net pay is:"+netPay);
    }
}
