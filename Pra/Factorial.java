import java.util.*;

class chk_fact
{    
    Scanner sc;
    int num , fact =1;
    chk_fact()
    {   
        sc = new Scanner(System.in); 
        System.out.print("Enter Number :-");
        num =  sc.nextInt(); 
    
        for(int i=1; i<=num ;i++)  
        {
            fact = fact * i;
        }

         System.out.print(num+"Factorial Is :-"+fact);
    }
}

class Factorial
{
    public static void main(String[] args) 
    {
        chk_fact cf = new chk_fact();
    }
}