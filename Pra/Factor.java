import java.util.*;
class get{
    Scanner sc = new Scanner(System.in);
    get(){
        System.err.print("Enter Any Number :");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0)
                System.err.println(i);
        }
    }
}
public class - {
    public static void main(String[] args) {
        get g = new get();
    }
}