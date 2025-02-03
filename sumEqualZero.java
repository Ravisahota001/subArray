import java.io.*;
import java.util.*;
public class sumEqualZero {


    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
            
        }
        if(printAllSub(arr,n)){
        System.out.println("true");
        }else{
            System.out.println("false");
        }
    
    }
    public static boolean printAllSub(int [] arr,int n){
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                for(int p = i; p <= j; p++){
                  if(arr[i] + arr[j] == 0){
               return true;
                  }
                }
                }
        }
        return false;
    }
}

