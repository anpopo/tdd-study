package tdd.study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FrancTest {

    @Test
    public void testMultiplication() {
        Franc five = new Franc(5);
        Assertions.assertEquals(new Franc(10), five.times(2));
        Assertions.assertEquals(new Franc(15), five.times(3));
    }

}
