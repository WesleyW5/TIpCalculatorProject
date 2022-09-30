import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group?");
            int totalPeople = scan.nextInt();
        System.out.println("What's the total tip percent 0-100?");
            int tipPercent = scan.nextInt();
        System.out.println("Enter the cost of each item in dollars and cents. Enter -1 when finished entering items.");
        double billBeforeTip = scan.nextDouble();
        while (billBeforeTip != -1 ){
            System.out.println("Enter the cost of another item in dollars and cents.");
             billBeforeTip = billBeforeTip + scan.nextDouble();
        }
        double totalTip = (100-tipPercent)/100 * billBeforeTip;
        double totalBill = totalTip + billBeforeTip;
        double tipPerPerson = Math.round(totalTip/totalPeople * 100) / 100;
        double costPerPerson = Math.round(billBeforeTip/totalPeople * 100) / 100;
        double totalPerPerson = tipPerPerson + costPerPerson;

        System.out.println("Total bill before tip: " + billBeforeTip);
        System.out.println("Tip percentage: " + tipPercent);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total bill with tip: " + totalBill);
        System.out.println("Total tip per person" + tipPerPerson);
        System.out.println("Total cost per person before tip: " + costPerPerson);
        System.out.println("Total per person: " + totalPerPerson);



        scan.close();
    }
}