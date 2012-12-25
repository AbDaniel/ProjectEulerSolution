/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

public class Problem3 {
    
    static boolean[] numbers;
    static int last;
    
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
      int i =  ((int) Math.sqrt(600851475143.0) + 1);
      numbers = new boolean[i+1];
     primeSieve();
      int last = 0;
      int j;
      for(j = numbers.length-1; j>=2; j-- )  {
         if(!numbers[j] && (600851475143.0%j)==0)    {
             break;
         }
      }
      System.out.println(j);
 /*     i = (int) (600851475143.0/last);      
      System.out.println(i);
      numbers = new boolean[i+1];      
      primeSieve();
      last = 0;
      for(int j = 1;j<numbers.length; j++ )  {
         if(!numbers[j])    {
             last = j;
         }
      }
      
      System.out.println(last);*/
      
      
     
    }
    
}
