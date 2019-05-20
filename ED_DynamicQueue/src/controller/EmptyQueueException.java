/*Objetivo:    	...
				
				Este codigo fonte sera salvo no arquivo EmptyQueueException.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        18/05/2019
*/

package controller;

public class EmptyQueueException extends Exception{
	private static final long serialVersionUID = 1L;
	public String toString() {
		return "EMPTY QUEUE!";
	}
}
