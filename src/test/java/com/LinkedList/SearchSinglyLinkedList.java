package com.LinkedList;

public class SearchSinglyLinkedList {

//	static void print(Node Head) {
//		Node curr = Head;
//		while(curr!=null)
//		{
//			System.out.println(curr.data);
//			curr=curr.next;
//		}
//	}
	
	static int searchIndex(Node head, int value) {
	
		Node temp = head;
		int index=0;
		if(head==null)
			return -1;
		while(temp!=null) {
			index++;
			if(temp.data==value) {
				return index;
			}
			temp=temp.next;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Node head=null;
//		Node head= new Node(100);
//		head.next = new Node(101);
//		head.next.next = new Node(102);
//		head.next.next.next = new Node(103);
		System.out.println(searchIndex(head, 1021));
//		print(head);
	}

}
