package com.test;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CreateUniqueCodes {


    public static void main(String[] args) throws ParseException, IOException {
        Set<String> coupons = new HashSet<>();
        char[] chars="123456789ABCDEFGHIJKLMNPQRSTUVWXYZ".toCharArray();
        long max=10000L;
        int count = 10000;
        String outputFilePath1 = "/Users/shubham/Desktop/uniqueCodes1.csv";
        File file1 = new File(outputFilePath1);
        BufferedWriter bw1 = null;
        file1.createNewFile();
        bw1 = new BufferedWriter(new FileWriter(file1));
        for (int i = 0; i < count;) {
            long random=(long) (Math.random()*max);
            StringBuffer sb=new StringBuffer();
            int len = 0;
            while (random>0) {
                sb.append(chars[(int)(random % chars.length)]);
                random /= chars.length;
                len++;
            }
            if(len==3){
                sb.append(chars[(int)(((long) (Math.random()*max)%chars.length))]);
                len++;
            }
            if(len==4){
                sb.append(chars[(int)(((long) (Math.random()*max)%chars.length))]);
            }
            String couponCode="FKRS"+sb.toString();
//			System.out.println(couponCode);
            coupons.add(couponCode);
                    bw1.write(couponCode);
                    bw1.newLine();
                    i++;
            
        }
        bw1.flush();
        bw1.close();
    


		/*Query findQuery = new Query(Criteria.where("ir").is(true)
                .and("ibo").is(true).and("ht").is("Family").and("en").is(true));


        findQuery.fields().include("_oid").include("t").include("pim").include("du").include("ppr").include("dr").include("pn");
        MongoTemplate template = new MongoTemplate(new Mongo("poc.ixigo.net"),"qna");
		//Query findQuery = new Query(destCrit);
         List<HolidayPackage> results = template .find(findQuery.limit(10),
                HolidayPackage.class);
         for (HolidayPackage holidayPackage : results) {
 			System.out.println(holidayPackage.getTitle());
			System.out.println(holidayPackage.getOid());
			System.out.println(holidayPackage.getPackageImages());
			System.out.println(holidayPackage.getDuration());
			System.out.println(holidayPackage.getPackagePrices());
			System.out.println(holidayPackage.getDisplayRates());
			System.out.println(holidayPackage.getProviderName());
		}*/
    }


	/*public static void save(IxiCashActivityScheme activityScheme){
		Mongo mongo1 = new MongoClient(new ServerAddress("poc.ixigo.net"));

		DB db1 = mongo1.getDB("qna");
		Jongo jongo = new Jongo(db1);
		MongoCollection jongoCollection = jongo.getCollection(IXIGOMongoUtils.ACTIVITY_SCHEME);

		{
			System.out.println("Jongo Start");
			WriteResult jongoResult = jongoCollection.save(activityScheme);
			System.out.println(jongoResult);
			System.out.println("Jongo End");

		}
	}*/
}
