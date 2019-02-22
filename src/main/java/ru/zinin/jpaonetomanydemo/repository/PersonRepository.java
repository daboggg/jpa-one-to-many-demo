package ru.zinin.jpaonetomanydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.zinin.jpaonetomanydemo.model.Company;

@Repository
public interface PersonRepository extends JpaRepository<Company,Integer> {


}
