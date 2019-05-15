/*Objetivo:    	...
				
				Este codigo fonte sera salvo no arquivo DynamicStack.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        12/05/2019
*/

package controller;

public class DynamicStack {
	private Node topo;
	private int size;

	public DynamicStack() {
		topo = null;
		size = 0;
	}

	public boolean isEmpty() {
		return topo == null;
	}

	public int getSize() {
		return size;
	}

	public String showTop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return topo.getElement();
	}
	
	public void push(String element) {
		Node novo = new Node(element, topo);
		topo = novo;
		size++;
	}
	
	public String pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException();
		} else {
			String temp = topo.getElement();
			topo = topo.getNext(); //desencadeira o node topo
			size--;
			return temp;
		}
	}
	
}
