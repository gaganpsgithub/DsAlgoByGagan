package com.LinkedList;

//class Node{
//	int data;
//	Node next;
//	Node(int x){
//		data=x;
//		next=null;
//	}
//}

public class InsertAtBeginingSinglyList {

	static void print(Node Head) {
		Node curr = Head;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	
	static Node insertBegin(Node head, int x) {
		Node temp = new Node(x);
		temp.next=head;
		return temp;
	}
	
	public static void main(String[] args) {
		Node head=null;
		head=insertBegin(head, 30);
		head=insertBegin(head, 40);
		head=insertBegin(head, 50);
		head=insertBegin(head, 60);
		print(head);
	}

}
