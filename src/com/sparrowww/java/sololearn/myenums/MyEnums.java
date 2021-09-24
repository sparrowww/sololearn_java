package com.sparrowww.java.sololearn.myenums;

public class MyEnums {
    public enum MyColor
    {
        MY_RED,
        MY_GREEN,
        MY_BLUE,
        MY_UNKNOWN_COLOR
    }
    public MyColor getColorByNum(int colorNum){
        MyColor tmpColor;
        switch (colorNum)
        {
            case 0:
                tmpColor = MyColor.MY_RED;
            break;
            case 1:
                tmpColor =  MyColor.MY_GREEN;
            break;
            case 2:
                tmpColor =  MyColor.MY_BLUE;
            break;
            default:
                tmpColor =  MyColor.MY_UNKNOWN_COLOR;
        }
        return tmpColor;
    }
    public int getNumByColor (MyColor color){
        int num;
        switch (color)
        {
            case MY_RED:
                num = 0;
                break;
            case MY_GREEN:
                num = 1;
                break;
            case MY_BLUE:
                num = 2;
                break;
            case MY_UNKNOWN_COLOR:
                num = -1;
                break;
            default:
                num = -2;
        }
        return num;
    }

}
