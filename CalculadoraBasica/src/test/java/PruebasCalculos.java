/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import alfredo.itszn.edu.mx.calculadorabasica.Calculos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alfre
 */
public class PruebasCalculos {
    
    public PruebasCalculos() {
    }
    
    Calculos instancia=new Calculos();
    
    @Test 
    public void pruebasuma1(){
        int x=4;
        int y=2;
        int esperado=6;
        int obtenido=instancia.suma(x, y);
        assertEquals(esperado, obtenido);
    }
    
    @Test 
    public void pruebasuma2(){
        int x=6;
        int y=8;
        int esperado=14;//Aqui hay un error
        int obtenido=instancia.suma(x, y);
        assertEquals(esperado, obtenido);
    }
    
    @Test 
    public void pruebaresta1(){
        int x=6;
        int y=4;
        int esperado=2;//Aqui hay un error
        int obtenido=instancia.resta (x, y);
        assertEquals(esperado, obtenido);
    }
    
    @Test 
    public void pruebaresta2(){
        int x=10;
        int y=7;
        int esperado=3;//Aqui hay un error
        int obtenido=instancia.resta(x, y);
        assertEquals(esperado, obtenido);
    }
}
