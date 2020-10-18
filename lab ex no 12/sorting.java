/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericprgm;
import java.util.Arrays;
/**
 *
 * @author sharmila
 */
public class sorting {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Integer a[]={5,7,3,6,2,9};
        ascending<Integer> obj=new ascending<Integer>(a);  
        obj.display();
        
    }
    
}
class ascending<T>
{
    T[] i;
    public ascending(T[] i)
    {
        this.i=i;
    }
    public void display()
    {
       Arrays.sort(i);   
        System.out.println(Arrays.toString(i));
    }
}

