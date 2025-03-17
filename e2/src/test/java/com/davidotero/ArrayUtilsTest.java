package com.davidotero;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

    // Encontrar Minimo ArrayEnteros
    @Test
    void testCalcularMinimo() {

        int[] input = { 5, 4, 3, 2, 1};

        int resultado = ArrayUtils.encontrarMinimo(input);

        assertEquals(1, resultado);
    }

    // Lance Excepcion por array Vacio
    @Test
    void testArrayMinimoVacio() {
        int[] input = {};
        try {
            ArrayUtils.encontrarMinimo(input);
        } catch (Exception e) {
        }
    }

    // Encontrar maximo array enteros
    @Test
    void testCalcularMaximoArrayEnteros() {
        int[] input = { 4, 2, 1, 3, 5 };

        int resultado = ArrayUtils.encontrarMaximo(input);
        assertEquals(5, resultado);
    }

    @Test
    void testArrayMaximoVacio() {
        int[] input = {};
        try {
            ArrayUtils.encontrarMaximo(input);
        } catch (Exception e) {
        }
    }

    @Test
    void testPromedioArrayEnteros(){
        int [] input = {0,0,10,10};
        
        double resultado = ArrayUtils.calcularPromedio(input);

        assertEquals(5.0, resultado);
    }

    @Test
    void testArrayPromedioVacio() {
        int[] input = {};
        try {
            ArrayUtils.calcularPromedio(input);
        } catch (Exception e) {
        }
    }
}
