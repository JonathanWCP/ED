/* Objetivo:    Considerando que a lista encadeada/ligada tenha apenas a variável
				head para o primeiro elemento, como apresentado abaixo,
				implemente as operações isEmpty(), getFirst(), getLast(),
				insertFirst(), insertLast(), removeFirst(), removeLast(), show(). 

                Este codigo fonte sera salvo no arquivo JLinkedList.java

   Programador: Jonathan Willian Castro Pinheiro
   Data:        12/05/2019
*/

package controller;
public class JLinkedList {
	protected Node head; 		//node cabeca da lista
	protected long size;		//numero de nodes na lista
	
	//construtor padrao que cria uma lista vazia (null)
	public JLinkedList() {
		head = null;
		size = 0;
	}
	
	//verifica se a lista esta vazia
	public boolean isEmpty() {
		return head == null;
	}
	
	//retorna o primeiro elemento da lista sem remove-lo
	public Node getFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		return head;
	}
	
	//retorna o ultimo elemento da lista sem remove-lo
	public Node getLast() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		return current;
	}
	
	//inserir elementos na lista
	
	//inserir no comeco da lista
	public void insertFirst(Node novoNode) {
		novoNode.setNext(head); 
		head = novoNode;
		size++;
	}
	
	//inserir no fim da lista
	public void insertLast(Node newNode) {
		if (isEmpty()) {
			insertFirst(newNode);
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			newNode.setNext(null);
			current.setNext(newNode);
			size++;
		}
	}
	
	//remover elementos da lista
	
	//remover o primeiro elemento da lista
	public Node removeFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		Node removedItem = head;
		if (size == 1) {
			head = null;
		} else {
			head = head.getNext();
		}
		size--;
		return removedItem;
			
	}
	
	//remover o ultimo elemento da lista
	public Node removeLast() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		Node removedItem = head;
		if (size == 1) {
			head = null;
		} else {
			Node current = head;
			while (current.getNext().getNext() != null) {
				current = current.getNext();
			}
			removedItem = current.getNext();
			current.setNext(null);
		}
		size --;
		return removedItem;
		}
	
	
	//exibe a lista
	public void show() {
		if (isEmpty()) {
			System.out.print("Lista vazia!"); 
		} else {
			System.out.print("A lista: ");
			Node current = head;
			while (current != null) {
				System.out.print(current.getElement().toString() + " ");
				current = current.getNext();
			}
			System.out.println("\n");
		}
	}
}
