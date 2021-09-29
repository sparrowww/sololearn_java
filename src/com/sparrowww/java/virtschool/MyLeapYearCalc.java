package com.sparrowww.java.virtschool;

import com.sparrowww.java.Print;

public class MyLeapYearCalc extends MyBasicObj{
    public MyLeapYearCalc(){
        int beginYear = 1970;
        int endYear = 2021;
        calc(beginYear,endYear);
    }
    private void calc(int beginYear, int endYear){
        Print.printText("Високосные года:"," ");
        for (int i = beginYear; i < endYear; ++i)
        {
            if (i%400 == 0)
            {
                Print.printText(i);
            }
            else if ( i%4 == 0 && i%100 != 0 )
            {
                Print.printText(i);
            }
        }
        Print.printTextLn();
    }
}
