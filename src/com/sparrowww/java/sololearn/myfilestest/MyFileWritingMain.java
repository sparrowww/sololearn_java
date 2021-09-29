package com.sparrowww.java.sololearn.myfilestest;

import com.sparrowww.java.Print;

import java.util.Formatter;
import java.util.Scanner;

public class MyFileWritingMain {
    private static final String fileName = "./myfiles/fileWriting.txt";
    public static void example(){
        Scanner scan = new Scanner(System.in);
        try {
            Formatter myFormatter = new Formatter(fileName);
            myFormatter.format("Hello, World!\n123456789\n");
            myFormatter.format("String = %s\n", "йцукен");
            myFormatter.format("float = %.5f\n", 3.14159);
            myFormatter.format("int = %d\n", 42);
            myFormatter.format("boolean = %b\n", true);
            Print.printTextLn("Введите свой текст далее:");
            myFormatter.format("My in Str = %s\n", scan.next());
            myFormatter.close();
        }
        catch (Exception e)
        {
            Print.printTextPlusParam("Exception", e.toString());
        }
   }

}
