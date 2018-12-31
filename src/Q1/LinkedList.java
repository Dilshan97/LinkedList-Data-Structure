
package Q1;


class LinkedList {
   
    private LinkX first;
    
    public LinkedList(){
        first = null;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public void displayList(){
        LinkX current = first;
        
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    
    public void insertFirst(int id){
        LinkX newLink = new LinkX(id);
        newLink.next = first;
        first = newLink;
    }
    
    public LinkX deleteFirst(){
        LinkX temp = first;
        first = first.next;
        return temp;
    }
    
    public LinkX find(int key){
        LinkX current = first;
        
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
    
}
