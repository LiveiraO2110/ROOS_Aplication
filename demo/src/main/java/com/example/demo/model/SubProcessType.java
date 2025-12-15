package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="table_sub_process_type")
public class SubProcessType {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long ID;
    private String descricao;
    private Integer limite;

    @ManyToOne
    @JoinColumn(name="id_type")
    private TypeProcess typeProcess;

    public SubProcessType(TypeProcess type, String desc, Integer limite) {
        this.typeProcess = type;
        this.descricao = desc;
        this.limite = limite;
    }

    public SubProcessType(){}

    public TypeProcess getTypeProcess() {
        return typeProcess;
    }

    public void setTypeProcess(TypeProcess typeProcess) {
        this.typeProcess = typeProcess;
    }
    public Long getID() {
        return ID;
    }
    public void setID(Long iD) {
        ID = iD;
    }
    public TypeProcess getId_type() {
        return typeProcess;
    }
    public void setId_type(TypeProcess type) {
        this.typeProcess = type;
    }
    public String getDesc() {
        return descricao;
    }
    public void setDesc(String desc) {
        this.descricao = desc;
    }
    public Integer getLimit() {
        return limite;
    }
    public void setLimit(Integer limit) {
        this.limite = limit;
    }
}
