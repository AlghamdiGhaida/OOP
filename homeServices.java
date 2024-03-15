/*
 * The home services class is a class that Offers services 
 we can go to the customer's home and work on them, should inherit 
 from veterinaryAndCare class.
 */

public class homeServices extends veterinaryAndCare {

    // Class variable
    //The address so we can go and work on the right location
    private String address;
   

    /**
     * Default constructor
     */
    public homeServices() {
        this.address = address;
    }

   
    /**
     * Constructor
     *     * @param address we will go to
     */
    public homeServices( String address) {
        this.address = address;
    }


    /**
     * Mutator method to set the address
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Accessor method to return the address
     *
     * @return
     */
    public String getAddress() {
        return address;
    }


    
    @Override
    public int sterilizationProcess() {
        return 350;
    }

    @Override
    public int vaccine() {
        return 70;
    }

    @Override
    public int osteopathy() {
        return 40;
    }

    @Override
    public int obsterics() {
        return 350;
    }

    @Override
    public int HairnTeeth() {
        return 70;
    }

    @Override
    public int CutNails() {
        return 40;
    }

    @Override
    public int Shaving() {
        return 80;
    }

    /**
     * method toString
     *
     * @return the address
     */
    @Override
    public String toString() {
        return "\naddress=" + address ;
    }

}
