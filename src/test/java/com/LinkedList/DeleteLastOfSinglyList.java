package com.LinkedList;

public class DeleteLastOfSinglyList {

	static void print(Node Head) {
		Node curr = Head;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	
	static Node deleteLast(Node head) {
		if(head==null)
			return null;
		if(head.next==null)
			return null;
		Node curr = head;
		while(curr.next.next!=null) {
			curr=curr.next;
		}
		curr.next =null;
		return head;
	}
	
	public static void main(String[] args) {
		Node head= new Node(100);
		head.next = new Node(101);
		head.next.next = new Node(102);
		head.next.next.next = new Node(103);
		head = deleteLast(head);
		print(head);
	}

}
