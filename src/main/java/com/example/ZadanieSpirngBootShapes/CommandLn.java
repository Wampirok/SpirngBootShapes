package com.example.ZadanieSpirngBootShapes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Slf4j
public class CommandLn implements CommandLineRunner {
    @Autowired
    private Shape shape;
    @Override
    public void run(String... args) throws Exception {
        log.info(Arrays.toString(args));
    }
}
