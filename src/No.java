public class No {
    String conteudo;
    private No esquerda;
    private No direita;
    private int fatorDeBalanceamento;
    private Correcao.ArvoreRubroNegra.Color color;
    private No pai;
    int chave;

    public No(int chave) {
        this.chave = chave;
        this.conteudo = conteudo;
        this.esquerda = null;
        this.direita = null;
        this.fatorDeBalanceamento = 0;
        this.color = Correcao.ArvoreRubroNegra.Color.RED;
        this.pai = null;
    }

    public int getFatorDeBalanceamento() {
        return fatorDeBalanceamento;
    }

    public void setFatorDeBalanceamento(int fatorDeBalanceamento) {
        this.fatorDeBalanceamento = fatorDeBalanceamento;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }
}
