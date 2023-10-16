public class Bookkeeper extends Human {
private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Bookkeeper(String lastName, String firstName, int age, String position) {
        super(lastName, firstName, age);
        this.position = position;
        System.out.println("BConstructor:\t" + Integer.toHexString(hashCode()));
    }
    public String toString()
    {
        return position + " ";
    }

}
