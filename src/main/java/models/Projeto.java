package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
@Entity
@Table(name = "projeto")

public class Projeto {
    @Id
    private int id;
    private String descricao;
    private LocalDate datainicio, dataPrevistaFim;

    public Projeto(int id, String descricao, LocalDate datainicio, LocalDate dataPrevistaFim) {
        this.id = id;
        this.descricao = descricao;
        this.datainicio = datainicio;
        this.dataPrevistaFim = dataPrevistaFim;
    }

    public Projeto() {

    }
}