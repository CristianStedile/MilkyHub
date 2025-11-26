package br.udesc.entidades;

public class Animal{
    private int numeroAnimal;
    private String dataNascAnimal;
    private String racaAnimal;
    private String sexoAnimal;
    private boolean baixado;

    public Animal(){
    
    }
    
    public Animal(int numeroAnimal, String dataNascAnimal, String racaAnimal, String sexoAnimal) {
            this.numeroAnimal = numeroAnimal;
            this.dataNascAnimal = dataNascAnimal;
            this.racaAnimal = racaAnimal;
            this.sexoAnimal = sexoAnimal;
            this.baixado = false;
    }

    public boolean isBaixado() {
        return baixado;
    }

    public boolean setBaixado(boolean baixado) {
        this.baixado = baixado;
        return true;
    }

    public int getNumeroAnimal() {
        return numeroAnimal;
    }

    public void setNumeroAnimal(int numeroAnimal) {
        this.numeroAnimal = numeroAnimal;
    }

    public String getDataNascAnimal() {
        return dataNascAnimal;
    }

    public void setDataNascAnimal(String dataNascAnimal) {
        this.dataNascAnimal = dataNascAnimal;
    }

    public String getRacaAnimal() {
        return racaAnimal;
    }

    public void setRacaAnimal(String racaAnimal) {
        this.racaAnimal = racaAnimal;
    }

    public String getSexoAnimal() {
        return sexoAnimal;
    }

    public void setSexoAnimal(String sexoAnimal) {
        this.sexoAnimal = sexoAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "numeroAnimal=" + numeroAnimal +
                ", dataNascAnimal='" + dataNascAnimal + '\'' +
                ", racaAnimal='" + racaAnimal + '\'' +
                ", sexoAnimal='" + sexoAnimal + '\'' +
                '}';
    }
}
