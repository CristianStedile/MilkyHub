package br.udesc.entidades;

public class Medicacao{
    private int id;
    private String nomeMedicacao;
    private String dosagem;
    private int estoque;

    public Medicacao(){
    
    }

    public Medicacao(int id, String nomeMedicacao, String dosagem, int estoque) {
        this.id = id;
        this.nomeMedicacao = nomeMedicacao;
        this.dosagem = dosagem;
        this.estoque = estoque;
    }

    public int getEstoque() {
        return estoque;
    }
    public boolean atualizarEstoque(int estoque){
        if(estoque >= 0) {
            this.estoque = estoque;
            return true;
        }else {
            System.out.println("Erro ao atualizar estoque");
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeMedicacao() {
        return nomeMedicacao;
    }

    public void setNomeMedicacao(String nomeMedicacao) {
        this.nomeMedicacao = nomeMedicacao;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    @Override
    public String toString() {
        return "Medicacao{" + "id=" + id + ", nomeMedicacao=" + nomeMedicacao + ", dosagem=" + dosagem + '}';
    }

    
}
