package com.LinkedList;

public class InsertatPositionSinglyList {

	static void print(Node Head) {
		Node curr = Head;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	
	static Node insertAtNthPosition(Node head,int value, int post) {
		int var=0;
		Node temp=head;
		Node NewNode = new Node(value);
		if(post==1) {
			head = NewNode;
			return head;
		}
		while(temp!=null) {
			temp=temp.next;
			var++;
			if(var==post-2) {
				NewNode.next=temp.next;
				temp.next=NewNode;
				return head;
			}
		}
		return head;
		
	}
	
	public static void main(String[] args) {
		int position = 11111;
		int value=132;
		Node head= new Node(100);
		head.next = new Node(101);
		head.next.next = new Node(102);
		head.next.next.next = new Node(103);
		head = insertAtNthPosition(head, value, position);
		print(head);

	}

}
