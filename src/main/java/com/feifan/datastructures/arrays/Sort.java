package com.feifan.datastructures.arrays;

import org.junit.Assert;
import org.junit.Test;

public class Sort {
   //插入排序
	public static void insertSort(int[] arr)
	{
		int n= arr.length;
		for(int i=1;i<n;i++)
		{
			int cur = arr[i];
			int j = i;
			while(j>0 && cur < arr[j-1])
			{
				arr[j] =arr[j-1];
				j--;
			}
			arr[j]=cur;
		}
	}
	
	
	@Test
	public void sortTest()
	{
		int[] arr = new int[]{1,8,3,55,8,10,2};
		insertSort(arr);
		Assert.assertArrayEquals(new int[]{1,2,3,8,8,10,55}, arr);
	}
	
}
