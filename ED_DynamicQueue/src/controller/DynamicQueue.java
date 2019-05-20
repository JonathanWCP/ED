/*Objetivo:    	...
				
				Este codigo fonte sera salvo no arquivo DynamicQueue.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        18/05/2019
*/

package controller;

public class DynamicQueue {
	private Node pri;
	private Node ult;

	public DynamicQueue() {
		pri = null;
		ult = null;
	}

	public boolean isEmpty() {
		return pri == null;
	}

	public int getSize() {
		int size = 0;
		Node current = pri;
		while (current != null) {
			size++;
			current = current.getNext();
		}
		return size;
	}
	
	public String showFront() throws EmptyQueueException {
		if (isEmpty()) {
			throw new EmptyQueueException();
		}
		return pri.getElement();
	}
	
	public void enqueue(String element) {
		if (ult == null) {
			Node novo = new Node (element);
			pri = novo;
			ult = novo;
		} else {
			Node novo = new Node(element);
			ult.setNext(novo);
			ult = novo;
		}
	}
	
	public String dequeue() throws EmptyQueueException {
		if (isEmpty()) {
			throw new EmptyQueueException();
		}
		
		if (pri == ult) {
			String temp = pri.getElement();
			pri = null;
			ult = null;
			return temp;
		} else {
			String temp = pri.getElement();
			pri = pri.getNext();
			return temp;
		}
	}
}
