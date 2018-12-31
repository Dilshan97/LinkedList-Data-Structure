
package LinkedList_lab;


public class LinkedList {
    
    public LinkX first;
    
    public LinkedList(){
        first = null;
    }
    
    public void insertFirst(String name, double avg){
        LinkX L1 = new LinkX(name, avg);
        L1.next = first;
        first = L1;  
    }
    
    public void diaplayDetails(){
        LinkX current = first;
        
        while(current != null){
            current.diaplayDetail();
            current = current.next;
        }
        
        System.out.println("");
    }
    
}
