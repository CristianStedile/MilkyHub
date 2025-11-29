package br.udesc.repositorio;

import br.udesc.entidades.AplicacaoMedicacao;

import java.util.ArrayList;

;

public class RepositorioAplicacaoMedicacaoStub {
    private ArrayList<AplicacaoMedicacao> aplicacoesCadastradas;

    public RepositorioAplicacaoMedicacaoStub() {
        aplicacoesCadastradas = new ArrayList<>();
    }

    public boolean gravarAplicacao(AplicacaoMedicacao aplicacaoMedicacao) {
        return aplicacoesCadastradas.add(aplicacaoMedicacao);
    }

    public ArrayList<AplicacaoMedicacao> listarAplicacaoMedicacaoFiltradas(int numeroAnimal) {
        ArrayList<AplicacaoMedicacao> aplicacaoMedicacaoFiltradas = new ArrayList<>();
        for(AplicacaoMedicacao ap : listarAplicacoes()){
            if(ap.getAnimal().getNumeroAnimal() ==  numeroAnimal)
                aplicacaoMedicacaoFiltradas.add(ap);
        }
        return aplicacaoMedicacaoFiltradas;
    }

    public ArrayList<AplicacaoMedicacao> listarAplicacoes() {
        return aplicacoesCadastradas;
    }
}
