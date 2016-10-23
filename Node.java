public class Node{

  //properties
   private String data;
   private Node next;
   private Node prev;
   private Node current;
   
//constructor
   public Node(String input_data){
        this.data = input_data;
        this.prev = null;
        this.next = null;
   }
   
   //getters
   public String getData(){
    return this.data;
   }
   //setters
   public void setData(String input_data){
    this.data = input_data;
   }
   
   //Node next getter
   public Node getNext(){
    return this.next;
   }
   //Node next setter
   public void setNext(Node n){
    this.next = n;
   }
   
   //Node prev getter
   public Node getPrev(){
    return this.prev;
   }
   //Node prev setter
   public void setPrev(Node n){
    this.prev = n;
   }
}

