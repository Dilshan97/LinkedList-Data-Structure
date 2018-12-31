
/**
 *
 * @author Dilshan
 */
class LinkList {
    
    private Link first;
    
    public LinkList(){
        first = null;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public void displayList(){
        Link current = first;
        
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        
        System.out.println("");
    }
    
    public void insertFirst(int id){
        Link L1 = new Link(id);
        L1.next = first;
        first = L1;
    }
    
    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }
    
    public Link findLink(int key){
        Link current = first;
        
        while(current != null){
            if(current.iData == key){
                return current;
            }
            else{
                current = current.next;
            }
        }
        return null;
    }
    
    public boolean insertAfter(int key, int newData){
        Link current = first;
        
        while(current != null){
            if(current.iData == key){
                Link L1 = new Link(newData);
                L1.next = current.next;
                current.next = L1;
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    
    
}
 