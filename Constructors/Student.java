public class Student {

    private String StudName;
    private String StudClass;
    private String StudSection;
    private String StudRollNo;

    public Student(){
        this("DefName", "x", "y", "000");
    }

    public Student(String StudName, String StudRollNo){
        this(StudName, StudRollNo, "CSE", "D");
    }

    public Student(String studName, String studClass, String studSection, String studRollNo) {
        StudName = studName;
        StudClass = studClass;
        StudSection = studSection;
        StudRollNo = studRollNo;
    }

    public String getStudName() {
        return StudName;
    }

    public String getStudClass() {
        return StudClass;
    }

    public String getStudSection() {
        return StudSection;
    }

    public String  getStudRoll() {
        return StudRollNo;
    }

    public static void main(String[] args){

        //default constructor
        Student Stud1 = new Student();

        //default constructor with 2 values are passing by parameters and 2 are default
        Student Stud2 = new Student("Stud2Name", "Stud2RollNo");

        //all values are passed no default
        Student Stud3 = new Student("Stud3Name", "Stud3Class", "Stud3Section", "Stud3RollNo");

        System.out.println(Stud1.getStudName());
        System.out.println(Stud1.getStudRoll());
       
        System.out.println(Stud2.getStudName());
        System.out.println(Stud2.getStudRoll());

        System.out.println(Stud3.getStudName());
        System.out.println(Stud3.getStudRoll());

    }
}



