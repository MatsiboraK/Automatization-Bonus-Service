package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void calculateBonus() {
        BonusService bonusService = new BonusService();
        int amount = 1500;
        int expected = 5;
        int actual = bonusService.calculateBonus(amount);

        assertEquals(expected, actual);
    }

}