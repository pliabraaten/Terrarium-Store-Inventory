<<<<<<< HEAD
package com.example.demo.service;

import com.example.demo.domain.Plant;
import com.example.demo.repositories.PlantRepository;
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
public class PlantServiceImpl implements PlantService {
    private PlantRepository partRepository;

    @Autowired
    public PlantServiceImpl(PlantRepository partRepository) {
        this.partRepository = partRepository;
    }

    @Override
    public List<Plant> findAll() {
        return (List<Plant>) partRepository.findAll();
    }

    @Override
    public Plant findById(int theId) {
        Long theIdl=(long)theId;
        Optional<Plant> result = partRepository.findById(theIdl);

        Plant thePart = null;

        if (result.isPresent()) {
            thePart = result.get();
        }
        else {
            // we didn't find the OutSourced id
            //throw new RuntimeException("Did not find part id - " + theId);
            return null;
        }

        return thePart;
    }

    @Override
    public void save(Plant thePart) {
        partRepository.save(thePart);

    }

    @Override
    public void deleteById(int theId) {
        Long theIdl=(long)theId;
        partRepository.deleteById(theIdl);
    }

}
=======
package com.example.demo.service;

import com.example.demo.domain.Plant;
import com.example.demo.repositories.PlantRepository;
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
public class PlantServiceImpl implements PlantService {
    private PlantRepository partRepository;

    @Autowired
    public PlantServiceImpl(PlantRepository partRepository) {
        this.partRepository = partRepository;
    }

    @Override
    public List<Plant> findAll() {
        return (List<Plant>) partRepository.findAll();
    }

    @Override
    public Plant findById(int theId) {
        Long theIdl=(long)theId;
        Optional<Plant> result = partRepository.findById(theIdl);

        Plant thePart = null;

        if (result.isPresent()) {
            thePart = result.get();
        }
        else {
            // we didn't find the OutSourced id
            //throw new RuntimeException("Did not find part id - " + theId);
            return null;
        }

        return thePart;
    }

    @Override
    public void save(Plant thePart) {
        partRepository.save(thePart);

    }

    @Override
    public void deleteById(int theId) {
        Long theIdl=(long)theId;
        partRepository.deleteById(theIdl);
    }

}
>>>>>>> 71bff175338eb4802fd49d5301a6d0474b4477fd
