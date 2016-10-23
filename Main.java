    
public class Main
{
public static void main (String[] args)
    {
 
  DoublyLinkedLists myList = new DoublyLinkedLists();
 
  myList.addNode("Bananas");
  myList.addNode("Apples");
  myList.addNode("Cranberries");
  myList.print();
  //myList.toStringReverse();
  //myList.print();
  myList.deleteNode("Apples");
  myList.print();
  myList.delete();
  myList.print();

  
}
}