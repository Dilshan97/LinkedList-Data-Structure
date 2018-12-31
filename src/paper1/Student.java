
package paper1;

public class Student {
   
    public Student next;
    public int StudentID;
    
    public Student(int stdID){
        StudentID = stdID;
        next = null;
    }
    
    public void displayStudent(){
        System.out.println(StudentID);
    }
}
