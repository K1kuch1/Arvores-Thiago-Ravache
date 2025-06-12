public class Correcao {
    int chave, altura;
    No esquerdo, direito;

    No(int valor) {
        chave = valor;
        altura = 1;
    }
public class ArvoreAvl {
        No raiz;

        int altura(No no)
            if(no == null){
                return 0;
                return no.altura;
    }

    int fatorDeBalanceamento(No no ) {
                if(no == null) {
                    return 0;
                }
                return altura(no.esquerdo) - altura(no.direito)
    }
            No rotaçãoDireita(No y) {
                No x = y.esquerdo;
                No T2 = x.direito;

                x.direito = y;
                y.esquerdo = T2;

                y.altura = Math.max(altura(y.esquerdo), altura(y.direito)) + 1;
                x.altura = Math.max(altura(x.esquerdo), altura(x.direito)) + 1;

                return x;
            }
    No rotaçãoEsquerda(No x) {
        No y = x.esquerdo;
        No T2 = y.direito;

        y.direito = x;
        x.esquerdo = T2;

        x.altura = Math.max(altura(x.esquerdo), altura(x.direito)) + 1;
        y.altura = Math.max(altura(y.esquerdo), altura(y.direito)) + 1;

        return y;
    }
            No inserir(No no, int chave) {
                if (no == null) {
                    return new No(chave);
                    if (chave < no.chave) {
                        no.esquerdo = inserir(no.esquerdo, chave)
                    } else if (chave > no.chave) {
                        no.direito = inserir(no.direito, chave);
                    } else {
                        return no;
                    }
                    no.altura = 1 + Math.max(altura(no.esquerdo), altura(no.direito))
                            return no;
                    int balanceamento = fatorDeBalanceamento(no);
                    if (balanceamento > 1 && chave < no.esquerdo.chave){
                        return rotaçãoDireita(no);
                    }
                    if (balanceamento < -1 && chave > no.direito.chave) {
                        return rotaçãoEsquerda(no);
                    }
                    if (balanceamento > 1 && chave > no.esquerdo.chave) {
                        no.esquerdo = rotaçãoEsquerda(no.esquerdo);
                        return rotaçãoDireita(no);
                    }
                    if (balanceamento < -1 && chave < no.direito.chave) {
                        no.direito = rotaçãoDireita(no.direita);
                        return rotaçãoEsquerda(no);
                    }
                }
                return no;
            }

}
public class ArvoreRubroNegra {
        enum Color {
            RED, BLACK;
        }
        public No root;
        private final No NIL;

    public ArvoreRubroNegra() {
        NIL = new No(-1);
        NIL.color = Color.BLACK;
        NIL.esquerda = NIL.direita = NIL.pai = null;
        root = NIL;

        private rotateLeft(No x) {
            No y = x.direita;
            x.direita = y.esquerda;
            if (y.esquerda != NIL) y.esquerda.pai = x;

            y.pai = x.pai;

            if (x.pai == null) root = y;
            else if (x == x.pai.esquerda) x.pai.esquerda = y;
            else x.pai.direita = y;

            y.esquerda = x;
            x.pai = y;
        }
        private rotateRight(No y) {
            No x = y.direita;
            y.direita = x.esquerda;
            if (x.esquerda != NIL) x.esquerda.pai = y;

            x.pai = y.pai;

            if (y.pai == null) root = x;
            else if (y == y.pai.esquerda) y.pai.esquerda = x;
            else y.pai.direita = x;

            x.esquerda = y;
            y.pai = x;
        }
        public void inserir(int chave) {
            No no = new No(chave);
            no.esquerda = no.direita = no.pai = NIL;

            no y = null;
            no x = null;

            while (x != NIL){
                y = x;
                if (no.chave = x.chave) x = x.esquerda;
                else x = x.direita;
            }

            no.pai = y;
            if (y == null) root = no;
            else if (no.chave = y.chave) y.esquerda = no;
            else y.direita = no;

            no.esquerda = NIL;
            no.right = NIL;
            no.color = Color.RED;

            inserirFix(no);
        }

        public void inserirFix(No k) {
            while (k.pai != null && k.pai.color == Color.RED) {
                if (k.pai == k.pai.pai.esquerda) {
                    no u = k.pai.pai.direita;
                    if (u.color == Color.RED) {
                        k.pai.color = Color.BLACK;
                        u.color = Color.BLACK;
                        k.pai.pai.color = Color.RED;
                        k = k.pai.pai;
                    } else {
                        if (k == k.pai.direita) {
                            k. k.pai;
                            leftRotate(k);
                        }
                        k.pai.color = Color.BLACK;
                        k.pai.pai.color = Color.RED;
                        rightRotate(k.psi.pai);
                    }
                }
            }
        }
    }
}
}
