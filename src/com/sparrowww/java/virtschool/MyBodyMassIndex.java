package com.sparrowww.java.virtschool;

import com.sparrowww.java.Print;

public class MyBodyMassIndex extends MyBasicObj{
    public MyBodyMassIndex() {
        float myGrowth = 180.0F;
        float myWeight = 70.0F;
        calculateBMI( myGrowth, myWeight );
    }
    public String calculateBMI( float myGrowth, float myWeight ){
        float myGrowthMeters = myGrowth/100;
        float BMI = myWeight/(myGrowthMeters*myGrowthMeters);
        String textBMI;
        if (BMI < 18.5 && BMI != Float.NEGATIVE_INFINITY ) textBMI="Недостаточный вес";
        else if ( BMI >= 18.5 && BMI < 25.0) textBMI="Норма";
        else if ( BMI >= 25.0 && BMI < 30.0) textBMI="Избыточный вес";
        else if ( BMI >= 30.0 && BMI != Float.POSITIVE_INFINITY ) textBMI="Ожирение";
        else textBMI="Ошибка!";
        Print.printTextPlusParam("numBMI", BMI);
        Print.printTextPlusParam("textBMI", textBMI);
        return textBMI;
    }
}
