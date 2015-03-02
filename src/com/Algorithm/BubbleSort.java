package com.Algorithm;

import java.util.Arrays;
/**
 * 
 * @ClassName: BubbleSort
 * @Description: TODO(冒泡排序)
 * @author william
 * @date Feb 2, 2015 2:43:29 PM
 * @rule
 * 1.比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * 3.针对所有的元素重复以上的步骤，除了最后一个。
 * 4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * 冒泡排序最好的时间复杂度为O(n)
 * 冒泡排序的最坏时间复杂度为O(n*n)
 * 平均复杂度O(n*n)
 */
public class BubbleSort {
	public static void sort(int[] a){
		if((a==null)||(a.length==0))
	        return;
		System.out.println("排序原始数组："+Arrays.toString(a));
		for(int i=a.length-1;i>0;i--)
		{
			for(int j=0;j<i;j++) 
			{
			    if(a[j+1]<a[j])
				{
			    	a[j+1]=a[j+1]^a[j];
			    	a[j] = a[j+1]^a[j];
			    	a[j+1]=a[j+1]^a[j];
				}
				
			}
			System.out.println("第"+(a.length-i)+"次排序结果："+Arrays.toString(a));
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
