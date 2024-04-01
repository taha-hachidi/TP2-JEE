package com.example.demo;

import com.example.demo.entities.Produit;
import com.example.demo.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    @Autowired
    private ProduitRepository produitRepository;
    public static void main(String[] args) {


        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        produitRepository.save(new Produit(null,"iphone",13499,2));
        produitRepository.save(new Produit(null,"Huawei",1399,6));
        produitRepository.save(new Produit(null,"Samsung",10499,4));

        List<Produit> ListProd = produitRepository.findAll();
        ListProd.forEach(p->{
            System.out.println(p.toString());
        });

        Produit prod1 = produitRepository.findById(Long.valueOf(2)).get();
        System.out.println(prod1.toString());
        Produit prod2 = produitRepository.findByQuantite(2);
        System.out.println(prod2.getName());

        produitRepository.delete(prod1);
        produitRepository.delete(produitRepository.findById(Long.valueOf(1)).get());
        produitRepository.findById(Long.valueOf(3)).get().setName("Edited");
        List<Produit> ListProd2 = produitRepository.findAll();

        ListProd2.forEach(p->{
            System.out.println(p.toString());
        });


    }
}
