package br.udesc.entidades;

public class LeiteVendido{
    private int id;
    private double leiteVendido;
    private String data;
    
    public LeiteVendido(){
    
    }

    public LeiteVendido(double leiteVendido, String data) {
        this.id = id;
        this.leiteVendido = leiteVendido;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLeiteVendido() {
        return leiteVendido;
    }

    public void setLeiteVendido(double leiteVendido) {
        this.leiteVendido = leiteVendido;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\n"+"LeiteVendido{" +
                ", leiteVendido=" + leiteVendido +
                ", data='" + data + '\'' +
                '}';
    }
}
