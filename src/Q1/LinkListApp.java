
package Q1;

class LinkListApp {
    
    public static void main(String ar[]){
      
        LinkedList L1 = new LinkedList();
        
        L1.insertFirst(10);
        L1.insertFirst(20);
        L1.insertFirst(30);
        L1.insertFirst(40);
        
        L1.displayList();
        
        while(!L1.isEmpty()){
            LinkX result;
            result = L1.deleteFirst();
            result.displayLink();
        }
        
    }
}
