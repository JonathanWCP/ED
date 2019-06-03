/*Objetivo:    	...
				
				Este codigo fonte sera salvo no arquivo Node.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        02/06/2019
*/

package controller;

public class Node {
	public int element;
	public Node esq;
	public Node dir;
	
	public Node (int element, Node esq, Node dir) {
		this.element = element;
		this.esq = esq;
		this.dir = dir;
	}
}
