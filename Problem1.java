/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author Bella Daniel
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        for(int i = 3;i<1000 ; i++) {
            if(i%3==0 || i%5==0)    {
                sum += i;
            }
        }
        System.out.println(sum);
        
    }
}
