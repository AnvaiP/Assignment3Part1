public class Surgeon extends Doctor{
    
    public boolean operating;

    public Surgeon(String name, int number, String specialty, boolean operating) {
        super(name, number, specialty);
        this.operating = operating;
    }

    public String toString() {
        return getName() + "  " + getNumber() + " " + specialty + "Operating: " + operating;
    }
}
