/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author Bella Daniel
 */
public class Problem7 {

    static boolean[] numbers;

    public static void primeSieve() {
        numbers[1] = true;
        numbers[0] = true;
        int i, j;
        for (i = 4; i < numbers.length; i += 2) {
            numbers[i] = true;
        }
        for (i = 3; i < Math.sqrt(numbers.length) + 1; i += 2) {
            if (!numbers[i]) {
                for (j = i + i; j < numbers.length; j += i) {
                    if (!numbers[j]) {
                        numbers[j] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        numbers = new boolean[2000001];
        primeSieve();
        long count= 0;
        int i;
        
        for( i = 0;i<numbers.length;i++)    {
            if(!numbers[i])  {
                count+=i;
            }
        }
        
        System.out.println(count);
        
        
    }
}
