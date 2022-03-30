package com.LinkedList;

//class Node{
//	int data;
//	Node next;
//	Node(int x){
//		data=x;
//		next=null;
//	}
//}
public class DeleteHeadNodeSinglyList {

	static void printList(Node Head) {
		Node curr = Head;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	
	static Node deleteHeadNode(Node head) {
		head= head.next;
		return head;
	}
	
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head= deleteHeadNode(head);
		printList(head);

	}

}
