package com.sping.withoutweb.config;

import org.springframework.boot.CommandLineRunner;

public interface ExecuteI extends CommandLineRunner {
    @Override
    void run(String... args) throws Exception;
}
