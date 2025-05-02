import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathOperationsTest {

    MathOperations mathOps = new MathOperations();

    @Test
    public void testAdd() {
        assertEquals(5, mathOps.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, mathOps.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, mathOps.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, mathOps.divide(6, 3));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> mathOps.divide(1, 0));
    }

    @Test
    public void testIsEven() {
        assertTrue(mathOps.isEven(4));
        assertFalse(mathOps.isEven(5));
    }

    @Test
    public void testIsPrime() {
        assertTrue(mathOps.isPrime(7));
        assertFalse(mathOps.isPrime(4));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, mathOps.factorial(5));
        assertEquals(1, mathOps.factorial(0));
    }

    @Test
    public void testNegativeNumber() {
        assertFalse(mathOps.isPrime(-3));
    }

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, mathOps.factorial(0));
    }
}
