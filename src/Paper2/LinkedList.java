
package Paper2;


public class LinkedList {
    
    public Employee first;
    
    public LinkedList(){
        first = null;
    }
    
    public void insertFirst(int empID){
        Employee newLink = new Employee(empID);
        newLink.next = first;
        first = newLink;
    }
    
    public void displayEmployees(){
        Employee current = first;
        
        while(current != null){
            current.displayEmployee();
            current = current.next;
        }
        System.out.println();
    }
}
