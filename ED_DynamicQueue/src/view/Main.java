/*Objetivo:    	...
				
				Este codigo fonte sera salvo no arquivo Main.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        18/05/2019
*/

package view;

import javax.swing.JOptionPane;

import controller.DynamicQueue;
import controller.EmptyQueueException;

public class Main {
	public static void main(String[] args) {
		DynamicQueue fila = new DynamicQueue();
		int opc = 0;
		String op = "";
		while (opc != 9) {
			opc = Integer.parseInt(
					JOptionPane.showInputDialog("----- Menu Principal -----" + "\n1 - Adicionar elemento na fila"
							+ "\n2 - Remover elemento na fila" + "\n3 - Mostrar elemento do topo"
							+ "\n4 - Verificar se lista esta vazia" + "\n5 - Verificar tamanho da fila"
							+ "\n6 - Imprimir e remover todos os elementos" + "\n9 - Sair"));

			switch (opc) {
			case 1:
				op = JOptionPane.showInputDialog("Digite o elemento que deseja adicionar");
				fila.enqueue(op);
				break;

			case 2:
				if (fila.isEmpty() == true) {
					JOptionPane.showMessageDialog(null, "Lista Vazia! Adicione elementos!");
				} else {
					try {
						fila.dequeue();
					} catch (EmptyQueueException e) {
						e.printStackTrace();
					}
					JOptionPane.showMessageDialog(null, "Removido!");
				}
				break;

			case 3:
				if (fila.isEmpty() == true) {
					JOptionPane.showMessageDialog(null, "Lista vazia! Adicione elementos!");
				} else {
					try {
						System.out.println(fila.showFront());
					} catch (EmptyQueueException e) {
						e.printStackTrace();
					}
				}
				break;

			case 4:
				if (fila.isEmpty() == true) {
					System.out.println("Lista vazia!");
				} else {
					System.out.println("Lista nao esta vazia!");
				}
				break;

			case 5:
				System.out.println("Tamanho da fila: " + fila.getSize());
				break;

			case 6:
				if (fila.isEmpty() == true) {
					System.out.println("Fila vazia! Adicione elementos!");
				} else {
					System.out.print("A fila: ");
					while (fila.isEmpty() != true) {
						try {
							System.out.print(fila.showFront() + " ");
							fila.dequeue();
						} catch (EmptyQueueException e) {
							e.printStackTrace();
						}
					}
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
