package com.Algorithm;

import java.util.Arrays;

/**
 * 
 * @ClassName: SelectionSort
 * @Description: TODO(选择排序)
 * @author william
 * @date Feb 2, 2015 4:13:42 PM
 * @rule
 * 每次从无序区选择一个最小的值
 * 时间复杂度O(n^2)
 */
public class SelectionSort {
	public static void sort(int[] a)
	{
		if((a==null)||(a.length==0))
			return;
		int minIndex=0;
		System.out.println("排序原始数组："+Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			minIndex = i;	
			for(int j=i+1;j<a.length;j++) 
			{
			    if(a[j]<a[minIndex])
				{
			    	minIndex= j;
				}
			    if(minIndex!=i)
			    {
			    	a[i] = a[i]^a[minIndex];
			    	a[minIndex] = a[i]^a[minIndex];
			    	a[i] = a[i]^a[minIndex];
			    }
				
			}
			System.out.println("第"+(i+1)+"次排序结果："+Arrays.toString(a));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{
				5,4,3,2,1
		};
		sort(a);
	}

}
