public class Specialist extends Graduate {
private int experience;
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

    /*public Specialist(Graduate graduate2, int experience) {
        //super(graduate2);
        setExperience(experience);
        System.out.println("SpConstructor:\t" + Integer.toHexString(hashCode()));
    }*/

    @Override
    public String toString() {
        return super.toString() + " " + experience;
    }
}

