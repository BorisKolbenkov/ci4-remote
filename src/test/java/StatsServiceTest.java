package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatsService service = new StatsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMax2() {
        StatsService service = new StatsService();

        long[] incomesInBillions = {1, 5, 8, 4, 5, 12, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMax3() {
        StatsService service = new StatsService();

        long[] incomesInBillions = {1, 5, 8, 4, 5, 3, 8, 6, 11, 12, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMax4() {
        StatsService service = new StatsService();

        long[] incomesInBillions = {1, 5, 8, 4, 5, 3, 8, 6, 11, 10, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}