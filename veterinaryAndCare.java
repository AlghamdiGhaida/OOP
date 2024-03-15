/*
 * The veterinaryAndCare class is an abstract class that shows offer 
 for all veterinary and care services.
 */

public abstract class veterinaryAndCare {
    

    // Class variable
//ُTo choose spaying process
    private int sprocess;
    //ُُُTo choose vaccine
    private int vaccine;
    //ُTo choose osteopathy
    private int osteopathy;
    //ُTo choose Caesarean sections
    private int CaesareanSections;
    // To choose hair and teeth cleaning
    private int HairnTeeth;
    //To choose cut nails 
    private int CutNails;
    //To choose shaving the hair
    private int Shaving;

    /**
     * Default constructor
     *
     */
    public veterinaryAndCare() {
        this.sprocess = sprocess;
        this.vaccine = vaccine;
        this.osteopathy = osteopathy;
        this.CaesareanSections = CaesareanSections;
        this.HairnTeeth = HairnTeeth;
        this.CutNails = CutNails;
        this.Shaving = Shaving;

    }

    /**
     * Mutator method to set the spaying process
     *
     * @param sprocess
     */
    public void setSprocess(int sprocess) {
        this.sprocess = sprocess;
    }

    /**
     * Mutator method to set the vaccine
     *
     * @param vaccine
     */

    public void setVaccine(int vaccine) {
        this.vaccine = vaccine;
    }

    /**
     * Mutator method to set the osteopathy
     *
     * @param osteopathy
     */
    public void setOsteopathy(int osteopathy) {
        this.osteopathy = osteopathy;
    }

    /**
     * Mutator method to set the Caesarean sections
     *
     * @param CaesareanSections
     */
    public void setObsterics(int CaesareanSections) {
        this.CaesareanSections = CaesareanSections;
    }

    /**
     * Accessor method to return the spaying process
     *
     * @return int value
     */

    public int getSprocess() {
        return sprocess;
    }

    /**
     * Accessor method to return the vaccine
     *
     * @return int value
     */

    public int getVaccine() {
        return vaccine;
    }

    /**
     * Accessor method to return the osteopathy
     *
     * @return int value
     */
    public int getOsteopathy() {
        return osteopathy;
    }

    /**
     * Accessor method to return the Caesarean sections
     *
     * @return int value
     */
    public int getCaesareanSections() {
        return CaesareanSections;
    }

    /**
     * Mutator method to set the hair and teeth
     *
     * @param HairnTeeth
     */
    public void setHairnTeeth(int HairnTeeth) {
        this.HairnTeeth = HairnTeeth;
    }

    /**
     * Mutator method to set the cut nails
     *
     * @param CutNails
     */
    public void setCutNails(int CutNails) {
        this.CutNails = CutNails;
    }

    /**
     * Mutator method to set the Shaving
     *
     * @param Shaving
     */
    public void setShaving(int Shaving) {
        this.Shaving = Shaving;
    }

    /**
     * Accessor method to return the hair and teeth
     *
     * @return hair and teeth
     */
    public int getHairnTeeth() {
        return HairnTeeth;
    }

    /**
     * Accessor method to return the cut nails
     *
     * @return cut nails
     */
    public int getCutNails() {
        return CutNails;
    }

    /**
     * Accessor method to return the Shaving
     *
     * @return shaving
     */
    public int getShaving() {
        return Shaving;
    }

    /**
     * Abstract method for the sterilization process
     *
     * @return int value
     */
    public abstract int sterilizationProcess();

    /**
     * Abstract method for vaccine
     *
     * @return int value
     */
    public abstract int vaccine();

    /**
     * Abstract method for osteopathy
     *
     * @return int value
     */
    public abstract int osteopathy();

    /**
     * Abstract method for obstetrics
     *
     * @return int value
     */
    public abstract int obsterics();

    /**
     * Abstract method for hair and teeth
     *
     * @return int value
     */
    public abstract int HairnTeeth();

    /**
     * Abstract method for cut nails
     *
     * @return int value
     */
    public abstract int CutNails();

    /**
     * Abstract method for Shaving thr hair
     *
     * @return int value
     */
    public abstract int Shaving();

    /**
     * method toString
     *
     * @return all the services that we offer it with price
     */
    @Override
    public String toString() {
        return "veterinary{" + "Sterilization process price= " + sprocess + "\nvaccine price=" + vaccine
                + "\nosteopathy price= " + osteopathy + "\nobsterics price= " + CaesareanSections + '}';
    }

}

