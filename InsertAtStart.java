package LinkedList;
class Insert{
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
	Node head=null;
	Node tail=null;
	public void addAtStart(int data) {
		//Create a new Node
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			Node temp=head;
			head=newNode;
			head.next=temp;
		}
	}
	public void display() {
		Node curr=head;
		if(head==null) {
			System.out.print("List is empty");
			return;
		}
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
}
public class InsertAtStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insert n= new Insert();
		n.addAtStart(10);
		n.addAtStart(90);
		n.addAtStart(30);
		n.display();
		
	}

}
