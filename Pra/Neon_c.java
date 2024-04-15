import java.util.Scanner;

class Neon{

     Scanner sc; 
    Neon()
    {    sc = new Scanner(System.in); 
         System.out.print("Enter Number :-");
        int num =sc.nextInt();
        int sum =0 ;
        int sqr = num*num;

        while(sqr != 0)
        {
            int digit = sqr % 10;
            sum  = sum + digit;
            sqr = sqr / 10;
        }
        if(sum  == num )
        {
               System.out.println(num + " is a Neon Number.");
        } else 
        {
            System.out.println(num + " is not a Neon Number.");
        }
        

    }
}

class Neon_c {
    public static void main(String[] args) 
    {
             
        Neon ob = new Neon();
       
    }
}