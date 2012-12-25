/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

public class Problem2 {
    
     public static void main(String[] args) {
        // TODO code application logic here
        int f1=0,f2=1,f=0;
        int sum = 0;
        while(f<4000000){
            f = f1+ f2;
            f1 = f2;
            f2 = f;
            if( f< 4000000 && f%2==0)   {
                sum += f;                
            }
        }
        System.out.println(sum);
        
        
    }
    
    
}
