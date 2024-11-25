package com.purple.Purple.entity;
import org.springframework.data.jpa.repository.JpaRepository;


// A kind of DAO interface

public interface ProductRepository extends JpaRepository<Product,Integer>{

}