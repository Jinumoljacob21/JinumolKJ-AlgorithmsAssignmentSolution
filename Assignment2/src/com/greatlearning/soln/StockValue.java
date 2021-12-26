package com.greatlearning.soln;

public class StockValue {

	public void findStockvalue(int[] arr, int first,int last, int searchElement) {
			first=0;
			last=arr.length-1;
			int mid=(first+last)/2;
			while(first<=last) {
				if(arr[mid]<searchElement ) {
					
			
				first=mid+1;
			}
				else if(arr[mid]==searchElement) {
					System.out.println("Stock value "+searchElement+" is present");
					break;
				}
				else {
					last=mid-1;
				}
			
			mid=(first+last)/2;
			}
			if(first>last) {
				System.out.println("value not found");
			}
			
		}
		
	}


