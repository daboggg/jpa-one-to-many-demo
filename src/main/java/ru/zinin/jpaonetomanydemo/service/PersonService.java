package ru.zinin.jpaonetomanydemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zinin.jpaonetomanydemo.model.Company;
import ru.zinin.jpaonetomanydemo.model.Product;
import ru.zinin.jpaonetomanydemo.repository.PersonRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    @PostConstruct
    public void init() {
        Company company = new Company("sws");
        Product product = new Product("aaaa", company);
        Product product1 = new Product("bbbb", company);
        List<Product> list = new ArrayList<>();
        list.add(product);
        list.add(product1);
        company.setProducts(list);
        personRepository.save(company);
        List<Company> all = personRepository.findAll();



    }
}
