package com.arrays;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Leaders {

    private static final SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    private static final SimpleDateFormat dateFormatter1 = new SimpleDateFormat("ddMMyyyy");

    public static void main(String[] args) throws ParseException {
        int arr[] = {1, 4, 3, 2, 5};
//        subarray(arr,arr.length);

        Path pdfPath = Paths.get("http://rgiclservices.reliancegeneral.co.in/XPASDemoPolicyScheduleGeneration/Report/Covid/PolicyReport.aspx?cerno=pLWNmEKfoDCG426X2s5+YSBZurSQrY6v");
        try {
            byte[] pdf = Files.readAllBytes(pdfPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return;

    }
// 41, 43, 32, 52, 54, 53

    private static void subarray(int[] arr, int n) {

        Set<Pair> pair = new HashSet<>();

        int max = arr[0]>arr[1] ? arr[0] : arr[1];
        int secondMax = max==arr[0] ? arr[1] : arr[0];
      //  pair.add(new Pair(max,secondMax));
        int count =2;
        for(int i=1;i<n;i++){
          for(int j=i;j<count;j++){
             if(max<arr[j]){
                 secondMax = max;
                 max = arr[j];
             }
             else if(max>arr[j] && arr[j]>secondMax){
                 secondMax = arr[j];
              }
              pair.add(new Pair(max,secondMax));

          }
          count++;

        }


        for(int i=0;i<pair.size();i++){
            System.out.println(String.valueOf(pair.toArray()[i]));
        }

    }


    static class Pair{
        int a;
        int b;

        Pair(int a,int b){
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return a == pair.a &&
                    b == pair.b;
        }

        @Override
        public int hashCode() {

            return Objects.hash(a, b);
        }
    }


    // 6 2 5 4 5 1 2







}






