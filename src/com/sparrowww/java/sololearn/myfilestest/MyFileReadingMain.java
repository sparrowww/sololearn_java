package com.sparrowww.java.sololearn.myfilestest;

import com.sparrowww.java.Print;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class MyFileReadingMain {
    public static void example(){
        final String fileName = "./myfiles/file.txt";
        try{
            File myFile = new File(fileName);
            if (myFile.exists())
            {
                Print.printTextPlusParam("Найден файл", myFile.getName());
                Scanner scanFile = new Scanner(myFile);
                parseFile(scanFile);
                scanFile.close();
            }
            else
            {
                Print.printTextPlusParam("Нет такого файла", fileName );
            }
        }catch (Exception e){
            Print.printText(e.toString());
        }


    }

    private static final boolean withLambda = false;

    private static void parseFile( Scanner scan ){
        ArrayList<String> strList = new ArrayList<>();

        if (!withLambda) {
            Print.printText("Вывод файла!");
            while (scan.hasNext()) {
                strList.add(scan.next());
            }

            int itr = 0;
            for (String s:strList)
            {
                Print.printTextPlusParam(itr, s);
                itr++;
            }
        }
        else {
            Print.printText("Вывод файла с лямбдой!");
            AtomicInteger Itr = new AtomicInteger();
            scan.forEachRemaining(strList::add);
            strList.forEach((Str)->{Print.printTextPlusParam(Itr,Str);Itr.getAndIncrement();});
        }
    }
}
