
public class Main {
    public static void main(String[] args) {
        Human tommy = new Human("Vercetti", "Tomas", 30);
        //System.out.println(tommy);

        Student student = new Student("Pinkman", "Jessie", 25, "Chemistry", "WW_220", 90, 95);
        //System.out.println(student);

        Teacher teacher = new Teacher("White", "Walter", 50, "Chemistry", 25);
        //System.out.println(teacher);

        Graduate graduate = new Graduate("Schreder", "Hank", 40, "Criminalistic", "OBN", 70, 50, "How to catch Heisenberg");
        System.out.println(graduate);

        Graduate graduate2 = new Graduate("Potts", "Virginia", 28, "Engineer", "IM", 99, 91, "How to create an iron Man");
        System.out.println(graduate2);

        Student student1 = new Student(tommy, "Theft", "Vice", 90, 98);
        //System.out.println(student1);

        /*Specialist specialist = new Specialist (graduate2, 5 );
        System.out.println(specialist);*/

        Bookkeeper bookkeper = new Bookkeeper ("Lu","Marry",55, "headbookkeeper");
        System.out.println(bookkeper);

        Master master = new Master("Pedro", "Don", 60, "head of department");
        System.out.println(master);
    }
}