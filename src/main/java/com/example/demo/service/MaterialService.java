package com.example.demo.service;

import com.example.demo.domain.Material;

import java.util.List;

/**
 *
 *
 *
 *
 */
public interface MaterialService {
    public List<Material> findAll();
    public Material findById(int theId);
    public void save (Material thePart);
    public void deleteById(int theId);
}
