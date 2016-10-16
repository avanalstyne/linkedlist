import java.util.*;
public class DoublyLinkedLists{
  // Java code for Linked List implementation
 public static void main(String args[])
    {
 
      private Node first;
    private Node last;
    private int length;
    
    public void removeAtIndex(int index){
        if(index > this.length-1){
          System.out.println("Please select a smaller index");
          return;
        }
        Node n = this.first;
        if(n == null){
          System.out.println("This is an empty list.");
          return;
        }
        else{
          this.length--;
          for(int i=0; i<index; i++){
            n=n.getNext();
          }
          Node m = n.getPrev();
          m.setNext(n.getNext());
        }
    }
        // Creating object of class linked list
        LinkedList<String> object = new LinkedList<String>();
 
        // Adding elements to the linked list
        object.add("Apple");
        object.add("Banana");
        object.addLast("Cranberries");
        System.out.println("Linked list : " + object);
        
 }
}

    
      