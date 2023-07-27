public class name {
    private String firstName, lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName(){
        return getFirstName () + " " + getLastName ();
    }
        public static void main(String[] args){
            name details = new name();
    
            details.setFirstName("Abdul");
            details.setLastName("Mannan");
            String Name = details.getName();
            System.out.println(Name);
        }

        public void setMarks(int i) {
        }

        public char[] isPass() {
            return null;
        }
    
    }
    
