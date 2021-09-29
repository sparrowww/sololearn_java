package com.sparrowww.java.virtschool.tests;

import com.sparrowww.java.virtschool.MyBodyMassIndex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyBodyMassIndexTest {
    MyBodyMassIndex obj;

    @Test
    public void testMethodBMI() {
        //Given skipped because method without parameters and should always return same result
        obj = new MyBodyMassIndex();

        String resBMI = obj.calculateBMI(180, 70);
        boolean resTest = resBMI.contains("Норма");
        Assertions.assertTrue(resTest);

        resBMI = obj.calculateBMI(200, 70);
        resTest = resBMI.contains("Недостаточный вес");
        Assertions.assertTrue(resTest);

        resBMI = obj.calculateBMI(160, 70);
        resTest = resBMI.contains("Избыточный вес");
        Assertions.assertTrue(resTest);

        resBMI = obj.calculateBMI(140, 70);
        resTest = resBMI.contains("Ожирение");
        Assertions.assertTrue(resTest);

        resBMI = obj.calculateBMI(0, -70);
        resTest = resBMI.contains("Ошибка!");
        Assertions.assertTrue(resTest);

        resBMI = obj.calculateBMI(0, 70);
        resTest = resBMI.contains("Ошибка!");
        Assertions.assertTrue(resTest);

        resBMI = obj.calculateBMI(0, 0);
        resTest = resBMI.contains("Ошибка!");
        Assertions.assertTrue(resTest);

    }

}