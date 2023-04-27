package com.example.cruddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cruddemo.model.CrudDemo;

@Repository
public interface CrudDemoRepository extends JpaRepository<CrudDemo,Integer> {

}
