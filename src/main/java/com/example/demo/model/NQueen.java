package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "nqueen")
public class NQueen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String result;

    private Integer count;

    public NQueen() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
