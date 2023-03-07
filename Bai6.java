package bai6_LaB2;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int gt=1;
		int i=1;
		
     System.out.println(" moi ban nhap vao mot so nguyen duong: ");
      int n=sc.nextInt();
      while(i<=n) {
    	  gt*=i;
    	  i++;
      }
      System.out.println(n+"!="+gt);
	}

}
