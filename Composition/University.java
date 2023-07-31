public class University {

    private String Name;
    private College college;

    public University(String name, College college) {
        Name = name;
        this.college = college;
    }

    public String getName() {
        return Name;
    }

    public College getCollege() {
        return college;
    }
}

public class Library {

    private String Name;
    private String YearOfBuild;
    private int NoOfBooks;
    private Floor floor;

    public Library(String name, String yearOfBuild, int noOfBooks, Floor floor) {
        Name = name;
        YearOfBuild = yearOfBuild;
        NoOfBooks = noOfBooks;
        this.floor = floor;
    }

    public String getName() {
        return Name;
    }

    public String getYearOfBuild() {
        return YearOfBuild;
    }

    public int getNoOfBooks() {
        return NoOfBooks;
    }

    public Floor getFloor() {
        return floor;
    }

    public void SearchBooks(){
        System.out.println("Searching for Books");
    }
}

public class College {

    private String CollegeName;
    private Library library;
    private Branch branch;

    public College(String collegeName, Library library, Branch branch) {
        CollegeName = collegeName;
        this.library = library;
        this.branch = branch;
    }

    public String getCollegeName() {
        return CollegeName;
    }

    public Library getLibrary() {
        return library;
    }

    public Branch getBranch() {
        return branch;
    }

    public void OpeningDate(){
        System.out.println("The Opening Date is 8th November 2021");
    }
}

public class Branch {

    private String BranchName;
    private Sessions session;

    public Branch(String branchName, Sessions session) {
        BranchName = branchName;
        this.session = session;
    }

    public String getBranchName() {
        return BranchName;
    }

    public Sessions getSession() {
        return session;
    }
}

public class Floor {

    private int FloorNo;
    private double FloorCapacity;

    public Floor(int floorNo, double floorCapacity) {
        FloorNo = floorNo;
        FloorCapacity = floorCapacity;
    }

    public int getFloorNo() {
        return FloorNo;
    }

    public double getFloorCapacity() {
        return FloorCapacity;
    }

    public void CleanFloor(){
        System.out.println("Clean the Floor");
    }
}

public class Sessions {

    private String SessionName;
    private Student student;

    public Sessions(String sessionName, Student student) {
        SessionName = sessionName;
        this.student = student;
    }

    public String getStudentName() {
        return SessionName;
    }

    public Student getStudent() {
        return student;
    }
}

public class Student {

    private String Name;
    private String RollNo;

    public Student(String name, String rollNo) {
        Name = name;
        RollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public String getRollNo() {
        return RollNo;
    }
}

public class Main {

    public static void main(String[] args) {

        Student Student1 = new Student("Mannan", "049");

        Sessions ThirdYear = new Sessions("2021", Student1);

        Floor SecondFloor = new Floor(2, 10000);

        Branch CSE = new Branch("Computer Science", new Sessions("CIE-1",
                new Student("Saber","007")));

        Library XYZ = new Library("LORDS", "2002", 100000, SecondFloor);

        College LIET = new College("Lords Institute Of Engineering & Technology", XYZ, CSE);

        University OU = new University("Osmania University", LIET);

        OU.getCollege().OpeningDate();
        OU.getCollege().getLibrary().SearchBooks();
        OU.getCollege().getLibrary().getFloor().CleanFloor();
    }
}
