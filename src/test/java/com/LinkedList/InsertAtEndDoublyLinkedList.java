package com.LinkedList;

public class InsertAtEndDoublyLinkedList {

	static void printAll(Node head) {
		Node curr = head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	
	static Node insertAtEnd(Node head, int num) {
		Node temp = new Node(num);
		if(head==null)
			return temp;
		Node curr= head;
		while(curr.next!=null)
			curr=curr.next;
		temp.prev=curr;
		curr.next=temp;
		return head;
	}
	
	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.prev=head;
		temp1.next=temp2;
		temp2.prev=temp1;
		head = insertAtEnd(head, 111);
		printAll(head);
	}

}
