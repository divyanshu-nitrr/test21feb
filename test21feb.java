 1.
package com.org.java_test_21;

import java.util.Scanner;

public class Bill {
	public static int calculateElectricityBill(String inp1, String inp2, int inp3) {
		int n1 = Integer.parseInt(inp1.substring(5, inp1.length()));
		int n2 = Integer.parseInt(inp2.substring(5, inp2.length()));
		int n = Math.abs((n2 - n1) * inp3);
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int n = sc.nextInt();
		int n1 = calculateElectricityBill(s1, s2, n);
		System.out.println( n1);
		sc.close();
	}
}

..............................
2.
package com.org.java_test_21;

import java.util.Scanner;
public class password_check {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    if (a.length() >= 8) {
      if (a.contains("#") || a.contains("@") || a.contains("_")) {
        char c = a.charAt(0);
        //System.out.println(c);
        if (Character.isAlphabetic(c)) {
          char dd = a.charAt(a.length() - 1);
          
          if ((Character.isAlphabetic(dd)) || (Character.isDigit(dd)))
          {
            if (a.matches(".[0-9]{1,}.")
                || a.matches(".[a-zA-Z]{1,}.")) {
              System.out.println("Valid");
            } else
              System.out.println("Inalid");
            
          } else
            System.out.println("Invalid");
          
        }
         else
            System.out.println("Invalid");
          
      } else
        System.out.println("Invalid");
      
    } else
      System.out.println("Invalid");
    
  }
}

...............................
3
package com.org.java_test_21;

import java.util.*;
import java.util.Scanner;
public class UserMainCode_NCR
{    
	static int nCr(int n, int r)   
    {   
          return fact(n) / (fact(r) * fact(n - r));   
    }   
     
	static int fact(int n)   
    {   
          int res = 1;   
          for (int i = 2; i <= n; i++)   
          res = res * i;   
          return res;   
    }   
   public static void main(String[] args)   
   {   
    
	   Scanner sc = new Scanner(System.in);  
         
       System.out.println("Enter the value of n :");  
       int n = sc.nextInt();   
       System.out.println("Enter the value of r :");
       int r = sc.nextInt();   
       if(n>=r)
	   {
	        
            System.out.println("value of ncr:  "+nCr(n, r)); 
	   }
		else
		  System.out.println("Value of n should be greater than or equal to r value");
   }   
}  
...............................
4
package com.org.java_test_21;
 
import java.util.Scanner;
public class Validate_String {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Enter the string");
        String s1 = s.next();
        boolean b = validateColorCode(s1);
        if (b == true)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
    public static boolean validateColorCode(String s1) {
        boolean b = false, b1 = false;
        String s2 = s1.substring(1, s1.length());
        if (s1.length() == 7)
            if (s1.charAt(0) == '#')
            b1 = true;
        if (b1 == true)
            for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (c != '#') {
                if (s2.matches("[A-Fa-f0-9]{6}|[A-Fa-f0-9]{3}"))
                    b = true;
                else {
                    b = false;
                    break;
                }
            }
        }
        return b;
    }
}

