/*Objetivo:    	...
				
				Este codigo fonte sera salvo no arquivo Node.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        18/05/2019
*/

package controller;

public class Node {
	private String element;
	private Node next;
	
	public Node(String element, Node next) {
		this.element = element;
		this.next = next;
	}
	
	public Node(String element) {
		this(element,null);
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
}
