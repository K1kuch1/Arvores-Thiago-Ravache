public class ArvoreBinaria {
    public No raiz;
    public String[] valores;
    public ArvoreBinaria(No raiz) {
        this.raiz = raiz;
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

    public void preOrdem() {
        No aux = this.raiz;
        if (aux == null) {
            System.out.println("Árvore vazia");
        }
        if (aux != null) {
            System.out.println(aux);
        } if (aux.getEsquerda() != null){
            aux.getEsquerda();
        } else if (aux.getDireita() != null){
            aux.getDireita();
        }
    }

    public void emOrdem() {
        No aux = this.raiz;
        if (aux == null) {
            System.out.println("Árvore vazia");
        }
        if (aux.getEsquerda() != null) {
            aux.getEsquerda();
        } else if (aux.getDireita() != null) {
            aux.getDireita();
        }
    }
}
