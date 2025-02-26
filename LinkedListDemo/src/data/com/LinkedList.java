package data.com;

public class LinkedList {
	
	Node head;
	
	LinkedList(){
		this.head=null;
	}

	public void insertAtBeginning(String data) {
		Node tempNode = new Node(data);
		tempNode.next=head;
		head=tempNode;
	}
	
	public void insertAtEnd(String data) {
		Node tempNode = new Node(data);
		
		if (head == null) {
			head=tempNode;
			return;
		}
		Node tempNode1= head;
		while(tempNode1.next != null) {
			tempNode1 = tempNode1.next;
		}
		tempNode1.next=tempNode;
	}
	
	public void insertAtPostion(String data , int position){
		if ( position < 1) {
			System.out.println("Invalid Position ! ");
			return;
		} else if (position == 1) {
			insertAtBeginning(data);
			return;
		}
		
		Node tempNode=new Node(data);
		Node value = head;
		for ( int i=1; value !=null&& i< position - 1 ; i++ ) {
			value=value.next;
		}
		if (value == null) {
			System.out.println("Position out of range");
			return;
		}
		
		tempNode.next=value.next;
		value.next=tempNode;
	
	}
	
	public void deleteAtBegenning() {
		if (head == null) {
			System.out.println("List is empty");
		}
		System.out.println ("Deleting the first element" + head.data );
		head = head.next;
	}
	
	public void deleteAtEnd (){
		
		if (head == null) {
			System.out.println("List is empty");
		}
		if (head.next == null) {
			System.out.println ("Deleting the at end element" + head.data );
			head = null;
			return;
		}
		Node tempNode= head;
		while ( tempNode.next.next != null) {
			tempNode = tempNode.next ;
		}System.out.println("Deleting " + tempNode.next.data + " from the end...");
        tempNode.next = null;
	}
	
	public void deleteAtPosition(int position) {
		if (head == null) {
			System.out.println("List is empty");
		}
		if ( position < 1 ) {
			System.out.println("invalid position");
			return;
		}
		if ( position  == 1) {
			deleteAtBegenning();
			return;
		}
		Node tempNode = head;
		for ( int i =1; tempNode != null && i<position-1; i++) {
			tempNode = tempNode.next;
		}
		if ( tempNode == null || tempNode.next == null) {
			System.out.println("Position out of range!");
            return;
        }
        System.out.println("Deleting " + tempNode.next.data + " from position " + position + "...");
        tempNode.next = tempNode.next.next;
	}
	
	public void printList() {
		Node value= head;
		while ( value != null) {
			System.out.print(value.data + "-->");
			value=value.next;
		}
		System.out.print ("value is null");	
	}
}
