/*Objetivo:    	...
				
				Este codigo fonte sera salvo no arquivo StaticQueue.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        18/05/2019
*/

package controller;

public class StaticQueue {
	public Object[] fila;
	public int pri;
	public int ult;

	public StaticQueue(int n) {
		pri = -1;
		ult = -1;
		fila = new Object[n];
	}

	public boolean isEmpty() {
		if (ult == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (fila.length == ult + 1) {
			return true;
		}
		return false;
	}

	public int getSize() {
		if (isEmpty()) {
			return 0;
		}
		return ult + 1;
	}

	public Object showFront() {
		if (isEmpty()) {
			return null;
		}
		return fila[pri];
	}

	public void enfileirar(Object element) {
		if (isEmpty()) {
			pri = 0;
			ult = 0;
			fila[ult] = element;
		} else if (!isFull()) {
			fila[++ult] = element;
		}
	}

	public Object desenfileirar() {
		if (isEmpty()) {
			return null;
		}
		if (getSize() == 1) {
			ult--;
			return fila[pri--];
		}
		Object temp = fila[pri];
		for (int i = pri; i < ult; i++) {
			fila[i] = fila[i + 1];
		}
		ult--;
		return temp;
	}
}
