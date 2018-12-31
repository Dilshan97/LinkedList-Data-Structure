
package paper_1A;


public class Employee {
   
    public Employee nextEmployee;
    public int EmployeeID;
    
    public Employee(int empID){
        EmployeeID = empID;
        nextEmployee = null;
    }
    
    public void displayEmployee(){
        System.out.println(nextEmployee);
    }
}
