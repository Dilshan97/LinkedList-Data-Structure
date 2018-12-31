
package LinkedList_lab;


public class App {
    
    public static void main(String ar[]){
        
        LinkX L1 = new LinkX("Nipuna", 53.5);
        LinkX L2 = new LinkX("Aravinda", 78.0);
        LinkX L3 = new LinkX("Prashani", 69.5);
        
        LinkX first;
        
        first = L1;
        L1.next = L2;
        L2.next = L3;
        L3.next = null;
        
        L1.diaplayDetail();
    }
}
