package br.udesc.repositorio;

import br.udesc.entidades.Animal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class RepositorioAnimalStub {
    private ArrayList<Animal> animaisBaixados;
    private ArrayList<Animal> animaisCadastrados;

    public RepositorioAnimalStub() {
        animaisBaixados = new ArrayList<>();
        animaisCadastrados = new ArrayList<>();
    }

    public boolean gravarAnimal(Animal animal) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate nasc = LocalDate.parse(animal.getDataNascAnimal(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        if((animal.getSexoAnimal().equalsIgnoreCase("macho") || animal.getSexoAnimal().equalsIgnoreCase("fêmea")) && String.valueOf(animal.getNumeroAnimal()).length() == 6 && !animal.getRacaAnimal().equals("") && !nasc.isAfter(dataAtual)) {
            return animaisCadastrados.add(animal);
        }else{
            return false;
        }
    }

    public boolean excluirAnimal(Animal animal) {
        if(animal != null){
            return animaisCadastrados.remove(animal);
        }else{
            return false;
        }
    }

    public boolean baixarAnimal(Animal animal) {
        if(animal != null){
            return animal.setBaixado(true);
        }else{
            return false;
        }
    }

    public ArrayList<Animal> listarAnimais() {
        return animaisCadastrados;
    }

    public ArrayList<Animal> listarAnimaisBaixados() {
        for(Animal animal : animaisCadastrados){
            if(animal.isBaixado() == true){
                animaisBaixados.add(animal);
            }
        }
        return animaisBaixados;
    }
}
