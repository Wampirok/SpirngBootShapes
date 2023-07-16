package com.example.ZadanieSpirngBootShapes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CalculateService  implements CommandLineRunner {
    @Autowired
    private Shape shape;


    @Override
    public void run(String... args) throws Exception {
        shape.calculateArea();
    }
}
