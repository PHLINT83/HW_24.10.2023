public class Specialist extends Graduate {
/*private int experience;
    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Specialist(String lastName, String firstName, int age,
                      String speciality, String group, double rating, double attendance,
                      String subject, int experience) {
        super(lastName, firstName, age, speciality, group, rating, attendance, subject);
        setExperience(experience);
        System.out.println("SpConstructor:\t" + Integer.toHexString(hashCode()));
    }

    *//*public Specialist(Graduate graduate2, int experience) {
        //super(graduate2);
        setExperience(experience);
        System.out.println("SpConstructor:\t" + Integer.toHexString(hashCode()));
    }*//*

    @Override
    public String toString() {
        return super.toString() + " " + experience;
    }*/
    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Specialist(
            String lastName, String firstName, int age,
            String speciality, String group, double rating, double attendance,
            String subject, int grade)
    {
        super(lastName, firstName, age, speciality, group, rating, attendance, subject);
        this.grade = grade;
        System.out.println("SpConstructor:\t" + Integer.toHexString(hashCode()));
    }
    public Specialist(Graduate graduate, int grade)
{
    super(graduate);
    this.grade = grade;
    System.out.println("SpConstructor:\t" + Integer.toHexString(hashCode()));
}
public Specialist(Specialist other)
{
    super(other);
    this.grade = other.grade;
    System.out.println("SpConstructor:\t" + Integer.toHexString(hashCode()));
}

    @Override
    public void init(String[] values) {
        super.init(values);
        grade = Integer.parseInt(values[9].trim());
    }

    @Override
    public String toString() {
        return super.toString() + grade;
    }
}

