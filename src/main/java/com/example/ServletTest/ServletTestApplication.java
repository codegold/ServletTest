package com.example.ServletTest;

import org.apache.commons.io.FileUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class ServletTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServletTestApplication.class, args);
    }
	File tempDirectory = FileUtils.getTempDirectory();
}
