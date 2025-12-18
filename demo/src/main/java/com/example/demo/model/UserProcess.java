package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="table_user_process")
public class UserProcess {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long ID;

    @ManyToOne
    @JoinColumn(name="id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name="id_process")
    private ProcessAction process;

    public UserProcess(ProcessAction process,  User user) {
        this.process = process;
        this.user = user;
    }
    
    public UserProcess(){}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ProcessAction getProcess() {
        return process;
    }

    public void setProcess(ProcessAction process) {
        this.process = process;
    }
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    
}
