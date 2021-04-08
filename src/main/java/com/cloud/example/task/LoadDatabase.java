package com.cloud.example.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    CommandLineRunner initDatabase(TaskRepository taskRepository) {
        return args -> {
            log.info("Preloading " + taskRepository
                    .save(new Task("Cleaning", "Clean kitchen and balcony", Priority.MEDIUM)));
            log.info("Preloading " + taskRepository
                    .save(new Task("Exams", "Prepare for upcoming exams", Priority.HIGH)));
        };
    }
}
