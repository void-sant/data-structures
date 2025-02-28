package linkedList;


public class Main {
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		System.out.println("Before Reverse Linkedlist");
		myLinkedList.printList();
		System.out.println("\n---------------");
		
		myLinkedList.reverse();
		System.out.println("After Reverse Linkedlist");
		myLinkedList.printList();
		
		
  	/*	 LinkedList myLinkedList = new LinkedList(1);
	        myLinkedList.append(2);
	        myLinkedList.append(3);
	        myLinkedList.append(4);
	        myLinkedList.append(5);

	        System.out.println("LL before remove():");
	        myLinkedList.printList();

	        System.out.println("\nRemoved node:");
	        System.out.println(myLinkedList.remove(2).value);
	        System.out.println("LL after remove() in middle:");
	        myLinkedList.printList();

	        System.out.println("\nRemoved node:");
	        System.out.println(myLinkedList.remove(0).value);
	        System.out.println("LL after remove() of first node:");
	        myLinkedList.printList();

	        System.out.println("\nRemoved node:");
	        System.out.println(myLinkedList.remove(2).value);
	        System.out.println("LL after remove() of last node:");
	        myLinkedList.printList();
      */
		
	 /*	  LinkedList myLinkedList = new LinkedList(1);
	        myLinkedList.append(3);

	        System.out.println("LL before insert():");
	        myLinkedList.printList();

	        myLinkedList.insert(1, 2);

	        System.out.println("\nLL after insert(2) in middle:");
	        myLinkedList.printList();

	        myLinkedList.insert(0, 0);

	        System.out.println("\nLL after insert(0) at beginning:");
	        myLinkedList.printList();

	        myLinkedList.insert(4, 4);

	        System.out.println("\nLL after insert(4) at end:");
	        myLinkedList.printList();
     */
		
	 /*    LinkedList myLinkedList = new LinkedList(0);
	        myLinkedList.append(1);
	        myLinkedList.append(2);
	        myLinkedList.append(3);

	        System.out.println("Linked List before set():");
	        myLinkedList.printList();

	        myLinkedList.set(2, 99);

	        System.out.println("\nLinked List after set():");
	        myLinkedList.printList();
    */
		
	/*        LinkedList myLinkedList = new LinkedList(0);
	        myLinkedList.append(1);
	        myLinkedList.append(2);
	        myLinkedList.append(3);


	        System.out.println(myLinkedList.get(3).value);
	        myLinkedList.printList();
     */

		
	  /*    LinkedList myLinkedList = new LinkedList(2);
	        myLinkedList.append(3);

	        System.out.println("Before prepend():");
	        System.out.println("-----------------");
	        myLinkedList.getHead();
	        myLinkedList.getTail();
	        myLinkedList.getLength();

	        System.out.println("\nLinked List:");
	        myLinkedList.printList();

	        myLinkedList.prepend(1);

	        System.out.println("\n\nAfter prepend():");
	        System.out.println("----------------");
	        myLinkedList.getHead();
	        myLinkedList.getTail();
	        myLinkedList.getLength();

	        System.out.println("\nLinked List:");
	        myLinkedList.printList();
    */
		
	/*	 LinkedList myLinkedList = new LinkedList(1);
	        myLinkedList.append(2);

	        // (2) Items - Returns 2 Node
	        System.out.println(myLinkedList.removeLast().value);
	        // (1) Item - Returns 1 Node
	        System.out.println(myLinkedList.removeLast().value);
	        // (0) Items - Returns null
	        System.out.println(myLinkedList.removeLast());
	        
	        
	    	
	        	EXPECTED OUTPUT:
	        	----------------
	        	2
	        	1
	        	null

	    */
		
		/* LinkedList myLinkedList = new LinkedList(2);
	        myLinkedList.append(1);
	       
	        // (2) Items - Returns 2 Node
	        System.out.println(myLinkedList.removeFirst().value);
	        // (1) Item - Returns 1 Node
	        System.out.println(myLinkedList.removeFirst().value);
	        // (0) Items - Returns null
	        System.out.println(myLinkedList.removeFirst());
       */



	  /*    LinkedList myLinkedList = new LinkedList(1);
	        myLinkedList.makeEmpty();
	        myLinkedList.append(1);
	        myLinkedList.append(2);

	        myLinkedList.getHead();
	        myLinkedList.getTail();
	        myLinkedList.getLength();

	        System.out.println("\nLinked List:");
	        myLinkedList.printList();
	        
	        
	       		EXPECTED OUTPUT:
	        	----------------
	        	Head: 1
	        	Tail: 2
	        	Length: 2
	        
	        	Linked List:
	        	1
	        	2
	        
	    */ 	



 
        
       /*
         LinkedList myLinkedList = new LinkedList(4);
         
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        System.out.println("\nLinked List:");
        myLinkedList.printList();
        
                    EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1
            
            Linked List:
            4

        
        LinkedList myLinkedList2 = new LinkedList(5);
        myLinkedList2.getHead();
        myLinkedList2.getTail();
        myLinkedList2.getLength();

        System.out.println("\nLinked List:");
        myLinkedList2.printList();
       */
    }


}
