package com.Algorithm;

import java.util.Arrays;

/**
 * 
 * @ClassName ShellSort.java
 * @Description TODO(希尔排序)
 * @author william
 * @date 2015年3月2日
 * @rull
 * 1.将n个元素的数组分成n/2个数字列，第1个和第n/2+1个数为一组
 * 2.一次排序使每个组排好循序
 * 3.再分n/4个组，再次排序
 * 4.不断重复1,2,3步，最后变成一个组，完成排序
 */
public class ShellSort {
	public static void sort(int[] a){
		if((a==null)||(a.length==0))
	        return;
		System.out.println("排序原始数组："+Arrays.toString(a));
		int x=0;
		for(int r=a.length/2;r>=1;r/=2)
		{
			for(int i=r;i<a.length;i++)
			{
				int temp = a[i];
				int j=i-r;
				while(j>=0&&temp<a[j])
				{
					a[j+r] = a[j];
					j-=r;
				}
				a[j+r]=temp;
			}
			x++;
			System.out.println("第"+(x)+"次排序结果："+Arrays.toString(a));

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
