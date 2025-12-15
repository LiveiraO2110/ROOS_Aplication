package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.service.ServicesProcess;
import com.example.demo.service.ServicesType;
import com.example.demo.service.ServicesUsers;

@Component
public class StartApplication implements CommandLineRunner{
    private ServicesUsers user;
    private ServicesProcess process;
    private ServicesType type;
    
    public StartApplication (ServicesType type, ServicesUsers user){
        this.type = type;
        this.user = user;
    }

    @Override
    public void run(String... args) throws Exception {
        //type.createType("Concessão");
        user.getAll();

        //TypeProcess 
    }
}
