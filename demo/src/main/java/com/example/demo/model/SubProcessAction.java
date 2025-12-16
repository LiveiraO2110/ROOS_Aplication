package com.example.demo.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="table_sub_process")
public class SubProcessAction {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long ID;
    private Boolean status;
    private LocalDate prazo;
    private Integer limite;

    private String descricao;
    private String obs;

    @ManyToOne
    @JoinColumn(name = "id_process")
    @JsonBackReference("process-sub")
    private ProcessAction process;


    public SubProcessAction(ProcessAction process, String desc, LocalDate prazo, Boolean status, Integer limite) {
        this.process = process;
        this.descricao = desc;
        this.prazo = prazo;
        this.status = status;
        this.limite = limite;
    }

    public SubProcessAction(){}

    public Integer getLimite() {
        return limite;
    }

    public void setLimite(Integer limite) {
        this.limite = limite;
    }
    public Long getID() {
        return ID;
    }
    public void setID(Long iD) {
        ID = iD;
    }

    public ProcessAction getId_process() {
        return process;
    }

    public void setId_process(ProcessAction process) {
        this.process = process;
    }

    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public LocalDate getPrazo() {
        return prazo;
    }
    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }
    public String getDesc() {
        return descricao;
    }
    public void setDesc(String desc) {
        this.descricao = desc;
    }
    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
