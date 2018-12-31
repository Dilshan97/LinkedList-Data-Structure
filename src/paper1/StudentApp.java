
package paper1;
import java.util.Scanner;

public class StudentApp {
    
    public static void main(String ar[]){
        
        Scanner myScanner = new Scanner(System.in);
        LinkedList newStudent = new LinkedList();
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Enter Student "+ i + " : ");
            newStudent.insertLast(myScanner.nextInt());
        }
        System.out.println("-----------------------");
        newStudent.displayStudents();
        System.out.println("-----------------------");
        
        Student deleteFirst; 
        deleteFirst = newStudent.deleteFirst();
        deleteFirst.displayStudent();
    }
}
