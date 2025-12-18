package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.service.ServicesProcess;
import com.example.demo.service.ServicesProcessReady;
import com.example.demo.service.ServicesType;
import com.example.demo.service.ServicesTypeSub;
import com.example.demo.service.ServicesUserProcess;
import com.example.demo.service.ServicesUsers;

@Component
public class StartApplication implements CommandLineRunner{
    @Autowired
    private ServicesUsers service_user;
    @Autowired
    private ServicesProcess service_process;
    @Autowired
    private ServicesType type;
    @Autowired
    private ServicesProcessReady ready;
    @Autowired
    private ServicesTypeSub type_sub;
    @Autowired
    private ServicesUserProcess user_process;

    @Override
    public void run(String... args) throws Exception {
    }
}
