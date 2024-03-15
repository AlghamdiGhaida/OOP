/*
 The doctor class is a class that implements an employees interface class,
 the class shows us the doctor's job, number of hours, and salary
 */
package Employees;

/**
 *
 * @author yara
 */
public class Dr implements employees {

    // Class variable
    //Name the doctor
    private String Name;
    //Job the doctor
    private String Job;
    //Working hours
    private int Hours;
    //Monthly salary
    private int Salary;
    public int one;
    public int two;

    /**
     * Default constructor
     */
    public Dr() {
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
    public Dr(String Name, String Job, int Hours, int Salary) {
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
     * Mutator method to set the time that employee working in it
     *
     * @param one
     * @param two
     */
    public void setH(int one, int two) {
        this.one = one;
        this.two = two;
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
     *
     * @return Accessor method to return time that the customer working in it
     */
    public String getH() {
        return one + " to " + two;
    }

    /**
     * abstract method to return the job
     *
     * @return what should he do
     */

    @Override
    public String getJob() {
        return "Doing surgery";

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
     * @return salary with 500 bonus BC our dorctors are so special
     */
    @Override
    public int getSalary() {
        return Salary + 500;
    }

    /**
     * toString method
     *
     * @return the name, job, working hours, salary
     */
    @Override
    public String toString() {
        return "Doctor name : " + Name + "\nDoctor job: " + this.getJob()
                + "\nHours work: " + this.getHours() + "\n";
    }
}
