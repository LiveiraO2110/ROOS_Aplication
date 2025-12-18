package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ProcessAction;
import com.example.demo.model.ReadyProcess;
import com.example.demo.repository.ProcessRepo;
import com.example.demo.repository.ReadyProcessRepo;

@Service
public class ServicesProcessReady {
    @Autowired
    private ReadyProcessRepo repo;
    @Autowired
    private ProcessRepo p_repo;
    
    public ReadyProcess createReadyProcess(Long id_process){
        ProcessAction process = p_repo.findById(id_process).orElseThrow(() -> new RuntimeException("Processo não encontrado"));

        ReadyProcess readyProcess = new ReadyProcess();

        readyProcess.setId_process(id_process);
        readyProcess.setANM(process.getAnm());
        readyProcess.setCliente(process.getCliente());
        readyProcess.setName(process.getName());

        return repo.save(readyProcess);
    }
}
