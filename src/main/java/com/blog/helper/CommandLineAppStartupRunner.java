package com.blog.helper;

import org.springframework.boot.CommandLineRunner;

public class CommandLineAppStartupRunner implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
        System.out.println(args);
    }
}
