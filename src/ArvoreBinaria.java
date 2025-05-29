import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArvoreBinaria {
    public No raiz;
    public String[] valores;

    public void percorrerElementoEsquerda() {
        No aux = this.raiz;
        if (aux == null) {
            System.out.println("A lista se encontra vazia.");
        } else {
            while (aux.getEsquerda() != null) {
                System.out.println(aux.getEsquerda());
                aux = aux.getEsquerda();
            }
            System.out.println(aux.getEsquerda());
        }
    }

    public void percorrerElementoDireita() {
        No aux = this.raiz;
        if (aux == null) {
            System.out.println("A lista se encontra vazia.");
        } else {
            while (aux.getDireita() != null) {
                System.out.println(aux.getDireita());
                aux = aux.getDireita();
            }
            System.out.println(aux.getDireita());
        }
    }


    public int contadorElemento() {
        int contador = 0;
        No aux = this.raiz;
            if (aux.getEsquerda() != null) {
                contador++;
            } else if (aux.getDireita() != null){
                contador++;
            }
        System.out.println("Essa árvore contém: " + contador);
        return contador;
    }

    public void preOrdemRecursivo() {
        No aux = this.raiz;
        System.out.println(aux);
        if (aux == null) {
            System.out.println("Árvore vazia");
        } if (aux.getEsquerda() != null){
            percorrerElementoEsquerda();
        } else if (aux.getDireita() != null){
            percorrerElementoDireita();
        }
    }

    public void emOrdemRecursivo() {
        No aux = this.raiz;
        if (aux == null) {
            System.out.println("Árvore vazia");
        } if (aux.getEsquerda() != null){
            percorrerElementoEsquerda();
            System.out.println(aux);
        } else if (aux.getDireita() != null){
            percorrerElementoDireita();
        }
    }

    public void posOrdemRecursivo() {
        No aux = this.raiz;
        if (aux == null) {
            System.out.println("Árvore vazia");
        } if (aux.getEsquerda() != null){
            percorrerElementoEsquerda();
        } else if (aux.getDireita() != null){
            percorrerElementoDireita();
        }
        System.out.println(aux);
    }

    public void emNivelRecursivo() {
        No aux = this.raiz;
        if (aux == null) {
            System.out.println("Árvore vazia");
        }
        Queue<No> lista = new LinkedList<>();
        lista.add(aux);

        while (!lista.isEmpty()) {
            aux = lista.poll();
            System.out.println(aux);
            if (aux.getEsquerda() != null) {
                lista.add(aux.getEsquerda());
            }
            if (aux.getDireita() != null) {
                lista.add(aux.getDireita());
            }
        }
    }

    public int contarNosFolhaRecursivo(No aux) {
        if (aux == null) {
            return 0;
        }
        if (aux.getEsquerda() == null && aux.getDireita() == null) {
            return 1;
        }
        return contarNosFolhaRecursivo(aux.getEsquerda()) + contarNosFolhaRecursivo(aux.getDireita());
    }


    public void contarNosFolhaIterativo() {
        if (raiz == null) {
            return;
        }

        Stack<No> pilha = new Stack<>();
        pilha.push(raiz);
        int contador = 0;

        while (!pilha.isEmpty()) {
           No atual = pilha.pop();
            System.out.println(pilha);

            if (atual.getEsquerda() == null && atual.getDireita() == null) {
                contador++;
            }
            if (atual.getDireita() != null) {
                pilha.push(atual.getDireita());
            }
            if (atual.getEsquerda() != null) {
                pilha.push(atual.getEsquerda());
            }
        }
    }

}
