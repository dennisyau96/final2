package org.example.final1.web;

import lombok.AllArgsConstructor;
import org.example.final1.entities.AccountRecord;
import org.example.final1.repositories.AccountRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.security.auth.login.AccountNotFoundException;
import java.util.List;

@Controller
@AllArgsConstructor
public class AccountRecordController {
    @Autowired
//    public AccountRecordRepository accountRecordRepository;
//    @GetMapping(path = "/index")
//    public String accountRecord() {
//        return "accountRecords";
//    }

    public AccountRecordRepository accountRecordRepository;
    @GetMapping(path = "/index")
    public String accountRecord(Model model) {
        List<AccountRecord> accountList=accountRecordRepository.findAll();


        model.addAttribute("accountList",accountList);
        return "accountRecords";
    }
}

