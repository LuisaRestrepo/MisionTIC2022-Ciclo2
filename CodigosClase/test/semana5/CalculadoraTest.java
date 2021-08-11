/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class CalculadoraTest {

    public static Calculadora calculadora1;

    public CalculadoraTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before class");
        calculadora1 = new Calculadora();
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("After class");
    }

    @Before
    public void setUp() {
        System.out.println("Before");
    }

    @After
    public void tearDown() {
        System.out.println("After");
    }

    @Test
    public void prueba1() {
        System.out.println("PRUEBA 1 - The test case is a prototype.");
        double a = 4.5566;
        double b = 2.3;
        double result = calculadora1.getSuma(a, b);
        double expected = 6.8566;
        assertEquals(expected, result, 0);
    }

    @Test
    public void prueba2() {
        System.out.println("PRUEBA 2 - The test case is a prototype.");
        double a = 5;
        double b = 3;
        double result = calculadora1.getDivision(a, b);
        double expected = 1.67;
        assertEquals(expected, expected, 1);
    }

    @Test
    public void prueba3() {
        double a = 5;
        double b = 3;
        assertTrue(a > b);
        assertFalse(a < b);
        assertNotNull(calculadora1);
        assertNull(null);
    }

}
