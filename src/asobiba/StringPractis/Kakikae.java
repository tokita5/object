package asobiba.StringPractis;

import java.util.Random;

class Kakikae {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int sum = 0;
        while (sum<50000) {
            sum += random.nextInt(100);
            count++;
        }
        System.out.println(count + "回");
    }
        }

