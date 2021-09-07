/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaurtregulov.spring.rest.dao;

import com.zaurtregulov.spring.rest.entity.Car;
import java.util.List;


public interface CarDao {
    
    public List<Car> getAllCars();
    
}
