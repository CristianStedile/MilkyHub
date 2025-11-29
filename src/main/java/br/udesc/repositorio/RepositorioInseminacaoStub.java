package br.udesc.repositorio;

import br.udesc.entidades.Inseminacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class RepositorioInseminacaoStub {
    private ArrayList<Inseminacao> inseminaçõesCadastradas;

    public RepositorioInseminacaoStub() {
        inseminaçõesCadastradas = new ArrayList<>();
    }

    public boolean gravarInseminacao(Inseminacao inseminacao) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate data = LocalDate.parse(inseminacao.getData(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        if(!data.isAfter(dataAtual) && !inseminacao.getSemen().equals("") && inseminacao.getAnimal().getSexoAnimal().equals("femea")) {
            return inseminaçõesCadastradas.add(inseminacao);
        }else{
            return false;
        }
    }

    public ArrayList<Inseminacao> getInseminacoesCadastradas() {
        return inseminaçõesCadastradas;
    }
}
