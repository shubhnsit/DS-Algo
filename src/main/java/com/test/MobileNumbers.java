package com.test;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumbers {

    public static void main(String[] args) throws IOException {

        File inputfile = new File("/Users/shubham/input.txt");

        FileReader fileReader = new FileReader(inputfile);

        BufferedReader br = new BufferedReader(fileReader);

        String line;


        while((line = br.readLine())!=null){
            System.out.println(line);
            validateMobile(line);
        }
        br.close();

    }

    private static void validateMobile(String line) throws  IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/Users/shubham/output.txt")));

        Matcher m = Pattern.compile("(0|91)?[7-9][0-9]{9}").matcher(line);
        while(m.find()){
          System.out.println(m.group());
        }
    }


}
