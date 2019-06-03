/*Objetivo:    	Implemente uma operaçao/metodo para buscar um
				determinado elemento em um arvore binaria de busca,
				retornando true se encontrar e false caso contrario.
				
				Este codigo fonte sera salvo no arquivo BinaryTree.java
   Programador: Jonathan Willian Castro Pinheiro
   Data:        02/06/2019
*/

package controller;

import javax.swing.JOptionPane;

public class BinaryTree {
	public Node raiz;

	public BinaryTree() {
		raiz = null;
	}

	public void inserir(Node p, int valor) {
		if (raiz == null) {
			raiz = new Node(valor, null, null);
		} else if (valor <= p.element) {
			if (p.esq != null) {
				inserir(p.esq, valor);
			} else {
				p.esq = new Node(valor, null, null);
			}
		} else if (valor >= p.element) {
			if (p.dir != null) {
				inserir(p.dir, valor);
			} else {
				p.dir = new Node(valor, null, null);
			}
		}
	}

	public String printTree(Node p) {
		String retorno;
		retorno = "(";
		if (p != null) {
			retorno += " " + p.element + " ";
			retorno += printTree(p.esq);
			retorno += printTree(p.dir);
		}
		retorno = retorno + ") ";
		return retorno;
	}

	public void preencheArvore() {
		inserir(raiz, 50);
		inserir(raiz, 40);
		inserir(raiz, 35);
		inserir(raiz, 45);
		inserir(raiz, 60);
		inserir(raiz, 55);
		inserir(raiz, 65);
		JOptionPane.showMessageDialog(null,
				"Arvore Preenchida! \n( 50 ( 40 ( 35 () () ) ( 45 () () ) ) ( 60 ( 55 () () ) ( 65 () () ) ) )");
	}

	public void preOrdem(Node p) {
		if (p != null) {
			System.out.print(p.element + " ");
			preOrdem(p.esq);
			preOrdem(p.dir);
		}
	}

	public void preOrdemIterativo(Node p) {
		Node aux = p;
		do {
			System.out.print(aux.element);
			if (aux.dir != null && aux.esq != null) {
				System.out.print(aux.esq.element);
				System.out.print(aux.element);
				System.out.print(aux.dir.element);
			} else {
				aux = aux.dir;
			}

		} while (p != null);
	}

	public void inOrdem(Node p) {
		if (p != null) {
			inOrdem(p.esq);
			System.out.print(p.element + " ");
			inOrdem(p.dir);
		}
	}

	public void posOrdem(Node p) {
		if (p != null) {
			posOrdem(p.esq);
			posOrdem(p.dir);
			System.out.print(p.element + " ");
		}
	}

	public boolean haveElement(Node p, int valor) {
		try {
			if (valor == p.element) {
				return true;
			} else if (valor > p.element) {
				if (p.dir == null) {
					return false;
				} else {
					return haveElement(p.dir, valor);
				}
			} else {
				if (p.esq == null) {
					return false;
				} else {
					return haveElement(p.esq, valor);
				}
			}
		} catch (NullPointerException n) {
			System.out.println("Arvore vazia!");
			return false;
		}
	}
}
