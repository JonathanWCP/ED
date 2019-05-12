/* Objetivo:    Considerando que a lista encadeada/ligada tenha apenas a variável
				head para o primeiro elemento, como apresentado abaixo,
				implemente as operações isEmpty(), getFirst(), getLast(),
				insertFirst(), insertLast(), removeFirst(), removeLast(), show(). 

                Este codigo fonte sera salvo no arquivo Main.java

   Programador: Jonathan Willian Castro Pinheiro
   Data:        12/05/2019
*/

package view;

import javax.swing.JOptionPane;

import controller.JLinkedList;
import controller.Node;
import controller.UnderflowException;

public class Main {

	public static void main(String[] args) {
		JLinkedList  lista = new JLinkedList();
		int opc = 0; 
		String op = "";
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("----- Menu Principal -----"
					+ "\n1 - Inserir elemento no inicio"
					+ "\n2 - Inserir elemento no final"
					+ "\n3 - Remover elemento do inicio"
					+ "\n4 - Remover elemento do final"
					+ "\n5 - Verificar elementos da lista"
					+ "\n9 - Sair"));
			switch (opc) {
			case 1:
				op = JOptionPane.showInputDialog("Digite o conteudo para inserir na lista");
				lista.insertFirst(new Node(op));
				JOptionPane.showMessageDialog(null, "Inserido!", null, JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case 2:
				op = JOptionPane.showInputDialog("Digite o conteudo para inserir na lista");
				lista.insertLast(new Node(op));
				JOptionPane.showMessageDialog(null, "Inserido!", null, JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case 3:
				try {
					lista.removeFirst();
				} catch (UnderflowException e1) {
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Removido!", null, JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case 4:
				try {
					lista.removeLast();
				} catch (UnderflowException e) {
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Removido!", null, JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case 5:
				lista.show();
				break;
				
			case 9:
				System.exit(0);
				
			default:
				JOptionPane.showMessageDialog(null, "Opcao invalida!", null, JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}

