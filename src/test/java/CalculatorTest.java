import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator Calc;
    @BeforeEach
    void setUp() {
        Calc = new Calculator();
        System.out.println("Инициализация калькулятора перед тестом");
    }

    @AfterEach
    void tearDown() {
    }
    @DisplayName("название метода")
    @Test
    void add() {
        int result = Calc.add(2,3);
        assertEquals(5,result,"2+3 должно быть равно 5");
    }

    @Test
    void subtract() {
        int result = Calc.subtract(2,3);
        assertEquals(-1,result,"2-3 должно быть равно -1");
    }

    @Test
    void multiply() {
        int result = Calc.multiply(2,3);
        assertEquals(6,result,"2*3 должно быть равно 6");
    }

    @Test
    void divide() {
        int result = Calc.divide(4,2);
        assertEquals(2,result,"4/2 должно быть равно 2");
    }
}