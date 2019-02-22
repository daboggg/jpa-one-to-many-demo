package ru.zinin.jpaonetomanydemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name= "company")
@Data
public class Company {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer id;

    private String name;

    @OneToMany(mappedBy =  "company",  cascade =  CascadeType.ALL,  fetch =  FetchType.EAGER)
    private List<Product> products;

    public Company( ){
    }

    public Company( String name){
        this.name =  name;
    }

    /*// name
    public String getName( ) {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }

    // products
    public void setProducts(List<Product> products){
        this.products = products;
    }

    public List<Product> getProducts(){
        return this.products;
    }*/


}