package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="table_process_ready")
public class ReadyProcess {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long ID;
    private String name;
    private Integer ANM;
    private String cliente;
    private Long id_process;

    public ReadyProcess(Long process, String name, Integer ANM, String cliente) {
        this.name = name;
        this.id_process = process;
        this.ANM = ANM;
        this.cliente = cliente;
    }

    public ReadyProcess(){}

    public Long getId_process() {
        return id_process;
    }
    public void setId_process(Long process) {
        this.id_process = process;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public Integer getANM() {
        return ANM;
    }

    public void setANM(Integer aNM) {
        ANM = aNM;
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

    public void setID(Long ID) {
        this.ID = ID;
    }
}
