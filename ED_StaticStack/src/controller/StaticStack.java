/*Objetivo:    	...
				
				Este codigo fonte sera salvo no arquivo StaticStack.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        12/05/2019
*/

package controller;

public class StaticStack {
	private Object[] pilha;
	private int topo;

	public StaticStack(int n) {
		topo = -1;
		pilha = new Object[n];
	}

	public boolean isEmpty() {
		if (topo == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (pilha.length == topo + 1) {
			return true;
		}
		return false;
	}

	public int getSize() {
		return topo + 1;
	}
	
	public Object showTop() {
		if (isEmpty()) {
			return null;
		} else {
			return pilha[topo];
		}
	}
	
	
	public void empilhar(Object element) { //push
		if (topo < pilha.length-1) {
			pilha[++topo] = element;
		} else {
			System.out.println("Pilha cheia!");
		}
	}
	
	public Object desempilhar() { //pop
		if (isEmpty()) {
			return null; 
		} else {
			return pilha[topo--];
		}
	}
	
	
}
