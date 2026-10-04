import org.example.src.Task_1.Task1;
import org.example.src.Task_2.Task2;
import org.example.src.Task_3.Task3;
import org.example.src.Task_4.Task4;
import org.example.src.Task_5.Task5;
import org.example.src.Task_6.Task6;
import org.example.src.Task_7.Task7;
import org.example.src.Task_8.Calculator;
import org.example.src.Task_8.PrimeChecker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    // асть 1: калькулятор
    @Test
    void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(6, Calculator.subtract(10, 4));
    }

    @Test
    void testMultiply() {
        assertEquals(15, Calculator.multiply(3, 5));
    }

    @Test
    void testDivide() {
        assertEquals(5, Calculator.divide(10, 2));
    }


    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(10, 0));
    }

    // Часть 2: простые числ
    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 97})
    void testPrime(int n) {
        assertTrue(PrimeChecker.isPrime(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 4, 9, 15, 100})
    void testNotPrime(int n) {
        assertFalse(PrimeChecker.isPrime(n));
    }

    // Часть 3
    //  Задание  степень числа
    @ParameterizedTest
    @CsvSource({"2, 3, 8", "5, 1, 5", "0, 5, 0", "1, 100, 1"})
    void testPow(int x, int n, long expected) {
        assertEquals(expected, Task1.pow(x, n));
    }
    // задание  нахождение НОД
    @ParameterizedTest
    @CsvSource({"0, 0, 0", "9, 9, 9", "526, 2, 2", "10, 15, 5"})
    void gcd(int x, int b,int expected) {
        assertEquals(expected, Task2.gcd(x, b));
    }
    //Задание  наименьшая цифра
    @ParameterizedTest
    @CsvSource({"0, 0", "9, 9", "527, 2", "10, 0"})
    void testMinDigit(int x, int expected) {
        assertEquals(expected, Task3.minDigit(x));
    }
    //Задание  числа фибоначи
    @ParameterizedTest
    @CsvSource({"0, 0", "3, 2", "10, 55"})
    void testFibb(int n, long expected) {
        assertEquals(expected, Task4.fibb(n));
    }
    //Задание  множественное число
    @ParameterizedTest
    @CsvSource({
            "0, было найдено, записей",
            "1, была найдена, запись",
            "2, было найдено, записи",
            "4, было найдено, записи",
            "5, было найдено, записей",
    })
    void testPluralize(int n, String verb, String word) {
        String expected = "В результате выполнения запроса " + verb + " " + n + " " + word;
        assertEquals(expected, Task5.pluralizeRecords(n));
    }
    //Задание шифр цезаря
    @Test
    void testCesarDecodeTaskMessage() {
        assertEquals("хакуна матата", Task7.cesar("эзтыхз фзъзъз", 8, "decode"));
    }
    @AF
    @Test
    void testCesarEncode() {
        assertEquals("эзтыхз фзъзъз", Task7.cesar("хакуна матата", 8, "encode"));
    }
}