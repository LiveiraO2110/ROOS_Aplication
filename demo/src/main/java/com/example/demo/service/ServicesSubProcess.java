package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ProcessAction;
import com.example.demo.model.SubProcessAction;
import com.example.demo.repository.SubProcessRepo;

@Service
public class ServicesSubProcess {
    @Autowired
    private SubProcessRepo repo;

    public List<SubProcessAction> getAll(Long id){
        return repo.findByProcessAction_ID(id);
    }

    public SubProcessAction createSubProcess(ProcessAction process, String desc, Integer limite, LocalDate prazo) {
        SubProcessAction subProcess = new SubProcessAction();
        subProcess.setId_process(process);
        subProcess.setDesc(desc);
        subProcess.setLimite(limite);
        subProcess.setObs("Nada Anotado");
        subProcess.setStatus(false);

        LocalDate prazoFinal = prazo.minusDays(limite);
        subProcess.setPrazo(prazoFinal);

        return repo.save(subProcess);
    }
}
