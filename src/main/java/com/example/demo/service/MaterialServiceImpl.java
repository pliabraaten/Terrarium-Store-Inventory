package com.example.demo.service;

import com.example.demo.domain.Material;
import com.example.demo.repositories.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Service
public class MaterialServiceImpl implements MaterialService {
    private MaterialRepository partRepository;

    @Autowired
    public MaterialServiceImpl(MaterialRepository partRepository) {
        this.partRepository = partRepository;
    }

    @Override
    public List<Material> findAll() {
        return (List<Material>) partRepository.findAll();
    }

    @Override
    public Material findById(int theId) {
        Long theIdl=(long)theId;
        Optional<Material> result = partRepository.findById(theIdl);

        Material thePart = null;

        if (result.isPresent()) {
            thePart = result.get();
        }
        else {
            // we didn't find the InhousePart id
            //throw new RuntimeException("Did not find part id - " + theId);
            return null;
        }

        return thePart;
    }

    @Override
    public void save(Material thePart) {
        partRepository.save(thePart);

    }

    @Override
    public void deleteById(int theId) {
        Long theIdl=(long)theId;
        partRepository.deleteById(theIdl);
    }

}
