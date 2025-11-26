package br.udesc.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Pasto{
    private int id;
    private String nome;
    private String tipoGrama;
    private Date ultimaRocada;
    private Date ultimaSobSemadura;
    private Date ultimaAdubacao;

    public Pasto() {

    }

    public Pasto(String nome, String tipoGrama) {
        this.nome = nome;
        this.tipoGrama = tipoGrama;
        this.ultimaAdubacao = null;
        this.ultimaRocada = null;
        this.ultimaSobSemadura = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.equals("")) {
            this.nome = nome;
            System.out.println("Sucesso ao setar nome");
        } else {
            System.out.println("Erro ao setar nome");
        }
    }

    public String getTipoGrama() {
        return tipoGrama;
    }

    public void setTipoGrama(String tipoGrama) {
        if (!tipoGrama.equals("")) {
            this.tipoGrama = tipoGrama;
            System.out.println("Sucesso ao setar tipo de grama");
        } else {
            System.out.println("Erro ao setar tipo de grama");
        }
    }

    public Date getUltimaRocada() {
        return ultimaRocada;
    }

    public boolean rocar(Date ultimaRocada) {
        if (ultimaRocada != null) {
            this.ultimaRocada = ultimaRocada;
            System.out.println("Sucesso ao setar última roçada");
            return true;
        } else {
            System.out.println("Erro ao setar última roçada");
            return false;
        }
    }

    public Date getUltimaSobSemadura() {
        return ultimaSobSemadura;
    }

    public void setUltimaSobSemadura(Date ultimaSobSemadura) {
        if (ultimaSobSemadura != null) {
            this.ultimaSobSemadura = ultimaSobSemadura;
            System.out.println("Sucesso ao setar última sob semeadura");
        } else {
            System.out.println("Erro ao setar última sob semeadura");
        }
    }

    public Date getUltimaAdubacao() {
        return ultimaAdubacao;
    }

    public void setUltimaAdubacao(Date ultimaAdubacao) {
        if (ultimaAdubacao != null) {
            this.ultimaAdubacao = ultimaAdubacao;
            System.out.println("Sucesso ao setar última adubação");
        } else {
            System.out.println("Erro ao setar última adubção");
        }
    }

    @Override
    public String toString() {
        return "Pasto{" + "id=" + id + ", nome=" + nome + ", tipoGrama=" + tipoGrama + ", ultimaRocada=" + ultimaRocada + ", ultimaSobSemadura=" + ultimaSobSemadura + ", ultimaAdubacao=" + ultimaAdubacao + '}';
    }

}
