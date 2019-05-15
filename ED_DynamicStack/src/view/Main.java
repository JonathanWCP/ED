/*Objetivo:    	...
				
				Este codigo fonte sera salvo no arquivo Main.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        12/05/2019
*/

package view;

import javax.swing.JOptionPane;

import controller.DynamicStack;
import controller.EmptyStackException;

public class Main {
	public static void main(String[] args) {
		int opc = 0;
		String op = "";
		DynamicStack pilha = new DynamicStack();
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("----- Menu Principal -----"
					+ "\n1 - Empilhar (push)"
					+ "\n2 - Desempilhar (pop)"
					+ "\n3 - Imprimir elementos (limpa a pilha)"
					+ "\n4 - Verificar se a pilha esta vazia"
					+ "\n9 - Sair", "Digite uma opcao"));
			switch (opc) {
			case 1:
				op = JOptionPane.showInputDialog("Digite o numero que deseja adicionar na pilha");
				pilha.push(op);
				JOptionPane.showMessageDialog(null, "Adicionado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case 2:
				String itemRemovido = "";
				try {
					itemRemovido = pilha.pop();
				} catch (EmptyStackException e) {
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Voce removeu  '" +itemRemovido+"' da lista");
				break;
				
			case 3:
				System.out.print("A Pilha: ");
				while (!pilha.isEmpty()) {
					try {
						System.out.print(" " +pilha.pop());
					} catch (EmptyStackException e) {
						e.printStackTrace();
					}
					System.out.print("\n");
				}
				break;
				
			case 4:
				if (pilha.isEmpty() == true) {
					JOptionPane.showMessageDialog(null, "A Pilha esta vazia!");
				} else {
					JOptionPane.showMessageDialog(null, "A Pilha nao esta vazia!");
				}
				break;
				
			case 9:
				System.exit(0);
				
			default:
				JOptionPane.showMessageDialog(null, "Opcao Invalida!");	
			}
		}
	}
}
