<<<<<<< HEAD
package com.example.demo.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Project: demoDarbyFrameworks2-master
 * Package: com.example.demo.domain
 * <p>
 * User: carolyn.sher
 * Date: 6/24/2022
 * Time: 3:45 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
class InhousePartTest {
    Material ip;
    @BeforeEach
    void setUp() {
        ip= new Material();
    }

    @Test
    void getPartId() {
        int idValue=4;
        ip.setPartId(idValue);
        assertEquals(ip.getPartId(), idValue);
    }

    @Test
    void setPartId() {
        int idValue=4;
        ip.setPartId(idValue);
        assertEquals(ip.getPartId(), idValue);
    }
=======
package com.example.demo.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Project: demoDarbyFrameworks2-master
 * Package: com.example.demo.domain
 * <p>
 * User: carolyn.sher
 * Date: 6/24/2022
 * Time: 3:45 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
class InhousePartTest {
    Material ip;
    @BeforeEach
    void setUp() {
        ip= new Material();
    }

    @Test
    void getPartId() {
        int idValue=4;
        ip.setPartId(idValue);
        assertEquals(ip.getPartId(), idValue);
    }

    @Test
    void setPartId() {
        int idValue=4;
        ip.setPartId(idValue);
        assertEquals(ip.getPartId(), idValue);
    }
>>>>>>> 71bff175338eb4802fd49d5301a6d0474b4477fd
}