/*
 * The BillHome class is class to print the bill for the customer, 
 * should inherit from customer to print perfect bill.
 * @author Amaini 
 */

import java.util.Scanner;
import java.util.List;

public class BillHome extends Customer {

    Scanner input = new Scanner(System.in);
    //Class varible
    //total price
    private int total;
    private String n;


    

    /**
     * method for the menu if customer choose home sevices
     *
     * @param g is a list to gather what customers choose
     */
    public void checkHome(List<Integer> g, String n) {
        homeServices ii = new homeServices();
        g.clear();
        bill:
        for (int i = 0; i <= 7; i++) {
            
            System.out.println("Choose from the sevices, If you want to stop, Enter 0: ");
            int customer = input.nextInt();

            switch (customer) {
                case 1:
                    System.out.print("Surgery, Spaying process \n\n");
                    g.add(1);
                    total += ii.sterilizationProcess();
                    break;
                case 2:
                    System.out.print("Surgery, Vaccine \n\n");
                    g.add(2);
                    total += ii.vaccine();
                    break;
                case 3:
                    System.out.print("Surgery, Osteopathy \n\n");
                    g.add(3);
                    total += ii.osteopathy();
                    break;
                case 4:
                    System.out.print("Surgery, Caesarean sections\n\n");
                    g.add(4);
                    total += ii.obsterics();
                    break;
                case 5:
                    System.out.print("Wellness Care, Hair cleaning, brushing teeth\n\n");
                    g.add(5);
                    total += ii.HairnTeeth();
                    break;
                case 6:
                    System.out.print("Wellness Care, Cut nails\n\n");
                    g.add(6);
                    total += ii.CutNails();
                    break;
                case 7:
                    System.out.print("Wellness Care, Shaving the hair\n\n");
                    g.add(7);
                    total += ii.Shaving();
                    break;
                case 0:
                    System.out.println("\nThe services for " + n +" "+ g);
                    System.out.print("End for cat "+n+"."); 
                    break bill;
                default:
                    if (customer != 0 && customer != 1 && customer != 2 && customer != 3 && customer != 4
                            && customer != 5 && customer != 6 && customer != 7) {
                        System.out.println("Sorry, there is NO service with this number! \nTry agine with correct number\n\n");
                        break;
                    }
            }

        }
    }

    /**
     * method toString (name, Dr)
     *
     * @return the name of the customer and doctor
     */
    @Override
    public String toString() {
            System.out.println("\n\nEnter your name ");
            String name = input.next();
            super.setName(name);
          

            System.out.println("\nEnter your phone number");
            String phoneNum = input.next();
            super.setPhone(phoneNum);
            if (phoneNum == phoneNum)
                System.out.println("You have discount");

            Customer cus = new Customer(name, phoneNum);
            System.out.println("\nEnter your address ");
            String address = input.next();
            return "\n\n-------------------------"
                    + "\n--------Bill Home--------"
                    + "\n-------------------------"
                    + "\nName: " + super.getName()
                    + "\nPhone number: " + super.getPhone()
                    + "\naddress: " + address
                    + "\nTotal price: " + total + "RS"
                    + "\n-------------------------"
                    + "\n-------------------------";
            
    }

    public int getTotal(){
        return total;
    }

}
