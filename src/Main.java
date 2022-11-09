import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group?");
            int totalPeople = scan.nextInt();
        System.out.println("What's the total tip percent 0-100?");
            int tipPercent = scan.nextInt();
        System.out.println("Enter the cost of each item in dollars and cents. Enter -1 when finished entering items.");
        double billBeforeTip = scan.nextDouble();
        boolean running = true;

        while (running){
            System.out.println("Enter the cost of another item in dollars and cents.");
            double temp = scan.nextDouble();
            if(temp == -1){
                running = false;
            }
             billBeforeTip = billBeforeTip + temp ;

        }
            billBeforeTip ++;


        double totalTip =  tipPercent/100.0 * billBeforeTip;
        double totalBill =  billBeforeTip + totalTip;
        double tipPerPerson = totalTip / totalPeople;
        double costPerPerson = billBeforeTip / totalPeople;
        double totalPerPerson = costPerPerson + tipPerPerson;

        System.out.println("Total bill before tip: " + formatter.format(billBeforeTip));
        System.out.println("Tip percentage: " + tipPercent);
        System.out.println("Total tip: " + formatter.format(totalTip) );
        System.out.println("Total bill with tip: " + formatter.format(totalBill));
        System.out.println("Total tip per person: " + formatter.format((totalTip / totalPeople)));
        System.out.println("Total cost per person before tip: " + formatter.format(costPerPerson));
        System.out.println("Total per person: " + formatter.format(totalPerPerson));



        scan.close();
    }


}