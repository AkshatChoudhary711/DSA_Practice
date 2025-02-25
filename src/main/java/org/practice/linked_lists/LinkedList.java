package org.practice.linked_lists;

public class LinkedList {

	static Node head;

	public LinkedList() {

	}

	public LinkedList(int data) {
		head = new Node(data);
	}

	public static int length() {
		if (head == null) return 0;
		if (head.next == null) return 1;
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static void traverse() {
		if (head == null) {
			System.out.println("No Node found to traverse!");
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}
		System.out.println(temp.data);

	}

	public static void addAtEnd(int data) {
		if (head == null) {
			return;
		}
		Node temp = head;
		Node newNode = new Node(data);
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public static void addAtStart(int data) {
		if (head == null) {
			Node newNode = new Node(data);
			head = newNode;
			return;
		}
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public static void addAtPos(int data, int pos) {

		if (pos == 1) {
			addAtStart(data);
			return;
		}
		if (pos >= length() + 1) {
			addAtEnd(data);
			return;
		}
		int curPos = 1;
		Node temp = head;
		while (pos != curPos + 1) {
			temp = temp.next;
			curPos++;
		}

		Node temp2 = temp.next;
		Node newNode = new Node(data);
		temp.next = newNode;
		newNode.next = temp2;
	}

	public static void deleteAtEnd() {
		if (head == null) {
			System.out.println("No element to delete!");
			return;
		}
		if (head.next == null) {

			System.out.println("Element: " + head.data + " deleted Successfully!");
			head = null;
			return;
		}
		Node temp = head;

		while (temp.next.next != null) {
			temp = temp.next;
		}
		System.out.println("Element: " + temp.next.data + " deleted Successfully!");
		temp.next = null;
	}

	public static void deleteAtStart() {
		if (head == null) {
			System.out.println("No element to delete!");
			return;
		}
		if (head.next == null) {
			System.out.println("Element: " + head.data + " deleted Successfully!");
			head = null;
			return;
		}
		System.out.println("Element: " + head.data + " deleted Successfully!");
		head = head.next;
	}

	public static void deleteByElement(int element) {
		if (head == null) {
			System.out.println("No element to delete!");
			return;
		}
		//if element at start
		if (head.data == element) {
			System.out.println("Element: " + head.data + " deleted successfully!");
			head = head.next;
			return;
		}

		Node temp = head;

		while (temp.next != null) {
			if (temp.next.data == element) {
				System.out.println("Element: " + temp.next.data + " deleted successfully!");
				temp.next = temp.next.next;
				return;
			}
			temp = temp.next;
		}

		System.out.println("Element not found!");
	}

}
