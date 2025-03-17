package com.davidotero;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CuentaBancariaTest {
    @Test
    void testContructor() {

        CuentaBancaria cuenta = new CuentaBancaria("Pedro Otero", 1000);

        assertEquals("Pedro Otero", cuenta.getTitular());
        assertEquals(1000, cuenta.getSaldo());
        assertTrue(cuenta instanceof CuentaBancaria);

    }

    @Test
    void testDepositarMayor0() {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro Otero", 1000);

        // Depositmamos mayor que 0
        cuenta.depositar(20);

        assertEquals(1020, cuenta.getSaldo());

    }

    @Test
    void testDepositar0() {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro Otero", 1000);

        // Depositamos 0 o menor que 0
        try {
            cuenta.depositar(0);
        } catch (Exception e) {
            // Recogemos la excepcion
        }

    }

    @Test
    void testRetirarEntre0ySaldo() {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro Otero", 1000);

        // Retiramos mayor que 0
        cuenta.retirar(20.0);
        assertEquals(980.0, cuenta.getSaldo());

    }

    @Test
    void testRetirarSaldoCompleto() {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro Otero", 1000);

        // Retiramos mayor que 0
        cuenta.retirar(1000.0);
        assertEquals(0, cuenta.getSaldo());

    }

    @Test
    void testretirardeMas() {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro Otero", 1000);

        // Retiramos menor que 0
        try {
            cuenta.retirar(2000);
        } catch (Exception e) {
            // Recogemos la excepcion
        }
    }

}
