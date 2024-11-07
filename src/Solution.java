import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import static java.lang.System.in;  
/**
 * En este código, la línea import static java.lang.System.in; se utiliza para importar de manera estática el campo in de la clase java.lang.System. El campo in se refiere al flujo de entrada estándar (System.in), que normalmente se usa para leer datos de entrada desde el teclado en Java.
Esta importación estática permite que se haga referencia a in directamente, sin necesidad de escribir System.in. En tu código:
 */

class Prime {
    void checkPrime(int... numbers) {
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    
    boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }     
}// class Prime
public class Solution {
	 public static void main(String[] args) {
	        try{
	        BufferedReader br=new BufferedReader(new InputStreamReader(in));
	        int n1=Integer.parseInt(br.readLine());
	        int n2=Integer.parseInt(br.readLine());
	        int n3=Integer.parseInt(br.readLine());
	        int n4=Integer.parseInt(br.readLine());
	        int n5=Integer.parseInt(br.readLine());
	        Prime ob=new Prime();
	        ob.checkPrime(n1);
	        ob.checkPrime(n1,n2);
	        ob.checkPrime(n1,n2,n3);
	        ob.checkPrime(n1,n2,n3,n4,n5);    
	        Method[] methods=Prime.class.getDeclaredMethods();
	        Set<String> set=new HashSet<>();
	        boolean overload=false;
	        for(int i=0;i<methods.length;i++)
	        {
	            if(set.contains(methods[i].getName()))
	            {
	                overload=true;
	                break;
	            }
	            set.add(methods[i].getName());
	            
	        }//for
	        if(overload)
	        {
	            throw new Exception("Overloading not allowed");
	        }
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	    }
	
}// class Solution










