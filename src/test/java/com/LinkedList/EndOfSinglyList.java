package com.LinkedList;

//class Node{
//	int data;
//	Node next;
//	Node(int x){
//		data=x;
//		next=null;
//	}
//}

public class EndOfSinglyList {

	static void print(Node Head) {
		Node curr = Head;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	
	static Node insertAtLast(Node head, int x) {
		Node newNode = new Node(x);
		if(head==null) {
			return newNode;
		}
		else {
			Node curr = head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=newNode;
		}
		return head;
		
	}
	
	public static void main(String[] args) {
//		Node head = null;
		Node head= new Node(100);
		head.next = new Node(101);
		head.next.next = new Node(102);
		head.next.next.next = new Node(103);
		head = insertAtLast(head,10);
		print(head);
	}

}
