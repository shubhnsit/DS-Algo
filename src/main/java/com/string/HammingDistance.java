package com.string;

public class HammingDistance {

        public static int hammingDistance(int x, int y) {

            StringBuilder bX = binary(x,new StringBuilder());
            System.out.println("bx is ---"  +bX);

            StringBuilder bY = binary(y,new StringBuilder());
            System.out.println("bY is ---" + bY);
            int diff =0;
            if(bX.length()>bY.length()){
                diff = bX.length()-bY.length();
                bY = generatePrefix(diff).append(bY);
            }
            else{
                diff = bY.length()-bX.length();
                bX = generatePrefix(diff).append(bX);
            }

            int count = 0;
            System.out.println("updated bx is ---"  +bX);
            System.out.println("updated bY is ---" + bY);

            for(int i=0;i< bX.length();i++){
                if(bX.charAt(i)!=bY.charAt(i)){
                    count++;
                }
            }
            return count;

        }

    private static StringBuilder generatePrefix(int diff) {
            StringBuilder sb = new StringBuilder();
            while(diff>0){
                sb.append("0");
                diff--;
            }
            return sb;
    }

    static StringBuilder binary(int n,StringBuilder bn){
            if(n>1){
                binary(n/2,bn);
            }

            return bn.append(n%2);
        }


    public static void main(String[] args) {
        System.out.print(hammingDistance(2,7));

    }
    }

