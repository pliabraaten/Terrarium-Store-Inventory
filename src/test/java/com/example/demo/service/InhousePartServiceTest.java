package com.example.demo.service;

import com.example.demo.domain.Material;
import com.example.demo.repositories.MaterialRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Project: demo
 * Package: com.example.demo.service
 * <p>
 * User: carolyn.sher
 * Date: 5/3/2022
 * Time: 11:36 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
class InhousePartServiceTest {
    MaterialRepository inhousePartRepository;
    MaterialService inhousePartService;
    @BeforeEach
    void setUp() {
        inhousePartRepository=mock(MaterialRepository.class);
        inhousePartService=new MaterialServiceImpl(inhousePartRepository);
    }

    @Test
    void findAll() {
        Material part=new Material();
        List partData=new ArrayList();
        partData.add(part);
        when(inhousePartRepository.findAll()).thenReturn(partData);
        List<Material> parts=inhousePartService.findAll();
        assertEquals(partData.size(),1);
    }
}