/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author Bella Daniel
 */
public class Problem4 {

    public static void main(String[] args) {
        // TODO code application logic here
        int i = 999;
        int j = 999;
        int product = 0;
        StringBuilder str = new StringBuilder("song");
        StringBuilder rstr = new StringBuilder("song");

        int count = 0;        
        int max = -1;
        for (; i >= 100; i--) {
            for (j = 999; j >= 100; j--) {
                count++;
                product = i * j;
                str = new StringBuilder(Integer.toString(product));
                rstr = new StringBuilder(Integer.toString(product));
                rstr = rstr.reverse();
                if (str.toString().equals(rstr.toString())) {
                    //      System.out.println(str);
                    if(product > max)   {
                        max = product;
                    }
                    break;
                }

            }
        }
        System.out.println(max + " " + count);



    }
}
