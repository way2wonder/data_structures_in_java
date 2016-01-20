package com.feifan.datastructures.arrays;

import java.util.Arrays;

import org.junit.Test;

import org.junit.Assert;

/**
 * Arrays类中的一些方法用法
 * @author zhy
 *
 */
public class ArraysTest {
   
	
	@Test
	public void test()
	{
		//equals(A,B)
		char[]  a =new char[]{'A','B','C'};
		char[]  b =new char[]{'A','C','B'};
		Assert.assertEquals(false, Arrays.equals(a, b));
		//fill(A,X)
		char[]  c = new char[2];
		Arrays.fill(c, 'A');
		Assert.assertArrayEquals(new char[]{'A','A'}, c);
		//copyOf(A, n)
		char[] d =Arrays.copyOf(a, 2);
		Assert.assertArrayEquals(new char[]{'A','B'}, d);
		//copyOfRange(A, s, t)
		char[] f =Arrays.copyOfRange(a, 1, 3);
		Assert.assertArrayEquals(new char[]{'B','C'}, f);
		//toString(A)
		
		//sort(A)
		Arrays.sort(b);
		Assert.assertArrayEquals(a, b);
		//binarySearch(A, x)
		//System.out.println(Arrays.binarySearch(a, 'C'));
		Assert.assertEquals(2,Arrays.binarySearch(a, 'C') );
	}
	
}
