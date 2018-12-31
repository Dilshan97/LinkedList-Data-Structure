
package Q1;

class LinkX {
    
    public int iData;
    public LinkX next;
    
    public LinkX(int id){
        iData = id;
        next = null;
    }
    
    public void displayLink(){
        System.out.println(iData);
    }
}
