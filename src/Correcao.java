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
}
