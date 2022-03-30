package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComTest {
	
	
	static int concatenate(List<String> arr) {
		
		List<List<Integer>> newValue = permute(arr);
		System.out.println(newValue.size());
		String newString = "";
		long newNumber=0;
		long max=Integer.MIN_VALUE;
		for(List<Integer> list : newValue){
			for(Integer list1 : list){
				newString=newString+list1;
				System.out.println(newString);
				newNumber=Long.parseLong(newString);
				max=Math.max(max, newNumber);
//				System.out.println(list);
			}
			
		}
		System.out.println(max);
		return 1;
	}
	
	
	public static List<List<Integer>> permute(List<String> num) {
        int n = num.size();
        if(num == null || num.size() == 0)
            return null;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> ini = new ArrayList<Integer>();
        ini.add(Integer.parseInt(num.get(0)));
        res.add(ini);
        if(num.size() == 1)
        {
        	return res;
        }
        else
        	res.clear();
//        int[] preArr = new int[n-1];
        List<String> preArr=new ArrayList<String>();
        for(int i = 0; i< n-1; i++)
        {
        	preArr.add(i, num.get(i));
        }
        
        List<List<Integer>> pre = permute(preArr);
        int last = Integer.parseInt(num.get(n-1));
        for(List<Integer> list : pre){
        	res.addAll(insert(last, list));
        }
        
        return res;
    }
    
    public static List<List<Integer>> insert(int n,  List<Integer> list)
    {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	for(int i = 0; i<=list.size(); i++)
    	{
    		List<Integer> temp = new ArrayList<Integer>();
    		temp.addAll(list);
    		temp.add(i, n);
    		res.add(temp);
    	}
    	return res;
    }
	
	
	public static void main(String[] args) {
//		List<String> arr = Arrays.asList("54", "546", "548", "60");
		List<String> arr = Arrays.asList("8", "1", "34", "3","98","9","76","45","4");
//		 printLargest(arr);
		 System.out.println(concatenate(arr));;
	}
}
