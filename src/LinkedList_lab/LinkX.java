
package LinkedList_lab;

public class LinkX {
    
    public LinkX next;
    public String name;
    public double avarage;
    
    public LinkX(String name, double avg){
        this.name = name;
        avarage = avg;
        next = null;
    }
    
    public void diaplayDetail(){
        System.out.println(name + "  " + avarage);
    }
}
