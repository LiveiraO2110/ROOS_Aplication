package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name="table_type")
public class TypeProcess {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long ID;
    private String name;

    @OneToMany(mappedBy = "typeProcess")
    private List<SubProcessType> subProcessType = new ArrayList<>();

    @OneToMany(mappedBy = "typeProcess", fetch = FetchType.LAZY)
    private List<ProcessAction> processAction = new ArrayList<>();

    public TypeProcess(String name) {
        this.name = name;
    }

    public TypeProcess(){}
    
    public List<ProcessAction> getProcessAction() {
        return processAction;
    }

    public void setProcessAction(List<ProcessAction> processAction) {
        this.processAction = processAction;
    }
    public List<SubProcessType> getSubProcessType() {
        return subProcessType;
    }
    public void setSubProcessType(List<SubProcessType> subProcessType) {
        this.subProcessType = subProcessType;
    }
    public Long getID() {
        return ID;
    }
    public void setID(Long iD) {
        ID = iD;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
