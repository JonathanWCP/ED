/*Objetivo:    	...
				
				Este codigo fonte sera salvo no arquivo Main.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        18/05/2019
*/

package view;

import javax.swing.JOptionPane;

import controller.StaticQueue;

public class Main {
	public static void main(String[] args) {
		StaticQueue fila = new StaticQueue(5);
		int opc = 0;
		Object op;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("----- Menu Principal ----- "
					+ "\n1 - Adicionar elemento" + "\n2 - Remover elemento do topo" + "\n3 - Exibir topo"
					+ "\n4 - Verificar se lista esta cheia" + "\n5 - Verificar se lista esta vazia"
					+ "\n6 - Imprimir e remover todos os elementos" + "\n9 - Sair"));
			switch (opc) {
			case 1:
				op = JOptionPane.showInputDialog("Digite o elemento para inserir na fila");
				fila.enfileirar(op);
				break;

			case 2:
				fila.desenfileirar();
				JOptionPane.showMessageDialog(null, "Removido!");
				break;

			case 3:
				System.out.println(fila.showFront());
				break;

			case 4:
				if (fila.isFull() == true) {
					System.out.println("Lista cheia!");
				} else {
					System.out.println("Lista nao esta cheia!");
				}
				break;

			case 5:
				if (fila.isEmpty() == true) {
					System.out.println("Lista vazia!");
				} else {
					System.out.println("Lista nao esta vazia!");
				}
				break;

			case 6:
				if (fila.isEmpty() == true) {
					System.out.println("Fila vazia! Adicione elementos");
				} else {
					System.out.print("A fila: ");
					while (!fila.isEmpty()) {
						System.out.print(fila.showFront() + " ");
						fila.desenfileirar();
					}
				}
				break;

			case 9:
				System.exit(0);

			default:
				JOptionPane.showMessageDialog(null, "Opcao invalida!");
				break;
			}
		}
	}
}