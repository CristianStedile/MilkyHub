package br.udesc.repositorio;

import br.udesc.entidades.PesoLeite;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class RepositorioPesoLeiteStub {
        private ArrayList<PesoLeite> pesagensCadastradas;

        public RepositorioPesoLeiteStub() {
            pesagensCadastradas = new ArrayList<>();
        }

        public boolean gravarPesagem(PesoLeite pesoLeite) {
            LocalDate dataAtual = LocalDate.now();
            LocalDate data = LocalDate.parse(pesoLeite.getDataPeso(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            if(!data.isAfter(dataAtual) && pesoLeite.getPesagemLeite() >= 0) {
                return pesagensCadastradas.add(pesoLeite);
            }else{
                return false;
            }
        }

        public ArrayList<PesoLeite> getPesagensCadastradas() {
            return pesagensCadastradas;
        }
    }
