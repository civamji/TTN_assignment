package que2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2 {
    static int compare(String str1,String str2)
    {

        int a=0;
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = (l1<l2)?l1:l2;

        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
        if (l1 != l2) {
            return l1 - l2;
        }
        else {
            return 0;
        }

    }
    public static void main(String[] args) {
        BufferedReader br=null;
        try{
            System.out.println("Enter a string: ");
            br=new BufferedReader(new InputStreamReader(System.in));
            //read line
            String str=br.readLine();
            String[] arr=str.split(" ");
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    if(compare(arr[i],arr[j])<0){
                        String temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}