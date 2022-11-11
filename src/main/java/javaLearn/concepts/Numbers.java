package javaLearn.concepts;

import java.util.Arrays;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n =6;
        // 0,1,1,2,3,5
		int[] fi= new int[n+1];
       // if(n==0) return 0;
       // if(n==1) return 1;
        fi[0] = 0;
        fi[1] = 1;
        for(int i=2; i<=n;i++)
        {
            fi[i] = fi[i-1] + fi[i-2];
        }        
        System.out.println(Arrays.toString(fi));
        System.out.println(fi[n]);
	}

}
