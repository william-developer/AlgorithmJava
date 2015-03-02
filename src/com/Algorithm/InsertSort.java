package com.Algorithm;

import java.util.Arrays;

/**
 * 
 * @ClassName InsertSort.java
 * @Description TODO(选择排序)
 * @author william
 * @date 2015年3月2日
 * @rule
 * 1.首先对数组的前两个数据从小到大排序。
 * 2.将第三个数插入到排好序的队列中的合适位置
 * 3.将第四个数插入的之前的有序队列
 * 4.重复第三步，直到最后一个数
 * 复杂度：平均（O(n*n)）,最坏（O(n*n)）
 */
public class InsertSort {
	public static void sort(int[] a){
		if((a==null)||(a.length==0))
	        return;
		System.out.println("排序原始数组："+Arrays.toString(a));
		int m,j;
		for(int i=1;i<a.length;i++)
		{
			m = a[i];
			j = i-1;
			while(j>=0&&m<a[j]){
				a[j+1] = a[j];
				j--;
			}
			a[j+1]=m;
			System.out.println("第"+i+"次排序结果："+Arrays.toString(a));
		}
	}
	public static void main(String args[]){
		int[] a = new int[]{
				5,4,3,2,1
		};
		sort(a);
	}
}
