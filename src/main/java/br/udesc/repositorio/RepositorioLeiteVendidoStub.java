package br.udesc.repositorio;

import br.udesc.entidades.LeiteVendido;

import java.util.ArrayList;

public class RepositorioLeiteVendidoStub {
    private ArrayList<LeiteVendido> vendas;

    public RepositorioLeiteVendidoStub() {
        vendas = new ArrayList<>();
    }

    public boolean gravarVenda(LeiteVendido leiteVendido) {
        if(leiteVendido != null) {
            return vendas.add(leiteVendido);
        }else{
            return false;
        }
    }

    public ArrayList<LeiteVendido> listarVendasFiltradas(String mesAno) {
        ArrayList<LeiteVendido> vendasFiltradas = new ArrayList<>();
        for (LeiteVendido leiteVendido : vendas) {
            if(leiteVendido.getData().substring(3).equals(mesAno)){
                vendasFiltradas.add(leiteVendido);
            }
        }
        return vendasFiltradas;
    }

    public ArrayList<LeiteVendido> listarVendas() {
        return vendas;
    }
}
