
package com.test;

import java.io.*;
import java.text.ParseException;
import java.util.*;


public class CreateUniqueCodes1 {


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
            Random rnd = new Random();
            int n = 10000000 + rnd.nextInt(900000);
            String couponCode="FKRS"+n;
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
