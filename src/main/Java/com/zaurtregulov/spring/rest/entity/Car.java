
package com.zaurtregulov.spring.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "cars")
public class Car {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "lable")
    private String lable;
    
    @Column(name = "model")
    private String model;
    
    @Column(name = "bodywork")
    private String bodywork;
    
    @Column(name = "cost")
    private int cost;

    public Car() {
    }

    public Car(String lable, String model, String bodywork, int cost) {
        this.lable = lable;
        this.model = model;
        this.bodywork = bodywork;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    
}
