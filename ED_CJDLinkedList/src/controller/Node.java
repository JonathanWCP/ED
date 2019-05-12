package controller;

public class Node {
	private int element;
	private Node next;
	private Node previous;
	
	public Node (int element, Node next, Node previous) {
		this.element = element;
		this.next = next;
		this.previous = previous;
	}
	
	public Node(int element) {
		this(element, null, null);
	}
	
	public int getElement() {
		return element;
	}
	
	public Node getNext() {
		return next;
	}
	
	public Node getPrevious() {
		return previous;
	}
	
	public void setElement(int newElement) {
		element = newElement;
	}
	
	public void setNext(Node newNext) {
		next = newNext;
	}

	public void setPrevious(Node newPrevious) {
		previous = newPrevious;
	}
}
