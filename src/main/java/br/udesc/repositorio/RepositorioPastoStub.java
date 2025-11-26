package br.udesc.repositorio;

import br.udesc.entidades.Pasto;

import java.util.ArrayList;

public class RepositorioPastoStub {
        private ArrayList<Pasto> pastosCadastrados;

        public RepositorioPastoStub() {
            pastosCadastrados = new ArrayList<>();
        }

        public boolean gravarPasto(Pasto pasto) {
            if(!pasto.getTipoGrama().equals("") && !pasto.getNome().equals("")) {
                return pastosCadastrados.add(pasto);
            }else{
                return false;
            }
        }

        public ArrayList<Pasto> listar() {
            return pastosCadastrados;
        }
    }
