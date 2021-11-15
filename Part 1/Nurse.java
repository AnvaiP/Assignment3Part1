public class Nurse extends HospitalEmployee{
    
    public int numOfPatient;

    public Nurse(String name, int number, int numOfPatient) {
        super(name, number);
        this.numOfPatient = numOfPatient;
    }

    public String toString() {
        return getName() + "" + getNumber() + " has " + numOfPatient + " patients.";
    }
}
