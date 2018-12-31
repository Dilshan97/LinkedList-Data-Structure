
package paper_2A;

public class Student {
    
    public int StudentID;
    public Student nextStudent;
    
    public Student( int id){
        StudentID = id;
        nextStudent = null;
    } 
    
    public void displayStudent(){
        System.out.println();
    }
}
