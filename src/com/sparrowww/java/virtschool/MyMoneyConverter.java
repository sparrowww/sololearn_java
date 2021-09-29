package com.sparrowww.java.virtschool;

import com.sparrowww.java.Print;
import org.jetbrains.annotations.NotNull;

public class MyMoneyConverter extends MyBasicObj{
    private final Double COURSE_USD_RUB = 72.7875; // курс на 29.09.2021
    public MyMoneyConverter(){
        RUB_USD_CONV();
        Print.printTextLn("");
        USD_RUB_CONV();
    }

    private void RUB_USD_CONV(){
        MyMoney myRUB = new MyMoney("RUB");
        myRUB.setAmountMoney(90000.0 * 0.87);
        MyMoney myUSD = new MyMoney("USD");
        Print.printTextPlusParam(myRUB.getNameMoney(), myRUB.getAmountMoney());
        rubUsdConv ( myRUB, myUSD, COURSE_USD_RUB );
        Print.printTextPlusParam(myUSD.getNameMoney(), myUSD.getAmountMoney());
    }
    private void USD_RUB_CONV(){
        MyMoney myUSD = new MyMoney("USD");
        myUSD.setAmountMoney(1000.0);
        MyMoney myRUB = new MyMoney("RUB");
        Print.printTextPlusParam(myUSD.getNameMoney(), myUSD.getAmountMoney());
        usdRubConv ( myUSD, myRUB, COURSE_USD_RUB );
        Print.printTextPlusParam(myRUB.getNameMoney(), myRUB.getAmountMoney());
    }

    private void rubUsdConv(@NotNull MyMoney inRUB, @NotNull MyMoney outUSD, Double courseUSDRUB ){
        Double tmp = inRUB.getAmountMoney()/courseUSDRUB;
        outUSD.setAmountMoney(tmp);
    }
    private void usdRubConv(@NotNull MyMoney inUSD, @NotNull MyMoney outRUB, Double courseUSDRUB ){
        Double tmp = inUSD.getAmountMoney()*courseUSDRUB;
        outRUB.setAmountMoney(tmp);
    }

    private static class MyMoney {
        private Double amountMoney;
        private final String nameMoney;
        private MyMoney( String nameMoney){
            this.nameMoney = nameMoney;
            amountMoney = 0.0;
        }
        private Double getAmountMoney() {
            return amountMoney;
        }
        private void setAmountMoney(Double amountMoney) {
            this.amountMoney = amountMoney;
        }
        private String getNameMoney() {
            return nameMoney;
        }
    }
}
