<<<<<<< HEAD
package com.example.demo.repositories;

import com.example.demo.domain.Material;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Project: demo
 * Package: com.example.demo.repositories
 * <p>
 * User: carolyn.sher
 * Date: 5/3/2022
 * Time: 11:33 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
class InhousePartRepositoryTest {
    MaterialRepository inhousePartRepository;
    @BeforeEach
    void setUp() {
        inhousePartRepository=mock(MaterialRepository.class);
    }
    @Test
    void findAll() {
        Material part=new Material();
        List partData=new ArrayList();
        partData.add(part);
        when(inhousePartRepository.findAll()).thenReturn(partData);
        List<Material> parts=(List<Material>)inhousePartRepository.findAll();
        assertEquals(partData.size(),1);
    }
=======
package com.example.demo.repositories;

import com.example.demo.domain.Material;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Project: demo
 * Package: com.example.demo.repositories
 * <p>
 * User: carolyn.sher
 * Date: 5/3/2022
 * Time: 11:33 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
class InhousePartRepositoryTest {
    MaterialRepository inhousePartRepository;
    @BeforeEach
    void setUp() {
        inhousePartRepository=mock(MaterialRepository.class);
    }
    @Test
    void findAll() {
        Material part=new Material();
        List partData=new ArrayList();
        partData.add(part);
        when(inhousePartRepository.findAll()).thenReturn(partData);
        List<Material> parts=(List<Material>)inhousePartRepository.findAll();
        assertEquals(partData.size(),1);
    }
>>>>>>> 71bff175338eb4802fd49d5301a6d0474b4477fd
}