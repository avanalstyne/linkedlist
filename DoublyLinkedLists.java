import java.util.*;
public class DoublyLinkedLists
{
  // Java code for Linked List implementation
 
    private Node first;
    private Node last;
    private int length;
  //constructors 
   /* public DoublyLinkedLists{
   this.first= new Node();
   current = first;
   last= first;
    }  */
   /* public void printReverse(){ //reverse alphabetical order
      Node pointer= first;
      while(pointer.getNext()!= null)
      {
        while (pointer!=null)
      {
     System.out.println(pointer.getData());
     pointer= pointer.getPrev(); 
     return;
    }
    
      }
    }*/
    public void print() // print method
    {
      Node pointer= first;
      while( pointer != null)
      {
        System.out.println(pointer.getData());
        pointer= pointer.getNext();
      }
    }
    public void delete(){ // delete list
    first= null;
    }
    public void deleteNode(String node) { // delete node
    Node pointer= first;
    if (first.getData().equals(node)) {
      first= first.getNext();
      return;
    }
    while(pointer != null){
      if (pointer.getData().equals(node)){
      pointer.getPrev().setNext(pointer.getNext());
      if (pointer.getNext() != null){
        pointer.getNext().setPrev(pointer.getPrev());
        return;
      }
      }
    }
    }
    public void removeAtIndex(int index) //remove index
    {
        if(index > this.length-1)
        {
          System.out.println("Please select a smaller index");
          return;
        }
        Node n = this.first;
        if(n == null)
        {
          System.out.println("This is an empty list.");
          return;
        }
        else
        {
          this.length--;
          for(int i=0; i<index; i++)
          {
            n=n.getNext();
          }
          Node m = n.getPrev();
          m.setNext(n.getNext());
        }
    }
        
  public Node find(String value){ 
        Node n = this.first;
        while(n != null){
          if(n.getData().compareTo(value) == 0)
               return n;
             n=n.getNext();
             }
         return null;
    }
     
    public String toStringReverse(){
        String result = "";
        for(int i=0; i<this.length; i++){
          Node n = this.first;
          for (int j=0; j<this.length-i-1; j++ ){
            n=n.getNext();
          }
          result = (result + n.getData() + " ");
        }
        return result;
    }
       
    public String toString(){
        String str = "";
        Node pointer = this.first;
        while ( pointer != null ) {
          str += pointer.getData();
          pointer = pointer.getNext();
        }        
        return str;
    }
        
    public void insertStart(String value){
    this.length++;
    Node n = new Node(value);
    Node m = this.first;
    if(m == null){
      this.first = n;
      this.last = n;
    }
    else{
      n.setNext(m);
      m.setPrev(n);
      this.first = n;
    }
    }
// insert a new node at the end of the list
    public void insertEnd(String value){
      this.length++;
      Node n = new Node(value);
      if (this.first == null){
        this.first = n;
        this.last = n;
      }
      else{
        this.last.setNext(n);
        n.setPrev(this.last);
        this.last = n;
      }
    }
    public void clear() {
    // drop access to all other nodes
        first = null;
        last = null; 
        length =0;
        
    }
    
    public void addNode(String str){
   Node node= new Node(str);
  if(first == null)
          first= node;
        else
        {
        Node pointer= first;
        int compare= pointer.getData().compareTo(node.getData());
        if(compare== 0)
        {
        if (pointer.getNext()== null)
        {
          first.setNext(node);
          node.setPrev(null);
        }
        else
          {
          node.setNext(pointer.getNext());
          node.setPrev(pointer);
          pointer.getNext().setPrev(node);
          pointer.setNext(node);
        }
        }
        if (compare > 0)
        {
        node.setNext(pointer);
        pointer.setPrev(node);
          first= node;
        }
        if (compare < 0)
        {
          if (pointer.getNext()== null){
       pointer.setNext(node);
       node.setPrev(pointer);
     
     }
          else{
            while( pointer.getNext() != null){
            pointer= pointer.getNext();
            compare= pointer.getData().compareTo(node.getData());
            
            if(compare== 0)
        {
        if (pointer.getNext()== null)
        {
          first.setNext(node);
          node.setPrev(null);
          return;
        }
        
        else
          {
          node.setNext(pointer.getNext());
          node.setPrev(pointer);
          pointer.getNext().setPrev(node);
          pointer.setNext(node);
          return;
        
        }
        
        }
        if (compare > 0)
        {
         node.setPrev(pointer.getPrev());
         node.setNext(pointer);
         pointer.getPrev().setNext(node);
         pointer.setPrev(node);
         return;
        }
        if (compare < 0)
        {
          if(pointer.getNext()==null);
          {
          node.setPrev(pointer);
          pointer.setNext(node);
          return;
          }
          
        }
            }
          } 
        }
      
      
      
      
      
      
      
      
      
      
      
      
      
      /*{
      //first thing, create the node
      Node node = new Node(str);
      //node.Next()= current.Next();
      //create a temporary node to traverse the list with
      Node traverse = first;
      
      //case where the linked list is empty
      if(traverse == null)
      {
        traverse = node;
        first = traverse;
      }
      
      //make 3 more cases, where the string is compared
      //case 1 - the string comes before the string stored in the first node
      if(last.getData().compareTo(node.getData()) == 0)
      {
        node.setNext(first);
        first = node;
      }
      //case 2 - the string comes after the string stored in the last node
       else if (first.getData().compareTo(node.getData()) < 0)
      {
        node.setNext(last);
        last = node;
      }
      //case 3 - the string is somewhere in the middle of strings stored in the first and last nodes
       else if
       {
        while (transver.getNext!= null) 
        {
          traverse= traverse.getNext
        if (compare==0)
            
        }
        
         /*node= node.getNext();
         node.setPrev(this.current.getPrev());
         node.setNext(b.current);
         node= node.getPrev();*/
         //node=node.getNext();*/
  
       
       }
    
    }
    
    
}

        
       
    
    
    /*
     * old add method
     * if(first.getNext()!= null)
          first= node;
        else
        {
        Node pointer= first;
        int compare= pointer.getData().compareTo(node.getData());
        if(compare== 0)
        {
        if (pointer.getNext()== null)
        {
          first.setNext(node);
          node.setPrev(null);
        }
        else{
          node.setNext(pointer.getNext());
          pointer.setNext(node);
          
        }
        }
        } */
    

    
      