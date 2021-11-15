public class Doctor extends HospitalEmployee{
    
    public String specialty;

    public Doctor(String name, int number, String specialty) {
        super(name, number);
        this.specialty = specialty;
    }

    public String toString() {
        return getName() + "  " + getNumber() + " " + specialty;
    }
}
