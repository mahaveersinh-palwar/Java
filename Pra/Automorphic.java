import java.util.*;

class chk{
    Scanner sc = new Scanner(System.in);
    chk(){
        System.err.print("Enter Any Number :");
        int no = sc.nextInt();
        int sqr = no*no;
        int temp=no,temp2=sqr;
        
        temp  = no%10;
        temp2 = sqr%10;
        if(temp==temp2)
            System.err.println("Given Number is Automorphic..");
        else
            System.err.println("Given Number is not Automorphic..");

    }
}
public class Automorphic{
    public static void main(String[] args) {
        chk k = new chk();
    }

}