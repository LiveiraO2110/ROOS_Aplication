package com.example.demo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "table_process")
public class ProcessAction implements Comparable<ProcessAction> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private Boolean status;
    private String name;
    private Integer anm;
    private String cliente;
    private LocalDate prazo;

    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private TypeProcess typeProcess;

    @OneToMany(mappedBy = "process")
    private List<SubProcessAction> subprocesses = new ArrayList<>();

    @OneToMany(mappedBy = "process")
    private List<UserProcess> userProcesses = new ArrayList<>();


    public ProcessAction(TypeProcess typeProcess, Boolean status, String name,
                         Integer anm, String cliente, LocalDate prazo) {
        this.typeProcess = typeProcess;
        this.status = status;
        this.name = name;
        this.anm = anm;
        this.cliente = cliente;
        this.prazo = prazo;
    }

    public ProcessAction(){}
    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public Integer getAnm() {
        return anm;
    }

    public void setAnm(Integer anm) {
        this.anm = anm;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Long getID() {
        return ID;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    public List<UserProcess> getUserProcesses() {
        return userProcesses;
    }

    public void setUserProcesses(List<UserProcess> userProcesses) {
        this.userProcesses = userProcesses;
    }
    public List<SubProcessAction> getSubprocesses() {
        return subprocesses;
    }

    public void setSubprocesses(List<SubProcessAction> subprocesses) {
        this.subprocesses = subprocesses;
    }

    public TypeProcess getTypeProcess() {
        return typeProcess;
    }

    public void setTypeProcess(TypeProcess typeProcess) {
        this.typeProcess = typeProcess;
    }

    @Override
    public int compareTo(ProcessAction that) {
        if (this.prazo.isBefore(that.prazo)) {
            return -1;
        } else if (this.prazo.isAfter(that.prazo)) {
            return 1;
        } else {
            return 0;
        }
    }
}
