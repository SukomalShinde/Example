package com.arrays;
import java.util.Scanner;
public class Set6 {
	
	public static void main(String[] args) {
		//practice problem 1
		/*
		 * float [] marks= {45.3f,58.5f,89.7f,63.5f,100.0f};
		 * 
		 * float sum=0; for(float elements : marks) {
		 * 
		 * sum= sum+elements; }
		 * 
		 * System.out.println("the value of sum is   =" +sum);
		 */
		// practice problem 2
		/*float [] marks= {45.3f,58.5f,89.7f,63.5f,100.0f};

		Scanner sc= new Scanner(System.in);
        
		System.out.println("The value is = ");
		float f=sc.nextFloat();
		boolean isInarry=false;
		for(float elements : marks) {
			if(elements==f) {
				isInarry=true;
				break;
			}
		}

		if(isInarry) {
			
			System.out.println("the value is present in the array");
		}else {
			System.out.println("the value is not present in the array");
		}
	}*/
	int [] i= {1,1,2,3,4,5,6,7,8,1,5,7};
	int count=0;
	for(int m : i) {
		
	if(m==1) {
		count++;
	}	
	}
	System.out.println(count);
	}
}
