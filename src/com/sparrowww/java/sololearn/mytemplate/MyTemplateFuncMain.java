package com.sparrowww.java.sololearn.mytemplate;

import com.sparrowww.java.Print;

public class MyTemplateFuncMain {
    static public void example(){
        getSum(16, 42L);
        getSum(15, 28);
        getSum(16.878, 42.87);
    }
    static private <T> void getSum (T var1, T var2)
    {
        String s1 = var1.toString();
        String s2 = var2.toString();
        int i1 = 0, i2 = 0;
        try {
            i1 = Integer.parseInt(s1);
        }
        catch (Exception e)
        {
            Print.printTextLn(e.toString().concat(" i1"));
        }

        try {
            i2 = Integer.parseInt(s2);
        }
        catch (Exception e)
        {
            Print.printTextLn(e.toString().concat(" i2"));
        }

        Print.printTextPlusParam(i1, i2);
        String s = s1.concat(s2);
        Print.printTextPlusParam("getSum STRING", s);
        Print.printTextPlusParam("getSum int", i1+i2);
    }
}
