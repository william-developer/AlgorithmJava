package com.Algorithm;

import java.util.Arrays;

public class QuickSort {
	public static void sort(int arr[],int low,int high)
	 {
	System.out.println("排序原始数组："+Arrays.toString(arr));
	 int l=low;
	 int h=high;
	 int povit=arr[low];
	 
	 while(l<h)
	 {
	 while(l<h&&arr[h]>=povit)
	 h--;
	 if(l<h){
	 int temp=arr[h];
	 arr[h]=arr[l];
	 arr[l]=temp;
	 l++;
	 }
	 
	 while(l<h&&arr[l]<=povit)
	 l++;
	 
	 if(l<h){
	 int temp=arr[h];
	 arr[h]=arr[l];
	 arr[l]=temp;
	 h--;
	 }
	 }
	 System.out.print("l="+(l+1)+"h="+(h+1)+"povit="+povit+"\n");
	 if(l>low)sort(arr,low,h-1);
	 if(h<high)sort(arr,l+1,high);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{
				5,4,3,2,1
		};
		sort(a,0,a.length-1);
	}

}
