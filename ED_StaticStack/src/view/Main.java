/*Objetivo:    	...
				
				Este codigo fonte sera salvo no arquivo Main.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        12/05/2019
*/

package view;

import javax.swing.JOptionPane;

import controller.StaticStack;

public class Main {
	public static void main(String args[]) {
		StaticStack pilha = new StaticStack(3);
		int opc = 0;
		String op = "";
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("----- Menu Principal -----"
					+ "\n1 - Empilhar (push)"
					+ "\n2 - Desempilhar (pop)" 
					+ "\n3 - Exibir tamanho da pilha"
					+ "\n4 - Exibir elemento do topo"
					+ "\n5 - Verificar se pilha esta vazia"
					+ "\n6 - Verificar se pilha esta cheia" + "\n9 - Sair"));

			switch (opc) {
			case 1:
				op = JOptionPane.showInputDialog("Digite o elemento a ser inserido");
				pilha.empilhar(op);
				break;

			case 2:
				while (pilha.isEmpty() == false) {
					System.out.println(pilha.desempilhar());
				}
				break;

			case 3:
				System.out.println("Tamanho da pilha: " + pilha.getSize());
				break;

			case 4:
				System.out.println("Elemento do topo: " + pilha.showTop());
				break;

			case 5:
				if (pilha.isEmpty() == true) {
					System.out.println("Pilha vazia!");
				} else {
					System.out.println("Pilha nao esta vazia!");
				}
				break;

			case 6:
				if (pilha.isFull() == true) {
					System.out.println("Pilha cheia!");
				} else {
					System.out.println("Pilha nao esta cheia!");
				}
				break;

			case 9:
				System.exit(0);

			default:
				JOptionPane.showMessageDialog(null, "Opcao invalida!", null, JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}
