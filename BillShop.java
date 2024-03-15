/*
 * The BillShop class is class to print the bill for the customer, 
 * should inherit from customer to print perfect bill.
 * @author Amaini 
 */

import java.util.Scanner;
import java.util.List;

public class BillShop extends Customer {

    Scanner input = new Scanner(System.in);
    //Class varible
    //total price
    private static int total;
    //
    private String cood;
    
    public BillShop(){
        
    }

    public BillShop(String cood){
        this.cood=cood;
        
    }

    /**
     * method for the menu if customer choose shop sevices
     *
     * @param g is a list to gather what customers choose
     */
    public void checkShop(List<Integer> g ,String n) {
        internalServices ii = new internalServices();//عشان الاسعار
        g.clear();
        Bill://عشان نوقف الشغل اذا ضغط صفر
        for (int i = 0; i <= 7; i++) {
            
            System.out.println("Choose from the sevices, If you want to stop, Enter 0: ");
            int customer = input.nextInt();

            switch (customer) {
                case 1:
                    System.out.print("Surgery, spaying process \n\n");
                    g.add(1);
                    total += ii.sterilizationProcess();
                    break;
                case 2:
                    System.out.print("Surgery, vaccine \n\n");
                    g.add(2);
                    total += ii.vaccine();
                    break;
                case 3:
                    System.out.print("Surgery, osteopathy \n\n");
                    g.add(3);
                    total += ii.osteopathy();
                    break;
                case 4:
                    System.out.print("Surgery, caesarean sections\n\n");
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
                    System.out.println("\nThe services for " + n + g);
                    System.out.print("End for cat "+n);                   
                    break Bill;
                default:
                    if (customer != 0 && customer != 1 && customer != 2 && customer != 3 && customer != 4
                            && customer != 5 && customer != 6 && customer != 7) {
                        System.out.println("Sorry, there is NO service with this number! \nTry agine with correct number\n\n");
                    }
                
            }
        }
    }

    /**
     * method toString ()
     *
     * @return the bill for the customer
     */
    @Override
    public String toString() {
            System.out.println("\n\nEnter your name ");
            String name = input.next();
            super.setName(name);

            System.out.println("\nEnter your phone number");
            String phoneNum = input.next();
            super.setPhone(phoneNum);
            
            BillShop cod = new BillShop("AB");
            System.out.println("\nEnter Cood if you have if you dont Enter: 'I dont have'\n ");
            String cd = input.next();
            BillShop ccod = new BillShop(cd);
            cod.equals(ccod);
            int num = (int)(10*Math.random() * 100);
          int num2=(int)(2*Math.random()*4);
            
            
            return"\n\n-------------------------"
                    + "\n--------Bill Shop--------"
                    + "\n-------------------------" 
                    + "\n          ID "+num
                    + "\nHours to finish: "+num2
                    + "\nName for customer: " + super.getName()
                    + "\nPhone number: " + super.getPhone()
                    + "\nTotal price: " + total + "RS"
                    + "\n-------------------------"
                    + "\n-------------------------"
                    + "\n------End of orderd------";
                    
    }
    
        public boolean equals(BillShop obj) {
       
       if (cood.equals(obj.cood) ){
            total-=30;}
        return false;  
        
    }



    public int getTotal(){
        return total;
    }


}
