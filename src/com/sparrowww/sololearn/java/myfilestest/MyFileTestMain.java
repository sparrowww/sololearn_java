package com.sparrowww.sololearn.java.myfilestest;

import com.sparrowww.sololearn.java.Print;

import java.io.File;
import java.util.Scanner;

public class MyFileTestMain {
    public static void example(){
        final String fileName = "./myfiles/file.txt";
        File myFile = null;
        try{
            myFile = new File(fileName);
            Scanner scanFile = new Scanner(myFile);
        }catch (Exception e){
            Print.printText(e.toString());
        }

        if (myFile.exists())
        {
            Print.printTextPlusParam("Найден файл", myFile.getName());

        }
        else
        {
            Print.printTextPlusParam("Нет такого файла", fileName );
        }
    }
}
