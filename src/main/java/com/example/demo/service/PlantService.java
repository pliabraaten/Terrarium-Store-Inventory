package com.example.demo.service;

import com.example.demo.domain.Plant;

import java.util.List;

/**
 *
 *
 *
 *
 */
public interface PlantService {
        public List<Plant> findAll();
        public Plant findById(int theId);
        public void save (Plant thePart);
        public void deleteById(int theId);
}
