import java.util.*;

class chk {
    Scanner sc = new Scanner(System.in);

    chk() {
        System.err.print("Enter Size Of An Array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] newarr = new int[arr.length-1];
        for (int i = 0; i < size; i++) {
            System.err.print("Enter An Element arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        System.err.println("------------------------------------");
        System.err.print("Array Before Deleting The Element : ");
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }
        System.err.println("\n------------------------------------");

        System.err.print("Enter An Element Which You Want To Delete :");
        int val = sc.nextInt();
        boolean val2 = false;
        int d = 0;
        for (int i = 0; i < arr.length; i++) {
            if (val == arr[i]) {
                val2 = true;
            } else {
                if(d==newarr.length)
                    break;
                newarr[d] = arr[i];
                d++;
                // val2 = true;
            }
        }
        if (val2) {
            System.err.println("------------------------------------");
            System.err.print("Array After Deleting The Element : ");
            for (int i = 0; i < newarr.length; i++) {
                System.err.print(newarr[i] + " ");
            }
            System.err.println("\n------------------------------------");
        } else
            System.err.println("Element Not found In the Array..");
    }
}

public class Arr_del {
    public static void main(String[] args) {
        chk c = new chk();
    }
}