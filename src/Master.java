public class Master extends Human {
    private String degree;

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Master(String lastName, String firstName, int age, String degree) {
        super(lastName, firstName, age);
        this.degree = degree;
        System.out.println("MConstructor:\t" + Integer.toHexString(hashCode()));
    }
    public String toString()
    {
        return degree + " ";
    }

}