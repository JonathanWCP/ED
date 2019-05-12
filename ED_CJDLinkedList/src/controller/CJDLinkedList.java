/*Objetivo:    	Implemente sobre a lista circular duplamente encadeada os seguintes metodos:
			 	isEmpty(), getFirst(), getLast(),
				insertFirst(), insertLast(), removeFirst(), removeLast(), show().

                Este codigo fonte sera salvo no arquivo CJDLinkedList.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        12/05/2019
*/
package controller;

public class CJDLinkedList {
	private Node head;
	private Node tail;
	private long size;

	public CJDLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public Node getFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		return head;
	}

	public Node getLast() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		return tail;
	}

	public long getSize() {
		return size;
	}

	public void insertFirst(Node newNode) {
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
			size++;
		} else {
			newNode.setNext(head);
			newNode.setPrevious(tail);
			head = newNode;
			size++;
			if (size == 1) {
				tail = head;
			}
		}
	}

	public void insertLast(Node newNode) {
		if (isEmpty()) {
			insertFirst(newNode);
		} else {
			tail.setNext(newNode);
			newNode.setPrevious(tail);
			tail = newNode;
			size++;
		}
	}

	public Node removeFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		} else if (head == tail) {
			return head = tail = null;
		} else {
			Node removedItem = head;
			head.getNext().setPrevious(tail);
			head = head.getNext();
			size--;
			return removedItem;
		}
	}

	public Node removeLast() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		} else {
			Node current = head;
			while (current.getNext() != tail) {
				current = current.getNext();
			}
			Node removedItem = current.getNext();
			tail.getPrevious().setNext(head);
			tail = tail.getPrevious();
			size--;
			return removedItem;
		}
	}

	public void show() {
		if (isEmpty()) {
			System.out.println("Lista vazia!");
		} else {
			System.out.print("A lista: ");
			Node current = head;
			int atual = 0;
			if (size == 1) {
				System.out.print(head.getElement());
			} else {
				while (atual < getSize()) {
					System.out.print(" " + current.getElement());
					current = current.getNext();
					atual++;
				}
				System.out.print("\n");
			}
		}
	}
}
