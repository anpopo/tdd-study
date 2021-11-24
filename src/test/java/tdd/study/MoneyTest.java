package tdd.study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    public void testEquality() {
        Assertions.assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testDifferentClassEquality() {
        Assertions.assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
    }
}
