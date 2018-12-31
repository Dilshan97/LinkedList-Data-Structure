
package paper_1A;

public class LinkedList {
    
    public Employee firstEmployee;
    
    public LinkedList(){
        firstEmployee = null;
    }
    
    public void insertFirst(int empID){
        Employee newEmployee = new Employee(empID);
        newEmployee.nextEmployee = firstEmployee;
        firstEmployee = newEmployee;
    }
    
    public void displayEmployees(){
        Employee currentEmployee = firstEmployee;
        while(firstEmployee != null){
            currentEmployee.displayEmployee();
            currentEmployee = currentEmployee.nextEmployee;
        }
        System.out.println("");
    }
    
}
