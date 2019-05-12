/*Objetivo:    	Implemente um método em Java para remover um node, depois de
				uma posição especificada, em uma lista duplamente
				encadeada/ligada (item 8 do menu).

                Este codigo fonte sera salvo no arquivo Node.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        12/05/2019
*/
package controller;

public class Node {
	private String element;
	private Node next;
	private Node previous;
	
	public Node (String element, Node next, Node previous) {
		this.element = element;
		this.next = next;
		this.previous = previous;
	}
	
	public Node (String element) {
		this(element, null, null);
	}
	
	public String getElement() {
		return element;
	}
	
	public Node getNext() {
		return next;
	}
	
	public Node getPrevious() {
		return previous;
	}
	
	public void setElement (String newElement) {
		element = newElement;
	}
	
	public void setNext (Node newNext) {
		next = newNext;
	}
	
	public void setPrevious (Node newPrevious) {
		previous = newPrevious;
	}

}
