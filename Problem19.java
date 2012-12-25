/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.math.BigInteger;
import java.util.Calendar;

public class Problem19 {
    
    static int fact(int n)   {
    
        BigInteger f = new BigInteger("1");
        for(int i =1;i<=100;i++)    {
            f=f.multiply(f.valueOf(i));
        }
        int sum=0;
        while(!f.equals(BigInteger.valueOf(0))){
            sum+=f.mod(BigInteger.valueOf(10)).intValue();
            f = f.divide(BigInteger.valueOf(10));
        }
        return sum;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here

        int[] days = new int[12];
        days[0] = 1;
        days[1] = 4;
        days[2] = 4;
        days[3] = 0;
        days[4] = 2;
        days[5] = 5;
        days[6] = 0;
        days[7] = 3;
        days[8] = 6;
        days[9] = 1;
        days[10] = 4;
        days[11] = 6;


        int j = 1;
        int count = 0;
        for (int i = 1900; i < 2000; i++) {
            j = 1;
            if (i % 4 == 0) {
                j = 2;
            }
            if (i % 100 == 0 && i % 400 != 0) {
                j = 1;
            }
            for (int k = 0; k < days.length; k++) {
                days[k] = (days[k] + j) % 7;
                if (days[k] == 0) {
                    count++;
                }
            }
            if (i == 1998) {
                for (int x : days) {
                    System.out.println(x);
                }

            }
        }
        System.out.println(count);
        count = 0;
        Calendar c = Calendar.getInstance();
        for (int i = 1901; i <= 2000; i++) {
            for (int p = 0; p < 12; p++) {
                c.set(i, p, 1);
                if(c.get(Calendar.DAY_OF_WEEK)==c.SUNDAY)
                    count++;
            }
        }
        
        System.out.println(count);
        System.out.println(fact(100));

    }
}
