package com.LinkedList;

public class InsertInStartDoublyLinkedList {

	static Node insertAtStart(Node head, int value) {
		Node temp = new Node(value);
		temp.next = head;
		if(head!=null)
			head.prev=temp;
		return temp;
	}
	
	static void printAll(Node head) {
		Node curr = head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	
	public static void main(String[] args) {
		
		Node head = null;
		head= insertAtStart(head, 10);
		head= insertAtStart(head, 20);
		head= insertAtStart(head, 30);
		printAll(head);
	}

}
