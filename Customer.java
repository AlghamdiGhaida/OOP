/*
 * The Customer class is a class for the customer 
 *to fill in the information and have an appointment
 *@author Amaini 
 */

public class Customer {

    // Class variable
    //Name of the customer
    private String name;
    // Number phone 
    private String phoneNumber;
    //Number of cats
    private int NumOfCats;
    //total price
    private int total;

    /**
     * Default constructs
     */
    public Customer() {

    }

    /**
     * Constructs and initializes a customer on position(name, phonenum)
     *
     * @param name
     * @param phoneNum
     */
    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Constructs and initializes a customer on position(name,phonenum,
     * numOfCats)
     *
     * @param name
     * @param phoneNum
     * @param NumOfCats
     */
    public Customer(String name, String phoneNum, int NumOfCats) {
        this.name = name;
        this.phoneNumber = phoneNum;
        this.NumOfCats = NumOfCats;
    }

    /**
     * Mutator method to change the customer name
     *
     * @param n name of customer
     */
    public void setName(String n) {
        this.name = n;
    }

    /**
     * Mutator method to change customer's mobile number
     *
     * @param ph phone number
     */
    public void setPhone(String ph) {
        this.phoneNumber = ph;
    }

    /**
     * Mutator method to change cat number
     *
     * @param NumC mean number of cats
     */
    public void setNumberOfCats(int NumC) {
        NumOfCats = NumC;
    }

    /**
     * Accessor method to return the name of the customer
     *
     * @return name of customer
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor method to return phone number
     *
     * @return phone number
     */
    public String getPhone() {
        return phoneNumber;
    }

    /**
     * Accessor method to return the number of cats
     *
     * @return number of cats
     */
    public int getNumOfCat() {
        return NumOfCats;
    }

    /**
     * method toString
     *
     * @return the name of customer, number phone and number of cats
     */
    public String toString() {
        return "\nName: " + name + "\nphoneNumber: " + phoneNumber + "\nnumberofCats: " + NumOfCats;
    }

}
