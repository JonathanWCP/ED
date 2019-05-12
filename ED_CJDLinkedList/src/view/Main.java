/*Objetivo:    	Implemente sobre a lista circular duplamente encadeada os seguintes metodos:
			 	isEmpty(), getFirst(), getLast(),
				insertFirst(), insertLast(), removeFirst(), removeLast(), show().

                Este codigo fonte sera salvo no arquivo Main.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        12/05/2019
*/
package view;

import javax.swing.JOptionPane;

import controller.CJDLinkedList;
import controller.Node;
import controller.UnderflowException;

public class Main {
	public static void main(String[] args) {
		CJDLinkedList lista = new CJDLinkedList();
		int opc = 0, valor = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("----- Menu Principal -----"
					+ "\n1 - Inserir no comeco da lista" + "\n2 - Inserir no final da lista"
					+ "\n3 - Verificar elementos da lista" + "\n4 - Remover o primeiro elemento"
					+ "\n5 - Remover o ultimo elemento" + "\n8 - Verifica tamanho da lista" + "\n9 - Sair"));
			switch (opc) {
			case 1:
				valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para inserir na lista"));
				lista.insertFirst(new Node(valor));
				break;

			case 2:
				valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para inserir na lista"));
				lista.insertLast(new Node(valor));
				break;

			case 3:
				lista.show();
				break;

			case 4:
				try {
					lista.removeFirst();
				} catch (UnderflowException e) {
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Removido!", null, JOptionPane.INFORMATION_MESSAGE);
				break;

			case 5:
				try {
					lista.removeLast();
				} catch (UnderflowException e) {
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Removido!", null, JOptionPane.INFORMATION_MESSAGE);
				break;

			case 8:
				JOptionPane.showMessageDialog(null, "A lista tem: " + lista.getSize() + " elementos", null,
						JOptionPane.INFORMATION_MESSAGE);
				break;

			case 9:
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, "Opcao invalida!", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}