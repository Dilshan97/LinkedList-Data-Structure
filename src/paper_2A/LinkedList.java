
package paper_2A;


public class LinkedList {
    
    public Student firstStudent;
    
    public LinkedList(){
        firstStudent = null;
    }
    
    public void displayStudent(){
        Student currentStudent = firstStudent;
        while(currentStudent != null){
            currentStudent.displayStudent();
            currentStudent = currentStudent.nextStudent;
        }
    }
    
    public void insertLast(int id){
        Student newStudent = new Student(id);
        Student currentStudent = firstStudent;
        
        if(firstStudent != null){
            while(currentStudent.nextStudent != null){
                currentStudent = currentStudent.nextStudent;
            }
            
            currentStudent.nextStudent = newStudent;
        }
        else{
            firstStudent = newStudent;
        }
    }
    
    public Student deleteFirst(){
        Student deleteStudent = firstStudent;
        
        while(firstStudent != null){
            firstStudent = firstStudent.nextStudent;
        }
        return deleteStudent;
    }
    
    
}