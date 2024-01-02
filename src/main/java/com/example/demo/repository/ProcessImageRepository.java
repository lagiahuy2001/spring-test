package com.example.demo.repository;

import com.example.demo.model.ProcessImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessImageRepository extends JpaRepository<ProcessImage, Long> {
    @Query("SELECT p FROM ProcessImage p WHERE p.id= ?1")
    ProcessImage getProcessImageById(long id);
}
