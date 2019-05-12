/*Objetivo:    	Implemente sobre a lista circular simplesmente encadeada os seguintes metodos:
				isEmpty(), getFirst(), getLast(),
				insertFirst(), insertLast(), removeFirst(), removeLast(), show().

                Este codigo fonte sera salvo no arquivo Node.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        12/05/2019
*/
package controller;

public class Node {
	private String element;
	private Node next;
	
	public Node (String element, Node next) {
		this.element = element;
		this.next = next;
	}
	
	public Node (String element) {
		this(element, null);
	}
	
	public String getElement() {
		return element;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setElement(String newElement) {
		element = newElement;
	}
	
	public void setNext(Node newNext) {
		next = newNext;
	}

}
