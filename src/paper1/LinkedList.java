
package paper1;

public class LinkedList {
    
    public Student first;
    
    public LinkedList(){
        first = null;
    }
    
    public void displayStudents(){
        Student current = first;
        while(current != null){
            current.displayStudent();
            current = current.next;
        }
        System.out.println("");
    }
    
    public Student deleteFirst(){
        Student temp = first;
        first = first.next;
        return temp;
    }
    
    public void insertLast(int id){
        Student newLink = new Student(id);
        Student current = first;
        
        if(current != null){
            while(current.next != null){
                current = current.next;
            }
            current.next = newLink;
        }
        else{
            first = newLink;
        }
    }
}
