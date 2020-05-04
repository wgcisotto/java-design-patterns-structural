package com.wgcisotto.structural.decorator;

import java.io.*;

public class DecoratorEverydayExample {

    public static void main(String[] args)  {

        File file = new File("./output.txt");

        try(OutputStream oStream = new FileOutputStream(file);
                DataOutputStream doStream = new DataOutputStream(oStream)){

            file.createNewFile();

            doStream.writeChars("text");
        }catch (Exception ex){
            System.out.println("ERROR: " +  ex.getMessage());
        }
    }

}
