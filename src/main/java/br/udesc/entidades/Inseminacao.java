package br.udesc.entidades;

public class Inseminacao {
    private Animal animal;
    private String semen;
    private String data;

    public Inseminacao(Animal animal, String semen, String data) {
        this.animal = animal;
        this.semen = semen;
        this.data = data;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getSemen() {
        return semen;
    }

    public void setSemen(String semen) {
        this.semen = semen;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Inseminacao{" +
                "animal=" + animal +
                ", semen='" + semen + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
