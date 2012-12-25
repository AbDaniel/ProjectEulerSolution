/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author Bella Daniel
 */
public class Problem5 {
    
     public static void main(String[] args) {
        // TODO code application logic here
         
        long i = 2*3*5*7*11*13*17*19; 
        int k;
        boolean isFound = false;
        while(!isFound) {
            for(k=2;k<=20;k++)  {
                if(i%k!=0)  {
                    i++;
                    break;
                }
            }
            if(k==21)   {
                isFound = true;
            }
            
        }
      System.out.println(i);
        
    }
    
    
    
    
}
