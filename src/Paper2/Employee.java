
package Paper2;


public class Employee {
   
    public Employee next;
    public int EmployeeID;
    
    public Employee(int empID){
        EmployeeID = empID;
        next = null;
    }
    
    public void displayEmployee(){
        System.out.println(EmployeeID);
    }
}
