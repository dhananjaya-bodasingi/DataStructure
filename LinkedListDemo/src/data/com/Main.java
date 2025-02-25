package data.com;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertAtBeginning("10");
		list.insertAtPostion("9" , 2);
		list.insertAtPostion("20" ,3);
		list.insertAtEnd("21");
		list.insertAtPostion("40" ,3);
		
		list.printList();
	}

}
