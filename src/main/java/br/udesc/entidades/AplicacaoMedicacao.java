package br.udesc.entidades;

public class AplicacaoMedicacao {
    private String dataAplicacao;
    private Animal animal;
    private Medicacao medicacao;
    
    public AplicacaoMedicacao(){
    
    }

    public AplicacaoMedicacao(String dataAplicacao, Animal animal, Medicacao medicacao) {
        this.dataAplicacao = dataAplicacao;
        this.animal = animal;
        this.medicacao = medicacao;
        medicacao.atualizarEstoque(medicacao.getEstoque()-1);
    }

    public String getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(String dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Medicacao getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(Medicacao medicacao) {
        this.medicacao = medicacao;
    }

    @Override
    public String toString() {
        return "aplicacaoMedicacao{" + ", dataAplicacao=" + dataAplicacao + ", animal=" + animal + ", medicacao=" + medicacao + '}';
    }

    
}
