package ru.zinin.jpaonetomanydemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.zinin.jpaonetomanydemo.model.Company;
import ru.zinin.jpaonetomanydemo.repository.PersonRepository;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(path = "/all")
    public List<Company> getAllCompany() {
        return personRepository.findAll();
    }
}
