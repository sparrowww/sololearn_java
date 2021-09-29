package com.sparrowww.java.virtschool;

import com.sparrowww.java.Print;

public class MyCreditCalc extends MyBasicObj {
    public MyCreditCalc(){
        calcFunc();
    }
    private void calcFunc()
    {
        double annualInterestRate = 8.5; // ежегодная ставка в %
        int numberOfYears = 15; // срок кредита в годах
        double loanAmount = 2_650_000; // сумма кредита в рублях

        final int NUM_MONTHS_IN_YEAR = 12;
        int numberOfMonths = numberOfYears*NUM_MONTHS_IN_YEAR;

        double monthlyInterestRate; // ежемесячная ставка в %
        monthlyInterestRate = annualInterestRate/NUM_MONTHS_IN_YEAR/100;

        double monthlyPayment; // ежемесячный платеж в рублях
        double totalPayment; // стоимость кредита в рублях

        monthlyPayment = (loanAmount*monthlyInterestRate)/(1-(1/(Math.pow(1+monthlyInterestRate,numberOfMonths))));
        totalPayment = monthlyPayment*numberOfMonths;

//        String monthlyPaymentStr = String.format("%.2f",monthlyPayment);
        String monthlyPaymentStr = myFormatDouble(monthlyPayment,2);
//        String totalPaymentStr = String.format("%.2f",totalPayment);
        String totalPaymentStr = myFormatDouble(totalPayment,2);

        Print.printTextPlusParam("ежемесячный платеж в рублях", monthlyPaymentStr );
        Print.printTextPlusParam("стоимость кредита в рублях", totalPaymentStr );
    }
    private String myFormatDouble( Double d, int numCharacters ){
        String str = d.toString();
        int ind = str.indexOf(".");
        str = str.substring(0, ind + 1 + numCharacters);
        return str;
    }
}
