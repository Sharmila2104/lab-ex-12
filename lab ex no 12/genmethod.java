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
public class genmethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer a[]={1,2,3,4,5};
        meth<Integer> obj=new meth<Integer>(a);
        obj.checkodd();
        obj.exchange(1,3);
        System.out.println("The maximum element in the list is:"+obj.max()); 
        
    }
    
}
class meth<T extends Number>
{
    T[] b;
    int odd=0;
    int max;

   public meth(T[] b)
   {
       this.b=b;
   }
   public void checkodd() 
   {
       for (int i = 0; i < b.length; i++)
       {
           if((Integer)b[i]%2!= 0)
           {
             odd++;  
           }
       }
       System.out.println("The number of odd integer is:"+odd); 
   }
   public void exchange(int c,int d) 
   {
       for (int i = 0; i < b.length; i++) 
       {
           if(b[i]==b[c])
           {
               Object temp=b[c];
               b[c]=b[d]; 
               b[d]=(T) temp;
           }
       }
       System.out.println("The array after exchanging the position of two element is:" +Arrays.toString(b)); 
   }
   public T max()
   {
      Arrays.sort(b);     
      return b[(b.length)-1]; 
       }
}