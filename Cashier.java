/*
 The cashier class is a class that implements an employees interface class,
 the class shows us the cashier's job, number of hours, and salary
 */
package Employees;

/**
 * @author yara
 */
public class Cashier implements employees {

    // Class variable
    //Name the cashier
    private String Name;
    //Job the cashier
    private String Job;
    //Working hours
    private int Hours;
    //Monthly salary
    private int Salary;

    /**
     * Default constructor
     */
    public Cashier() {
        this.Name = Name;
        this.Job = Job;
        this.Hours = Hours;
        this.Salary = Salary;
    }

    /**
     * Constructor
     *
     * @param Name
     * @param Job
     * @param Hours
     * @param Salary
     */
    public Cashier(String Name, String Job, int Hours, int Salary) {
        this.Name = Name;
        this.Job = Job;
        this.Hours = Hours;
        this.Salary = Salary;

    }

    /**
     * Mutator method to set the name
     *
     * @param Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Mutator method to set the job
     *
     * @param Job
     */
    public void setJob(String Job) {
        this.Job = Job;
    }

    /**
     * Mutator method to set the hours
     *
     * @param Hours
     */
    public void setHours(int Hours) {
        this.Hours = Hours;
    }

    /**
     * Mutator method to set the salary
     *
     * @param Salary
     */
    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    /**
     * Accessor method to return the name
     *
     * @return name
     */
    public String getName() {
        return Name;
    }

    /**
     * abstract method to return the job
     *
     * @return what should he do
     */
    @Override
    public String getJob() {
        return " processing and receiving payments";
    }

    /**
     * abstract method to return the hours
     *
     * @return working hours
     */

    @Override
    public int getHours() {
        return Hours = 7;
    }

    /**
     * abstract method to return the salary
     *
     * @return salary
     */
    @Override
    public int getSalary() {
        return Salary+50;
    }

    /**
     * toString method
     *
     * @return the name, job, working hours, salary
     */
    @Override
    public String toString() {
        return "Cashier name : " + Name + "\nCashier job: " + this.getJob()
                + "\nHours work: " + this.getHours() + "\nSalary: " + this.getSalary();
    }
}
