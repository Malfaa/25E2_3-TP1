package org.example;

import org.junit.jupiter.api.*;

public class ScientificCalculatorTest {
    ScientificCalculator calc;

    // ------------ SETTING UP ------------
    @BeforeEach
    public void setUp() {
        calc = new ScientificCalculator();
    }

    // ------------ FUNÇÕES BÁSICAS ------------
    @Test
    void add_doisNumerosPositivos_retornaSomaCorreta() {
        //ARRANGE
        double a = 5;
        double b = 4;

        //ACT
        ScientificCalculator calc = new ScientificCalculator();
        var resultado = calc.add(a, b);
        var expected = a + b;

        //ASSERT
        Assertions.assertEquals(expected, resultado);
    }

    @Test
    void testSubtract() {
        //SETUP (ARRANGE)
        double a = 10;
        double b = 6;

        //EXECUTION (ACT)
        ScientificCalculator calc = new ScientificCalculator();
        var resultado = calc.subtract(a, b);
        var expected = a - b;

        //ASSERTION
        Assertions.assertEquals(expected, resultado);

        //TEARDOWN (CLEANUP)
    }

    @Test
    public void testSquareRootPositive() {
        //ARRANGE
        double a = 4;

        //ACT
        var expected = Math.sqrt(a);
        var resultado = calc.squareRoot(a);

        //ASSERT
        Assertions.assertEquals(expected, resultado);
    }

    @Test
    public void testLog() {
        //arrange
        double a = 5;

        //act
        var expected = Math.log(a);
        var resultado = calc.log(a);
        //assert
        Assertions.assertEquals(expected, resultado);
    }

    @Test
    public void testSin() {
        //arrange
        double degrees = 90;

        //act
        var expected = Math.sin(Math.toRadians(degrees));
        var resultado = calc.sin(degrees);

        //assert
        Assertions.assertEquals(expected, resultado);
    }

    //------------ FUNÇÕES QUE RETORNAM EXCEPTION ------------
    @Test
    public void squareRoot_numeroNegativo_throwsIllegalArgumentException() {
        //arrange
        double a = -10;
        //act

        //assert
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                calc.squareRoot(a), "Exceção lançada!"
        );
    }

    @Test
    public void testDivideByZero() {
        //arrange
        double a = 10;
        double b = 0;
        //act

        //assert
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                calc.divide(a, b), "Argumento inválido"
        );
    }
}