package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {


    @Test
    public void souldCalculate() {
        SQRService service = new SQRService();
        int actual = service.calculate(200, 300);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void souldCalc() {
        SQRService service = new SQRService();
        int actual = service.calculate(10, 99);
        int expected = 0;

        assertEquals(expected, actual);
    }
}
