package br.udesc.entidades;

public class PesoLeite {
    private double pesagemLeite;
    private String dataPeso;
    private Animal animal;
    
    
    public PesoLeite(){
    
    }

    public PesoLeite(double pesagemLeite, String dataPeso, Animal animal) {
        if(pesagemLeite > 30){
            this.pesagemLeite = 30;
        }else {
            this.pesagemLeite = pesagemLeite;
        }
        this.dataPeso = dataPeso;
        this.animal = animal;
    }

    public double getPesagemLeite() {
        return pesagemLeite;
    }

    public void setPesagemLeite(double pesagemLeite) {
        this.pesagemLeite = pesagemLeite;
    }

    public String getDataPeso() {
        return dataPeso;
    }

    public void setDataPeso(String dataPeso) {
        this.dataPeso = dataPeso;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "pesoLeite{" +
                "pesagemLeite=" + pesagemLeite +
                ", dataPeso='" + dataPeso + '\'' +
                ", animal=" + animal +
                '}';
    }
}
