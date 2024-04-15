import java.util.*;
class chk{
    Scanner sc = new Scanner(System.in);
    chk(){
        System.err.print("Enter a Stirng :");
        String str=sc.nextLine();
        System.err.println("------------------------------------");
        System.err.println("String :"+str);
        System.err.println("------------------------------------");
        String substr[] = str.split(" ");
        System.err.println("Word\t\tVowel");
        for(String word : substr)
        {
            int count = 0;
            System.err.print(word+"\t\t");
            for(int i=0;i<word.length();i++)
            {
                char j = word.toLowerCase().charAt(i);
                if(j=='a' || j=='e' || j=='i' || j=='o' || j=='u')
                {
                    count++;
                }
            }
            System.err.println(count);
        }
    }
}
class Vowel{
    public static void main(String[] args) {
        chk c = new chk();
    }
}