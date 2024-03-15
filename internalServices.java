
/**
 * The internal services class is a class that Offers services we can offer it
 * to the customers in the clinic, should inherit from veterinaryAndCare class.
 */
public class internalServices extends veterinaryAndCare {

    // Class variable
    //The time it takes to complete the process
    protected int hours;

    /**
     * Mutator method to set hours number
     *
     * @param hours
     */
    public void setHours(int hours) {
        this.hours = hours;
    }


    /**
     * Accessor method to return the time it takes to complete the process
     *
     * @return number of hours
     */
    public int getHours() {
        return hours;
    }


    /**
     * method toString
     *
     * @return the time it takes to complete the process and number ID
     */


    @Override
    public int sterilizationProcess() {
        return 300;
    }

    @Override
    public int vaccine() {
        return 40;
    }

    @Override
    public int osteopathy() {
        return 20;
    }

    @Override
    public int obsterics() {
        return 300;
    }

    @Override
    public int HairnTeeth() {
        return 40;
    }

    @Override
    public int CutNails() {
        return 10;
    }

    @Override
    public int Shaving() {
        return 40;
    }
    
    
    /**
     * method toString
     *
     * @return hours and ID
     */
    @Override
    public String toString() {
        return "InternalServices{" + "hours= " + hours;
    }

    

}
