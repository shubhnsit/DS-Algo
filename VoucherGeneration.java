import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class VoucherGeneration {
    public VoucherGeneration() {
    }

    public static void main(String[] var0) throws Exception {
        byte var1 = 0;
        int var2 = 1;
        String var3 = var0[0];
        String var4 = "TESTFOOD";
        int var5 = Integer.parseInt(var0[1]);
        int var6 = Integer.parseInt(var0[2]);
        FileWriter var7 = new FileWriter(var3.replace(" ", "-") + "-coupons-all.csv");
        PrintWriter var8 = new PrintWriter(var7);
        HashSet var9 = new HashSet();
        Object var10 = new HashSet();
        LinkedHashSet var11 = new LinkedHashSet();
        String var13 = "-" + var3.replace(" ", "-") + "-coupons.csv";
        String var14 = var3.replace(" ", "-") + "-coupons.js-";
        FileWriter var15 = new FileWriter(var2 + var13);
        PrintWriter var16 = new PrintWriter(var15);
        FileWriter var17 = new FileWriter(var14 + var2);
        PrintWriter var18 = new PrintWriter(var17);
        var18.write("var qnaDB = db.getSisterDB(\"qna\");\nvar voucherCodes=[");
        char[] var19 = "123456789ABCDEFGHIJKLMNPQRSTUVWXYZ".toCharArray();
        long var20 = 1000L;

        do {
            StringBuffer var22;
            do {
                var22 = (new StringBuffer()).append(var0[3]);

                for(int var23 = 0; var23 < 2; ++var23) {
                    long var24 = (long)(Math.random() * (double)var20);

                    int var26;
                    for(var26 = 0; var24 > 0L; ++var26) {
                        var22.append(var19[(int)(var24 % (long)var19.length)]);
                        var24 /= (long)var19.length;
                    }

                    if (var26 == 1) {
                        var22.append(var19[(int)((long)(Math.random() * (double)var20) % (long)var19.length)]);
                        ++var26;
                    }

                    if (var26 == 2) {
                        var22.append(var19[(int)((long)(Math.random() * (double)var20) % (long)var19.length)]);
                        ++var26;
                    }
                }
            } while(var9.contains(var22.toString()));

            var9.add(var22.toString());
            ((Set)var10).add(var22.toString());
            if (((Set)var10).size() == var5) {
                ++var2;
                Iterator var27 = ((Set)var10).iterator();

                while(var27.hasNext()) {
                    String var28 = (String)var27.next();
                    var16.write(var28.toLowerCase() + "\n");
                    var8.write(var28.toLowerCase() + "\n");
                    var18.write("\"" + var28.toLowerCase() + "\"");
                    if (var27.hasNext()) {
                        var18.write(",");
                    }
                }

                var18.write("];\n var count = 0;\nvar coupon = qnaDB.iximoney_coupons.findOne({couponCode : \"" + var4 + "\"});\nprintjson(coupon);\nvoucherCodes.forEach(function(couponCode){\n        delete coupon._id ;\n        coupon.couponCode = couponCode;\n        print(qnaDB.iximoney_coupons.insert(coupon));\n\n        count = count + 1;\n        if (count % 2000 == 0) {\n                 sleep(3000);\n        }\n        print(count);\n});");
                var15.close();
                var16.close();
                var17.close();
                var18.close();
                var10 = new LinkedHashSet();
                if (var9.size() == var6) {
                    break;
                }

                var15 = new FileWriter(var2 + var13);
                var16 = new PrintWriter(var15);
                var17 = new FileWriter(var14 + var2);
                var18 = new PrintWriter(var17);
                var18.write("var qnaDB = db.getSisterDB(\"qna\");\nvar voucherCodes=[");
            }
        } while(var9.size() != var6);

        var8.close();
        System.out.println("Count mismatch: " + var1);
        System.out.println(var11);
    }
}
