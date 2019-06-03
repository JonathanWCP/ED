/*Objetivo:    	Implemente uma operaçao/metodo para buscar um
				determinado elemento em um arvore binaria de busca,
				retornando true se encontrar e false caso contrario.
				
				Este codigo fonte sera salvo no arquivo Main.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        02/06/2019
*/

package view;

import javax.swing.JOptionPane;

import controller.BinaryTree;

public class Main {
	public static void main(String[] args) {
		BinaryTree arvore = new BinaryTree();
		int opc = 0, op = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("----- Menu Principal -----" + "\n1 - Inserir elemento"
					+ "\n2 - Imprimir arvore" + "\n3 - Imprimir (Pre-ordem)" + "\n4 - Imprimir (In-ordem)"
					+ "\n5 - Imprimir (Pos-ordem" + "\n6 - Preenche Arvore" + "\n7 - Busca Elemento" + "\n9 - Sair"));
			switch (opc) {
			case 1:
				op = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser inserido na arvore"));
				arvore.inserir(arvore.raiz, op);
				break;

			case 2:
				System.out.println(arvore.printTree(arvore.raiz));
				break;

			case 3:
				System.out.print("Pre-ordem: ");
				arvore.preOrdem(arvore.raiz);
				System.out.print("\n");
				break;

			case 4:
				System.out.print("In-ordem: ");
				arvore.inOrdem(arvore.raiz);
				System.out.print("\n");
				break;

			case 5:
				System.out.print("Pos-ordem: ");
				arvore.posOrdem(arvore.raiz);
				System.out.print("\n");
				break;

			case 6:
				arvore.preencheArvore();
				break;

			case 7:
				op = Integer.parseInt(JOptionPane.showInputDialog("Digite elemento a ser buscado"));
				boolean result = arvore.haveElement(arvore.raiz, op);
				if (result == true) {
					System.out.println("Elemento encontrado!");
				} else {
					System.out.println("Elemento nao encontrado!");
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
