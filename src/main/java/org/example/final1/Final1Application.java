package org.example.final1;

import org.example.final1.entities.AccountRecord;
import org.example.final1.repositories.AccountRecordRepository;
import org.example.final1.repositories.AccountRecordRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Final1Application {

    public static void main(String[] args) {
        SpringApplication.run(Final1Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(AccountRecordRepository accountRecordRepository){
        return args -> {
            accountRecordRepository.save(new AccountRecord(null, "Jam", "2001", "false", 1222));
            accountRecordRepository.save(new AccountRecord(null, "Jen",  "2001", "true", 1111));
            accountRecordRepository.save(new AccountRecord(null, "Jok",  "2002", "false", 2222));
            accountRecordRepository.save(new AccountRecord(null, "Jos",  "2003", "false", 3333));
            accountRecordRepository.findAll().forEach(p->{
                System.out.println(p.getName());
            });
        };
    }
}
