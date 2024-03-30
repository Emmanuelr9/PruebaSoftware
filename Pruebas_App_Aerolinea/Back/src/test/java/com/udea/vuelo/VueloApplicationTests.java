package com.udea.vuelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.udea.vuelo.controller.FlightController;

@SpringBootTest
class VueloApplicationTests {

    @Autowired
    FlightController flightController;

    @Test
    void health() {
        assertEquals("Aplicación funcionando correctamente", flightController.health());
    }	

    @Test
    void version() {
        assertEquals("version 1.0.0", flightController.version());
    }	



}
