package com.greatlearning.soln;

public class CompaniesStock {
	 void stockPrices(int left,int right,int arr[]) {
		 if(left<right) {
			 int mid=(left+right)/2;
			 stockPrices(left,mid,arr);
			 stockPrices(mid+1,right,arr);
			 prices(left,right,mid,arr);
		 }
	 }

	private void prices(int left, int right, int mid, int[] arr) {
		int n1=mid-left+1;
		int n2=right-mid;
		int leftarr[]=new int[n1];
		int rightarr[]=new int[n2];
		for(int i=0;i<n1;i++) {
			leftarr[i]= arr[left+i];
		}
		for(int j=0;j<n2;j++) {
			rightarr[j]=arr[mid+1+j];
		}
		int i=0,j=0,k=left;
		while(i<n1&j<n2) {
			if(leftarr[i]<=rightarr[j]) {
				arr[k]=leftarr[i];
				i++;
			}else {
				arr[k]=rightarr[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=leftarr[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rightarr[j];
			j++;
			k++;
		}
		
		
	}


}
