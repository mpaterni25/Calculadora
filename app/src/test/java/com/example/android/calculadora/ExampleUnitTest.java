package com.example.android.calculadora;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void sumar_dos_numeros(){
        double a =4 ,b =6;
        assertEquals(10,Metodos.sumar(a,b),0);
    }

    @Test
    public void resta_dos_numeros(){
        double a =4 ,b =6;
        assertEquals(-2,Metodos.restar(a,b),0);
    }

    @Test
    public void multiplicar_dos_numeros(){
        double a =4 ,b =6;
        assertEquals(24,Metodos.multiplicar(a,b),0);
    }

    @Test
    public void dividir_dos_numeros(){
        double a =4 ,b =2;
        assertEquals(2,Metodos.dividir(a,b),0);
    }

}