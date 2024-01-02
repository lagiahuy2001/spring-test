package com.example.demo.repository;

import com.example.demo.model.NQueen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NQueenRepository  extends JpaRepository<NQueen, Long> {
    @Query("SELECT n FROM NQueen n WHERE n.id= ?1")
    NQueen getNQueenById(long id);
}
