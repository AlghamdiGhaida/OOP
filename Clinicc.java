
/**
 * Clinic class is a class that hold the lists of doctors, assistants and
 * cashiers
 *
 */
import java.util.List;
import Employees.Dr;
import Employees.Cashier;
import Employees.Assistant;

public class Clinicc {

    //Class variable
    //Doctors list
    private List<Dr> doctor;
    //Assistants list
    private List<Assistant> assistant;
    //Cashiers list
    private List<Cashier> cashier;
    //Bill home variable
    private BillHome billHome;
    //Bill shop variable
    private BillShop billShop;

    /**
     * Default constructor
     */
    public Clinicc() {

    }

    /**
     * Constructor new clinic object is created
     *
     * @param doctor list of doctors in clinic
     * @param assistant list of assistants in the clinic
     * @param cashier list of cashiers in clinic
     */
    public Clinicc(List<Dr> doctor, List<Assistant> assistant, List<Cashier> cashier) {
        this.doctor = doctor;
        this.assistant = assistant;
        this.cashier = cashier;
        this.billHome = billHome;
        this.billShop = billShop;
    }

    /**
     * Mutator method to set the doctor list
     *
     * @param doctor
     */
    public void setDoctor(List<Dr> docto) {
        this.doctor = docto;
    }

    /**
     * Mutator method to set the assistant list
     *
     * @param assistant
     */
    public void setAssistant(List<Assistant> assistant) {
        this.assistant = assistant;
    }

    /**
     * Mutator method to set the cashier list
     *
     * @param cashier
     */
    /**
     * Mutator method to set the cashir list
     *
     * @param cashier
     */
    public void setCashier(List<Cashier> cashier) {
        this.cashier = cashier;
    }

    /**
     * Accessor method
     *
     * @return doctor list
     */
    public List<Dr> getDoctor() {
        return doctor;
    }

    /**
     * Accessor method
     *
     * @return assistant list
     */
    public List<Assistant> getAssistant() {
        return assistant;
    }

    /**
     * Accessor method
     *
     * @return cashier list
     */
    public List<Cashier> getCashier() {
        return cashier;
    }

    /**
     * Accessor method
     *
     * @return home bill
     */
    public BillHome getBillHome() {
        return billHome;
    }

    /**
     * Accessor method
     *
     * @return shop bill
     */
    public BillShop getBillShop() {
        return billShop;
    }

    /**
     * Method to add doctor
     *
     * @param doctorr
     */
    public void addDr(Dr doctorr) {
        doctor.add(doctorr);
    }

    /**
     * Method to add assistantt
     *
     * @param assistantt
     */
    public void addAssistant(Assistant assistantt) {
        assistant.add(assistantt);
    }

    /**
     * Method to add cashierr
     *
     * @param cashierr
     */
    public void addCashier(Cashier cashierr) {
        cashier.add(cashierr);
    }

    /**
     * method toString ()
     *
     * @return null
     */
//    @Override
    public String toString() {
        return null;
    }
}
