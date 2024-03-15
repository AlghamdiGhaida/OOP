
import java.util.Scanner;
import java.util.ArrayList;
import Employees.Dr;
import Employees.Assistant;
import java.util.InputMismatchException;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> group = new ArrayList<>();
        internalServices test = new internalServices();
        homeServices test2 = new homeServices();
        BillShop shop = new BillShop();
        BillHome shop2 = new BillHome();
        int sum = 0;
        int Customer;

        
        System.out.println(
                "                WELCOME TO CAT CLINIC     "
                + "\nOur goal is to give them as many happy, healthy years with you as possible,"
                + "\nThe day your cat enters our clinic it becomes part of our family \n"
                + "\nOur services are available 6 days a week \n"
                + "From 8am to 10pm\n ");

        System.out.println("Now we will show you the team of the clinic");
        Dr[] dd = new Dr[4];
        dd[0] = new Dr("Doha", "Doctor", 7, 15000);
        dd[1] = new Dr("Ghaida", "Doctor", 7, 13000);
        dd[2] = new Dr("Hana", "Doctor", 7, 117000);
        dd[3] = new Dr("Mohammed", "Doctor", 7, 11000);
        Assistant[] aa = new Assistant[4];
        aa[0] = new Assistant("Ali", "Assistant", 7, 9000);
        aa[1] = new Assistant("Salleh", "Assistant", 7, 8800);
        aa[2] = new Assistant("Naif", "Assistant", 7, 8000);
        aa[3] = new Assistant("Zyiad", "Assistant", 7, 9500);
        dd[0].setH(8, 2);
        dd[1].setH(3, 10);
        dd[2].setH(8, 2);
        dd[3].setH(3, 10);
        aa[0].setH(8, 2);
        aa[1].setH(3, 10);
        aa[2].setH(8, 2);
        aa[3].setH(3, 10);
        for (int i = 0; i <= dd.length - 1; i++) {
            System.out.println("Name for dector " + (i + 1) + ": Dr." + dd[i].getName()
                    + "\tWorking hours from " + dd[i].getH() + "\tJob: " + dd[i].getJob());
        }
        for (int i = 0; i <= aa.length - 1; i++) {
            System.out.println("Name for assistant " + (i + 1) + ": " + aa[i].getName()
                    + "\tWorking hours from " + aa[i].getH() + "\tJob: " + aa[i].getJob());
        }

        System.out.println("\nNOTE We only accept 3 cats or less in HOME services\nThere is an extra value in HOME services");
        System.out.println("\n\nby visiting the clinic or we come to your home, so please enter: \n"
                + "1 If you want to have an appointment in the clinic\n"
                + "2 If you want us to visit you\n");
        try {
            Customer = input.nextInt();
            if (Customer == 3 || Customer == 4 || Customer == 5 || Customer == 6
                    || Customer == 7 || Customer == 8 || Customer == 9) {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("Try agine with correct number");
                    Customer = input.nextInt();
                    if (Customer == 1 || Customer == 2) {
                        break;
                    }
                }
            }
            System.out.println("\nEnter number of cats");
            int nOfCat = input.nextInt();

            for (int p = 1; p <= nOfCat; p++) {
                if (Customer == 1) {
                    System.out.println("\n\nName for cat " + p);
                    String n = input.next();
                    System.out.println("\nOur services include:"
                            + "\nSurgery\n1-Spaying process\t\t" + test.sterilizationProcess() + "RS"
                            + "\n2-Vaccine\t\t\t" + test.vaccine() + "RS"
                            + "\n3-Osteopathy\t\t\t" + test.osteopathy() + "RS"
                            + "\n4-Caesarean sections\t\t" + test.obsterics() + "RS"
                            + "\n\nWellness Care\n5-Hair cleaning, brushing teeth\t" + test.HairnTeeth() + "RS"
                            + "\n6-Cut nails\t\t\t" + test.CutNails() + "RS"
                            + "\n7-Shaving the hair\t\t" + test.Shaving() + "RS");
                    shop.checkShop(group, n);
                    if (nOfCat == p) {
                        System.out.println(shop.toString());
                    }

                } else if (Customer == 2) {
                    
                    if (nOfCat >= 4) {
                        System.out.println("we dont accept more than 3 cats in home services");
                        break;
                        
                    }
                    System.out.println("\n\nName for cat " + p);
                    String n = input.next();
                    System.out.println("\nOur services include:"
                            + "\nSurgery\n1-Spaying process\t\t" + test2.sterilizationProcess() + "RS"
                            + "\n2-Vaccine\t\t\t" + test2.vaccine() + "RS"
                            + "\n3-Osteopathy\t\t\t" + test2.osteopathy() + "RS"
                            + "\n4-Caesarean sections\t\t" + test2.obsterics() + "RS"
                            + "\n\nWellness Care\n5-Hair cleaning, brushing teeth\t" + test2.HairnTeeth() + "RS"
                            + "\n6-Cut nails\t\t\t" + test2.CutNails() + "RS"
                            + "\n7-Shaving the hair\t\t" + test2.Shaving() + "RS");
                    shop2.checkHome(group, n);
                    if (nOfCat == p) {
                        System.out.println(shop2.toString());
                    }

                } else {
                    System.out.println("ONLY NUMBER 1 OR 2");
                }

                sum += shop.getTotal();
                sum += shop2.getTotal();

            }
        } catch (InputMismatchException e) {
            System.out.println("Error, Wrong selection! Try again");

        } catch (Exception e) {
            System.out.println("ONLY NUMBER 1 OR 2");
        }

    }
}
