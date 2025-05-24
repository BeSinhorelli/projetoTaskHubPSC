package models;

import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

import java.time.LocalDate;
@Entity
@Table
public class Tarefa {
    @Id
    private int id;
    private String nome, prioridade, status;
    private LocalDate dataVencimento, dataConclusao;

    @ManyToOne
    @JoinColumn(name = "id_projeto")
    private Projeto projeto;

    @ManyToOne
    @JoinColumn(name = "id_responsavel")
    private Usuario responsavel;

    public Tarefa(int id, String nome, String prioridade, String status, LocalDate dataVencimento, LocalDate dataConclusao, Projeto projeto, Usuario responsavel) {
        this.id = id;
        this.nome = nome;
        this.prioridade = prioridade;
        this.status = status;
        this.dataVencimento = dataVencimento;
        this.dataConclusao = dataConclusao;
        this.projeto = projeto;
        this.responsavel = responsavel;
    }

}
