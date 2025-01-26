<<<<<<< HEAD
package com.example.demo.service;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;

import java.util.List;

/**
 *
 *
 *
 *
 */
public interface ProductService {
    public List<Product> findAll();
    public Product findById(int theId);
    public void save (Product theProduct);
    public void deleteById(int theId);
    public List<Product> listAll(String keyword);

}
=======
package com.example.demo.service;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;

import java.util.List;

/**
 *
 *
 *
 *
 */
public interface ProductService {
    public List<Product> findAll();
    public Product findById(int theId);
    public void save (Product theProduct);
    public void deleteById(int theId);
    public List<Product> listAll(String keyword);

}
>>>>>>> 71bff175338eb4802fd49d5301a6d0474b4477fd
