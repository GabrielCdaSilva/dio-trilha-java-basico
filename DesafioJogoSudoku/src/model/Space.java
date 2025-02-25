package model;
public class Space {
    private final boolean fixo;
    private Integer atual;
    private final int esperado;

    public Space(int esperado, boolean fixo) {
        this.fixo = fixo;
        this.esperado = esperado;
        if (fixo) {
            atual = esperado;
        }
    }

    public Integer getAtual() {
        return atual;
    }
    public void setAtual(Integer atual) {
        if (fixo) return;

        this.atual = atual;
    }

    public boolean isFixo() {
        return fixo;
    }

    public int getEsperado() {
        return esperado;
    }

    public void limparEspaco(){
        setAtual(null);
    }

    
}
