package com.test;

import com.company.Operations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    void add() {
        assertEquals(5.0, Operations.add(2.0, 3.0));
        assertEquals(null, Operations.add(2.0, null));
        assertEquals(null, Operations.add(null, null));
        assertEquals(null, Operations.add(null, 3.0));

    }

    @Test
    void sub() {
        assertEquals(-1, Operations.sub(2.0, 3.0));
        assertEquals(null, Operations.sub(2.0, null));
        assertEquals(null, Operations.sub(null, null));
        assertEquals(null, Operations.sub(null, 3.0));
    }

    @Test
    void mul() {
        assertEquals(6.0, Operations.mul(2.0, 3.0));
        assertEquals(null, Operations.mul(2.0, null));
        assertEquals(null, Operations.mul(null, null));
        assertEquals(null, Operations.mul(null, 3.0));
    }

    @Test
    void div() {
        assertEquals(3.0, Operations.div(6.0, 2.0));
        assertEquals(null, Operations.div(2.0, null));
        assertEquals(null, Operations.div(null, null));
        assertEquals(null, Operations.div(null, 3.0));
        assertEquals(null, Operations.div(3.0, 0.0));
    }
}