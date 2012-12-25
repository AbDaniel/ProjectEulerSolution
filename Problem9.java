/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bella Daniel
 */
public class Problem9 {

    public static void main(String[] args) {
        // TODO code application logic here

        List<Integer> perfectSquares = new ArrayList<Integer>();
        List<Integer> bList = new ArrayList<Integer>();
        List<Pair> acList = new ArrayList<Pair>();
        double d;
        int k;
        for (int i = 2; i <= 1000*1000; i++) {
            d = Math.sqrt(i);
            k = (int) d;
            if (k == d) {
                perfectSquares.add(k);
            }
        }
        
        Pair temp;
        for (int a : perfectSquares) {
            for (int c : perfectSquares) {
                if(a!=c && a%2!=0 && c%2!=0)    {
                    
                    if(a>c) {
                        temp = new Pair(c,a);
                    }
                    else    {
                        temp = new Pair(a,c);
                    }
                    if(!acList.contains(temp)){
                        acList.add(temp);
                    }
                }
            }
            if(a%2==0)  {
                bList.add(a*a);
            }
        }
        
         
        for(Pair x : acList)    {
            for(int b : bList)  {
                if(b==x.left)
                    if(x.a+x.c+(int)Math.sqrt(b) ==1000)    {
                        System.out.println(x.a*x.c*Math.sqrt(b));
                    }
               
            }
        }
        
        
        
        
    }
}

class Pair {

    int a;
    int c;
    int left;

    Pair(int a, int c) {
        this.a = a;
        this.c = c;
        left = c*c - a*a;
    }
    
    @Override
    public boolean equals(Object o)    {
        Pair t = (Pair) o;
        if((this.a==t.a && this.c==t.c) || (this.a==t.c && this.c==t.a)){
            return true;
        }
        return false;
    }
    
    public String toString()    {
        return "(" + this.c + " , " + a + ")";
    }
}