public class student {
    private String firstName, lastName;
    private int Marks;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getMarks(){
        return Marks;
    }

    public void setFirstName(String FirstName){
        firstName = FirstName;
    }

    public void setLastName(String LastName){
        lastName = LastName;
    }

    public void setMarks(int marks){
        if(Marks < 0 || Marks > 100) {
            Marks = 0;
        }
        else{
            Marks = marks;
        }

    }

    public Boolean isPass(){
        if(Marks >= 33 && Marks <= 100){
            return true;
        }
        else{
            return false;
        }
    }

    public String getFullName(){
        return getFirstName() + " " + getLastName();
    }

    public static void main(String[] args){
    name details = new name();

    details.setFirstName("Abdul");
    details.setLastName("Mannan");
    //String Name = details.getFullName();
    //System.out.println(Name);
    details.setMarks(90);
    System.out.println(details.isPass());
    }
}