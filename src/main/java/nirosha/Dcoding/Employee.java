package nirosha.Dcoding;

public class Employee extends Person {
    private int EmployeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, int EmployeeId, String jobTitle) {
        super(firstName, lastName);
        this.EmployeeId= EmployeeId;
        this.jobTitle = jobTitle;
    }
    public int getEmployeeId(){
        return EmployeeId;
    }
    public String getlastName(){
        return super.getlastName() +", "+ jobTitle;
    }
    public static void main(String[] args){
        Employee Em = new Employee( "Nirosha", "Gowtu",22326,"java Developer");
        System.out.println(Em.getfirstName() + " " + Em.getlastName() + " " + Em.getEmployeeId());
    }

}
