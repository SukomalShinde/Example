package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
	
	public static void main(String[] args) {
		
		int[] num= {1,2,3,1,4,5,7,4,5,7,5,7};
		
		Set<Integer> set= new HashSet<Integer>();
		boolean isDuplicateExits=false;
		for(int i= 0; i<=num.length-1;i++) {
			if(set.contains(num[i])) {
				isDuplicateExits=true;
				System.out.println("Duplicate number is "+num[i]);
				
			}else {set.add(num[i]);
			
			if(!isDuplicateExits) {System.out.println(-1);}
			
			}
		
		
		}
		
	}
}
