package void¹öÀü;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int s[][];
    static ArrayList<Integer>first=new ArrayList<>();
    static ArrayList<Integer>second=new ArrayList<>();
    static int ans=-1;
    static void check() {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n/2;i++) {
            for(int j=0;j<n/2;j++) {
                if(i==j)continue;
                sum1+=s[first.get(i)][first.get(j)];
                sum2+=s[second.get(i)][second.get(j)];
            }
        }
        int dift=Math.abs(sum1-sum2);
        if(ans == -1 || ans>dift)ans=dift;
    }


    public  static void go(int index,ArrayList<Integer>first,ArrayList<Integer>second) {
        if(index==n&&first.size()==n/2&&second.size()==n/2) {
            check();
            return;
        }
        if(index>n)return;
        first.add(index);
        if(first.size()>n/2) {
            first.remove(first.size()-1);
            return;
        }
        go(index+1,first,second);
        first.remove(first.size()-1);

        second.add(index);
        if(second.size()>n/2) {
            second.remove(second.size()-1);
            return;
        }
        go(index+1,first,second);
        second.remove(second.size()-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s=new int[n][n];

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                s[i][j]=sc.nextInt();
            }
        }
        go(0,first,second);
        System.out.println(ans);
    }


}