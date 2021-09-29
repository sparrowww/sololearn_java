package com.sparrowww.java.virtschool;

import com.sparrowww.java.Print;

public class MyBasicsJava1 extends MyBasicObj {
    public MyBasicsJava1(){
        Print.printTextLn("Основы Java-программирования I");
        example();
    }
    private void example(){
        /** HO-HO-HO
         * */
        printNumbers();
//        compareTwoDoubles();
//        typeCast();
//        getCurrentTime2();
//        getCurrentTime(); //FIXME не правильно!!!
//        formatNumbers();
//        calcCircleArea(2.15);
//        Scanner scanner = new Scanner(System.in);
//        calcCircleArea(scanner.nextDouble());
    }
    private void printNumbers(){
        final int size = 10;
        for (int i = 0; i <= size; ++i)
        {
            if ( i <= size/2) {
                for (int j = 0; j < i + 1; ++j) {
                    Print.printText(j);
                }
            }
            else
            {
                for (int j = 0; j < size - i  + 1; ++j) {
                    Print.printText(j);
                }
            }
            Print.printTextLn();
        }
    }
    private void compareTwoDoubles(){
        final double EPSILON = 1E-14; // 1E-7 to float
        double d1 = 0.5;
        double d2 = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        Print.printTextPlusParam("d1",d1);
        Print.printTextPlusParam("d2",d2);
        boolean resDD = Math.abs(d1-d2) < EPSILON;
        Print.printTextPlusParam("d1~==d2?",resDD);
    }
    private void typeCast(){
        double d1 = 15.49;
        int i1 = (int)d1;
        Print.printTextLn(i1);
        int i2 = (int)(d1 + 0.5);
        Print.printTextLn(i2);
        int i3 = (int)(d1 + 0.01 + 0.5);
        Print.printTextLn(i3);
    }
    private void getCurrentTime2(){
        final int MILLISECONDS_PER_SECOND = 1000, SECONDS_PER_MINUTE = 60;
        final int MINUTES_PER_HOUR = 60, HOURS_PER_DAY = 24;
        long curMsFrom1970 = System.currentTimeMillis(); //Print.printTextPlusParam("curMsFrom1970", curMsFrom1970);
        long curMs=curMsFrom1970%MILLISECONDS_PER_SECOND; Print.printTextPlusParam("curMs", curMs);
        long allS=curMsFrom1970/MILLISECONDS_PER_SECOND; //Print.printTextPlusParam("allS", allS);
        long curS=allS%SECONDS_PER_MINUTE; Print.printTextPlusParam("curS", curS);
        long allM=allS/SECONDS_PER_MINUTE; //Print.printTextPlusParam("allM", allM);
        long curM=allM%MINUTES_PER_HOUR; Print.printTextPlusParam("curM", curM);
        long allH=allM/MINUTES_PER_HOUR; //Print.printTextPlusParam("allH", allH);
        long curH=allH%HOURS_PER_DAY; Print.printTextPlusParam("curH", curH);
        long allD=allH/HOURS_PER_DAY; //Print.printTextPlusParam("allD", allD);

    }
    private void getCurrentTime(){
        final int MILLISECONDS_PER_SECOND = 1000, SECONDS_PER_MINUTE = 60;
        final int MINUTES_PER_HOUR = 60, HOURS_PER_DAY = 24;

        final int SECONDS_IN_DAY = SECONDS_PER_MINUTE*MINUTES_PER_HOUR*HOURS_PER_DAY; Print.printTextPlusParam("SECONDS_IN_DAY", SECONDS_IN_DAY);
        final int CUR_MINUS_SEC = 27;

        long curTimeMS = System.currentTimeMillis(); Print.printTextPlusParam("curTimeMS", curTimeMS);
        long curTimeS = curTimeMS/1000 - CUR_MINUS_SEC; Print.printTextPlusParam("curTimeS", curTimeS);
        long curTimeD = curTimeS/SECONDS_IN_DAY; Print.printTextPlusParam("curTimeD", curTimeD);
        long curTimeY = curTimeD/365; Print.printTextPlusParam("curTimeY", curTimeY);
        final int UNIX_BEGIN_YEAR = 1970;
        long curY = UNIX_BEGIN_YEAR + curTimeY; Print.printTextPlusParam("curY", curY);
        int tmpDays = 0;
        for(int i = UNIX_BEGIN_YEAR; i < curY; ++i)
        {
            tmpDays +=365;
            if (i%4==0)
            {
                //Print.printTextPlusParam("Високосный год", i);
                tmpDays +=1;
            }
        }
//        Print.printTextPlusParam("Days",tmpDays);
//        Print.printTextPlusParam("curTimeD - tmpDays",curTimeD-tmpDays);
        final int [] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        long tmp = curTimeD-tmpDays;
        for(int i = 0; i <daysInMonth.length ;++ i)
        {
            if ((tmp-daysInMonth[i])>0)
                tmp-=daysInMonth[i];
            else
            {
                Print.printTextPlusParam("numMonth", i + 1);
                Print.printTextPlusParam("tmp", tmp+1);
                break;
            }
        }
        long curTimeDH = (curTimeS%SECONDS_IN_DAY)/3600; Print.printTextPlusParam("curTimeDH", curTimeDH);
        long curTimeDM = ((curTimeS%SECONDS_IN_DAY)%3600)/60; Print.printTextPlusParam("curTimeDM", curTimeDM);
    }
    private void formatNumbers(){
        final int BINARYNUMBER = 0b0101_0101;
        final int OCTALNUMBER = 0113;
        final int HEXNUMBER = 0xFFFF;
        final long BIGNUMBER = 123_456_789L;
    }
    private void calcCircleArea( double radius ){
        double area = Math.PI*radius*radius;
        Print.printTextPlusParam("Радиус круга(см)", radius);
        Print.printTextPlusParam("Площадь круга(см2)", area);
    }
}
